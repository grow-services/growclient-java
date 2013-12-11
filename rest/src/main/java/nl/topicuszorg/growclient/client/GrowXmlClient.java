package nl.topicuszorg.growclient.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.topicuszorg.growclient.model.request.*;
import nl.topicuszorg.growclient.model.response.DataCentile;
import nl.topicuszorg.growclient.model.response.GrowChart;
import nl.topicuszorg.growclient.model.response.GrowChartImage;
import nl.topicuszorg.growclient.model.response.GrowChartPdf;

/**
 * Grow REST XML proxy based client
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

	/**
	 * Used to retrieve a PDF version of a chart
	 * 
	 * @param pdf
	 *            the input object containing the parameters to request a PDF chart
	 * @return te output PDF chart data
	 */
	@Path("/getPdf/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public GrowChartPdf getPdf(ChartPdfInput pdf);

	/**
	 * Used to get the data of a specific chart at a specific point in time
	 * 
	 * @param data
	 *            the input data object
	 * @return a filled data object
	 */
	@Path("/getData/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public DataCentile getData(DataCentileInput data);

	/**
	 * Register a birth in the system
	 * 
	 * @param birth
	 *            the input parameters for the birth
	 */
	@Path("/getData/")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	void registerBirth(BirthInput birth);
}
