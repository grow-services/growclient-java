package nl.topicuszorg.growclient.client;

import java.util.Collections;

import nl.topicuszorg.growclient.GrowClientSettings;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

/**
 * Grow proxy client builder
 *
 * @author Dries Schulten
 */
public class GrowClientBuilder
{
	private static final String BASE_URL = "https://www.grow-services.net";

	private GrowXmlClient client;

	/**
	 * @return a initialised grow charts proxy client
	 */
	public GrowXmlClient getClient()
	{
		if (client == null)
		{
			createClient();
		}

		return client;
	}

	private void createClient()
	{
		if (!GrowClientSettings.isValid())
		{
			throw new IllegalStateException("No settings supplied, cannot create client");
		}

		// Request filter
		TokenRequestFilter filter = new TokenRequestFilter();

		// Construct proxy client
		client = JAXRSClientFactory.create(BASE_URL, GrowXmlClient.class, Collections.singletonList(filter));
	}
}
