package carrefourDataUtility;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataUtilityTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerateString() {
		String uuid = UUID.randomUUID().toString();
		assertEquals(uuid,DataUtility.generateString());
	}

	@Test
	public void testGetRandomFloat() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomIdtrans() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomnumber() {
		fail("Not yet implemented");
	}

}
