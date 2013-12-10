package nl.topicuszorg.growclient.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.topicuszorg.growclient.model.request.Measurements;
import nl.topicuszorg.growclient.model.request.Pregnacy;
import nl.topicuszorg.growclient.model.response.GrowChart;

/**
 * Grow REST proxy based client
 * 
 * @author Dries Schulten
 */
@Path("/api/grow/xml")
@XmlApiMethod
public interface GrowXmlClient
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
	@POST
	public GrowChart registerPregnancy(Pregnacy pregnacy);

	/**
	 * Used to register new measurements with an ongoing chart
	 * 
	 * @param measurements
	 *            the measurements to register
	 */
	@Path("/addMeasurement/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public void addMeasurement(Measurements measurements);
}
