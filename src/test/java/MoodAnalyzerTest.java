import org.junit.Assert;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;

/**
 * Class with Mood Analyzer Tests
 * @author Moinuddin
 *
 */
public class MoodAnalyzerTest {

	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	/**
	 * Method to check the sad mood. Provided string with sad then method should
	 * return sad. Used the assert equals to check if the method output is sad.
	 * 
	 */
	@Test
	public void givenMessage_IsSad_ShouldReturnSad() {
		String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
		Assert.assertEquals("Sad", actualResult);
	}
	/**
	 * Method to check the happy mood. Provided string with happy then method should
	 * return happy. Used the assert equals to check if the method output is happy.
	 * 
	 */
	@Test
	public void givenMessage_IsHappy_ShouldReturnHappy() {
		String actualResult = moodAnalyzer.analyseMood("I am in Happy Mood");
		Assert.assertEquals("Happy", actualResult);
	}
}