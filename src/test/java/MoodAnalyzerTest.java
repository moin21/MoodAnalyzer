import org.junit.Assert;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;
import com.moodanalyzer.MoodAnalyzerException;

/**
 * Class with Mood Analyzer Tests
 * 
 * @author Moinuddin
 *
 */
public class MoodAnalyzerTest {

	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

	/**
	 * Method to check the sad mood. Provided string with sad then method should
	 * return sad. Used the assert equals to check if the method output is sad.
	 * 
	 * @throws MoodAnalyzerException - in case of null or empty mood: throws custom
	 *                               mood analyzer exception.
	 * 
	 */
	@Test
	public void givenMessage_IsSad_ShouldReturnSad() throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I am in Sad Mood");
		String actualResult = moodAnalyzer.analyseMood();
		Assert.assertEquals("Sad", actualResult);
	}

	/**
	 * Method to check the happy mood. Provided string with happy then method should
	 * return happy. Used the assert equals to check if the method output is happy.
	 * 
	 * @throws MoodAnalyzerException - in case of null or empty mood: throws custom
	 *                               mood analyzer exception.
	 * 
	 */
	@Test
	public void givenMessage_IsHappy_ShouldReturnHappy() throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I am in Happy Mood");
		String actualResult = moodAnalyzer.analyseMood();
		Assert.assertEquals("Happy", actualResult);
	}

	/**
	 * Method to check if any is present in string, it should return Happy. Used the
	 * assert equals to check if the method output is happy.
	 * 
	 * @throws MoodAnalyzerException - in case of null or empty mood: throws custom
	 *                               mood analyzer exception.
	 */
	@Test
	public void givenMessage_IsAny_ShouldReturnHappy() throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I am in Any Mood");
		String actualResult = moodAnalyzer.analyseMood();
		Assert.assertEquals("Happy", actualResult);
	}

	/**
	 * Method to check if mood is invalid. it should return Invalid Mood assert
	 * equals to check if the method output is Invalid Mood
	 * 
	 * @throws MoodAnalyzerException - in case of null or empty mood: throws custom
	 *                               mood analyzer exception.
	 */
	@Test
	public void givenMessage_IsInvalid_ShouldReturnHappy() throws MoodAnalyzerException {
		try {
			moodAnalyzer.setMessage(null);
			String actualResult = moodAnalyzer.analyseMood();
			Assert.assertEquals("Invalid Mood", actualResult);
		} catch (MoodAnalyzerException e) {
			System.out.println("Invalid Mood");
		}
	}
}