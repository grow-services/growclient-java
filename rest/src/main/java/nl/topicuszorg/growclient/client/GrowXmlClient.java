package nl.topicuszorg.growclient.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.topicuszorg.growclient.model.request.ChartImageInput;
import nl.topicuszorg.growclient.model.request.MeasurementsInput;
import nl.topicuszorg.growclient.model.request.PregnacyInput;
import nl.topicuszorg.growclient.model.response.GrowChart;
import nl.topicuszorg.growclient.model.response.GrowChartImage;

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
	public GrowChart registerPregnancy(PregnacyInput pregnacy);

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
	public void addMeasurement(MeasurementsInput measurements);

	/**
	 * Used to retrieve a chart image object based in the given input
	 * 
	 * @param image
	 *            the input object containing the parameters to generate a image
	 * @return the output image value
	 */
	@Path("/getChartImage/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public GrowChartImage getChartImage(ChartImageInput image);
}
