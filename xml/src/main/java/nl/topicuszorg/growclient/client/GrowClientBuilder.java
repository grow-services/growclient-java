package nl.topicuszorg.growclient.client;

import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import nl.topicuszorg.growclient.GrowClientSettings;

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

		ClientBuilder builder = ClientBuilder.newBuilder();
		builder.register(TokenRequestFilter.class);

		try
		{
			builder.sslContext(SSLContext.getDefault());
		}
		catch (NoSuchAlgorithmException e)
		{
			throw new IllegalStateException("Cannot get default SSL context", e);
		}

		Client rsClient = builder.build();


		// Construct proxy client
		WebTarget target = rsClient.target(BASE_URL);
		client = target.request().get(GrowXmlClient.class);
	}
}
