import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotTest {
	
	
	@Test
	
	public void shouldAcceptOil() {
	Robot underTest = new Robot("name", "description",50,50);
	underTest.oilAllRobots();
	int oil = underTest.getHealth();
	assertEquals(oil, 65);
	}

}
