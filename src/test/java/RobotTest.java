import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotTest {

	@Test
	public void shouldAcceptOiling() {
		Robot underTest = new Robot("name", "description", 50, 50);
		underTest.oilAllRobots();
		int oil = underTest.getHealth();
		assertEquals(oil, 65);
	}

	@Test
	public void shouldRust() {
		Robot underTest = new Robot("name", "description", 50, 50);
		underTest.tick();
		int rust = underTest.getHealth();
		assertEquals(rust, 50);

	}

}
