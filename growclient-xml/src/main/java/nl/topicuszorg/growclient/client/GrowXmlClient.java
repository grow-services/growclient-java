package nl.topicuszorg.growclient.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.topicuszorg.growclient.model.request.BirthInput;
import nl.topicuszorg.growclient.model.request.ChartImageInput;
import nl.topicuszorg.growclient.model.request.ChartPdfInput;
import nl.topicuszorg.growclient.model.request.DataCentileInput;
import nl.topicuszorg.growclient.model.request.MeasurementsInput;
import nl.topicuszorg.growclient.model.request.PregnancyInput;
import nl.topicuszorg.growclient.model.response.DataCentile;
import nl.topicuszorg.growclient.model.response.GrowChart;
import nl.topicuszorg.growclient.model.response.GrowChartImage;
import nl.topicuszorg.growclient.model.response.GrowChartPdf;

/**
 * Grow REST XML proxy based client
 *
 * @author Dries Schulten
 */
@Path("/api/grow/v3/xml")
@XmlApiMethod
public interface GrowXmlClient
{
	/**
	 * Register a pregnacy in the system
	 *
	 * @param pregnacy
	 * 		the pregnacy params
	 * @return {@link GrowChart} only containing id and version fields
	 */
	@Path("/registerpregnancy/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public GrowChart registerPregnancy(PregnancyInput pregnacy);

	/**
	 * Used to register new measurements with an ongoing chart
	 *
	 * @param measurements
	 * 		the measurements to register
	 * @return added measurements
	 */
	@Path("/addmeasurement/")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	public MeasurementsInput addMeasurement(MeasurementsInput measurements);

	/**
	 * Delete a measurement with the given UUID from the system
	 *
	 * @param growChartId
	 * 		the GROW chart for this measurement
	 * @param measurementUuid
	 * 		the UUID of the measurement to delete
	 */
	@Path("/pregnancy/{growchartid}/measurement/{measurementuuid}?licensekey=myapikey&token=demotoken")
	@DELETE
	public void deleteMeasurement(@PathParam("growchartid") String growChartId, @PathParam("measurementuuid") String measurementUuid);

	/**
	 * Updates a existing measurment for the given chart
	 *
	 * @param growChartId
	 * 		the GROW chart
	 * @param measurementUuid
	 * 		the UUID of the measurement to update
	 * @param measurements
	 * 		the measurement input data
	 */
	@Path("/pregnancy/{growchartid}/measurement/{measurementuuid}?licensekey=myapikey&token=demotoken")
	@Consumes(MediaType.APPLICATION_XML)
	@PUT
	public void updateMeasurement(@PathParam("growchartid") String growChartId, @PathParam("measurementuuid") String measurementUuid, MeasurementsInput measurements);

	/**
	 * Used to retrieve a chart image object based in the given input
	 *
	 * @param image
	 * 		the input object containing the parameters to generate a image
	 * @return the output image value
	 */
	@Path("/getchartimage/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public GrowChartImage getChartImage(ChartImageInput image);

	/**
	 * Used to retrieve a PDF version of a chart
	 *
	 * @param pdf
	 * 		the input object containing the parameters to request a PDF chart
	 * @return te output PDF chart data
	 */
	@Path("/getpdf/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public GrowChartPdf getPdf(ChartPdfInput pdf);

	/**
	 * Used to get the data of a specific chart at a specific point in time
	 *
	 * @param data
	 * 		the input data object
	 * @return a filled data object
	 */
	@Path("/getdata/")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public DataCentile getData(DataCentileInput data);

	/**
	 * Register a birth in the system
	 *
	 * @param birth
	 * 		the input parameters for the birth
	 */
	@Path("/registerbirth/")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	void registerBirth(BirthInput birth);
}
