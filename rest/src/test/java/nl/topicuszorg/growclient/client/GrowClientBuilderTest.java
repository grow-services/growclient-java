package nl.topicuszorg.growclient.client;

import nl.topicuszorg.growclient.GrowClientSettings;

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
		GrowClientSettings.setApiKey("key");
		GrowClientSettings.setSecret("secret");

		GrowClientBuilder builder = new GrowClientBuilder();
		GrowXmlClient client = builder.getClient();

		assertNotNull(client);
	}
}
