package nl.topicuszorg.growclient.client;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import nl.topicuszorg.growclient.GrowClientSettings;
import nl.topicuszorg.growclient.model.request.AbstractRequestData;
import nl.topicuszorg.growclient.util.SecurityTokenGenator;

/**
 * Request filter that adds the security token to the outgoing request
 * 
 * @author Dries Schulten
 */
@XmlApiMethod
public class TokenRequestFilter implements ClientRequestFilter
{
	@Override
	public void filter(ClientRequestContext requestContext) throws IOException
	{
		Object entity = requestContext.getEntity();
		if (entity != null && entity instanceof AbstractRequestData)
		{
			AbstractRequestData requestData = (AbstractRequestData) entity;

			String apiKey = GrowClientSettings.getApiKey();
			String token = SecurityTokenGenator.getToken(apiKey, GrowClientSettings.getSecret());

			requestData.setLicenseKey(apiKey);
			requestData.setToken(token);
		}
	}
}
