package nl.topicuszorg.growclient.client;

import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.client.proxy.WebResourceFactory;

/**
 * Grow proxy client builder
 * 
 * @author Dries Schulten
 */
public class GrowClientBuilder
{
	private static final String BASE_URL = "https://www.grow-services.net";

	private GrowClient client;

	/**
	 * @return a initialised grow charts proxy client
	 */
	public GrowClient getClient()
	{
		if (client == null)
		{
			createClient();
		}

		return client;
	}

	private void createClient()
	{
		ClientBuilder builder = ClientBuilder.newBuilder();

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
		client = WebResourceFactory.newResource(GrowClient.class, rsClient.target(BASE_URL));
	}
}
