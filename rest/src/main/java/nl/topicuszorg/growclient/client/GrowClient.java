package nl.topicuszorg.growclient.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.topicuszorg.growclient.model.request.Pregnacy;
import nl.topicuszorg.growclient.model.response.GrowChart;

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
	 * @return {@link GrowChart} only containing id and version fields
	 */
	@Path("/registerPregnancy/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public GrowChart registerPregnancy(Pregnacy pregnacy);
}
