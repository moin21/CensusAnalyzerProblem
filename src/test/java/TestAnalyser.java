
import org.junit.Test;

/**
 * Class for Test Cases.
 * @author Moinuddin
 *
 */
public class TestAnalyser {
	@Test
	public void testCensusAnalyser() {
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		analyser.loadData();
	}
}