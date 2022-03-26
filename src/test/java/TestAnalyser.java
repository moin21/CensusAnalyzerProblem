
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class for Test Cases.
 * 
 * @author Moinuddin
 *
 */
public class TestAnalyser {
	StateCensusAnalyser analyser = new StateCensusAnalyser();

	@Test
	public void testCensusAnalyser() throws InvalidFileException, InvalidDelimiter {

		analyser.loadData("src/main/resources/IndiaStateCensus.csv");
		assertEquals(true, analyser.checkData());
	}
	@Test
	public void CheckSadTest() throws InvalidFileException, InvalidDelimiter {
		analyser.loadData("src/main/resources/IndiaStateCensus.csv");
	}
	@Test
	public void CheckInvalidFormat() throws NumberFormatException, InvalidFileException, InvalidDelimiter {
		analyser.loadData("src/main/resources/IndiaStateCensus.csv");
	}
	@Test
	public void CheckInvalidDelimeter() throws NumberFormatException, InvalidFileException, InvalidDelimiter {
		analyser.loadData("src/main/resources/InvalidDelimeter.csv");
	}
}