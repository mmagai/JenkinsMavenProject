package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		
		JenkinsCalculator jenkinsCalc = new JenkinsCalculator();
		assertEquals(10,jenkinsCalc.addNumbers(5, 5));
		
	}
	
	
	

}
