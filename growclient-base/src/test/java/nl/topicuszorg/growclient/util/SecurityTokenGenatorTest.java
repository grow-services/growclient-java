package nl.topicuszorg.growclient.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test the security token generator
 * 
 * @author Dries Schulten
 */
public class SecurityTokenGenatorTest
{
	private static final String TEST_KEY = "warg47aLgX";

	private static final String TEST_SECRET = "BGiYJZx8b0";

	/**
	 * Token generate, see: <a
	 * href="https://github.com/grow-services/developer-documentation/blob/master/src/service.md">docs token example</a>
	 */
	@Test
	public void testGetToken()
	{
		final String expected = "812982adbbfdcbf4c52bb1b07044510ed867d1b1";
		assertEquals(expected, SecurityTokenGenator.getToken(TEST_KEY, TEST_SECRET));
	}
}
