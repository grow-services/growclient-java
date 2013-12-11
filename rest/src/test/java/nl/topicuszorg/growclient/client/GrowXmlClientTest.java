package nl.topicuszorg.growclient.client;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import nl.topicuszorg.growclient.model.request.ChartImageInput;
import nl.topicuszorg.growclient.model.request.MeasurementsInput;
import nl.topicuszorg.growclient.model.request.PregnacyInput;
import nl.topicuszorg.growclient.model.response.GrowChart;
import nl.topicuszorg.growclient.model.response.GrowChartImage;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;


/**
 * XML Client tests
 * 
 * @author Dries Schulten
 */
public class GrowXmlClientTest
{
	@Mock
	private GrowXmlClient client;

	/**
	 * Setup
	 */
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Test call register function
	 */
	@Test
	public void testRegisterPregancy()
	{
		GrowChart chart = new GrowChart();
		chart.setGrowChartId("1");
		chart.setGrowChartVersion("NL2013");

		when(client.registerPregnancy(notNull(PregnacyInput.class))).thenReturn(chart);

		PregnacyInput pregnacy = new PregnacyInput();
		pregnacy.setEdd(new Date());

		assertNotNull(client.registerPregnancy(pregnacy));
	}

	/**
	 * Adding measurements
	 */
	@Test
	public void testAddMeasurements()
	{
		client.addMeasurement(new MeasurementsInput());
		verify(client).addMeasurement(notNull(MeasurementsInput.class));
	}

	/**
	 * Get chart image
	 */
	@Test
	public void testGetChartImage()
	{
		ChartImageInput image = new ChartImageInput();
		image.setFirstName("Test");

		when(client.getChartImage(image)).thenReturn(new GrowChartImage());

		assertNotNull(client.getChartImage(image));
	}
}
