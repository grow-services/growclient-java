package nl.topicuszorg.growclient.client;

import static org.junit.Assert.assertNotNull;

import java.util.Collections;

import nl.topicuszorg.growclient.GrowClientSettings;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.junit.Test;

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
		builder.setInInterceptors(Collections.singletonList(new LoggingInInterceptor()));
		builder.setOutInterceptors(Collections.singletonList(new LoggingOutInterceptor()));

		GrowXmlClient client = builder.getClient();

		assertNotNull(client);
	}
}
