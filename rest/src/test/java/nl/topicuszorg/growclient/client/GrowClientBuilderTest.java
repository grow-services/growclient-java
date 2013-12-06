package nl.topicuszorg.growclient.client;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Builder tests
 * 
 * @author schulten
 */
public class GrowClientBuilderTest
{
	/**
	 * Test client creation
	 */
	@Test
	public void testCreateClient()
	{
		GrowClientBuilder builder = new GrowClientBuilder();
		GrowClient client = builder.getClient();

		assertNotNull(client);
	}
}
