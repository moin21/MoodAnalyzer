import org.junit.Assert;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;

/**
 * Class with Mood Analyzer Tests
 * @author Moinuddin
 *
 */
public class MoodAnalyzerTest {
	/**
	 * Method to check the sad mood. Provided string with sad then method should
	 * return sad. Used the assert equals to check if the method output is sad.
	 * 
	 */
	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
		Assert.assertEquals("Sad", actualResult);
	}

}