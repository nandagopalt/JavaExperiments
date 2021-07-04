import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {
	@Test
	public void testAdd() {
		String string = "JUnit is working fine";
		assertEquals("JUnit is working fine", string);
	}
}
