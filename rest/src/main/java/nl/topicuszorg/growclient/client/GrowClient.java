package nl.topicuszorg.growclient.client;

import javax.ws.rs.Path;

import nl.topicuszorg.growclient.model.request.Pregnacy;

/**
 * Grow REST proxy based client
 * 
 * @author Dries Schulten
 */
@Path("/api/grow/xml")
public interface GrowClient
{
	/**
	 * Register a pregnacy in the system
	 * 
	 * @param pregnacy
	 *            the pregnacy params
	 */
	@Path("/registerPregnancy/")
	public void registerPregnancy(Pregnacy pregnacy);
}
