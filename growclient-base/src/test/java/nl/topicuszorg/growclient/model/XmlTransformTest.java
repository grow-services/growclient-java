package nl.topicuszorg.growclient.model;

import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import nl.topicuszorg.growclient.model.request.BirthInput;
import nl.topicuszorg.growclient.model.request.Measurement;
import nl.topicuszorg.growclient.model.request.MeasurementType;
import nl.topicuszorg.growclient.model.request.MeasurementsInput;
import nl.topicuszorg.growclient.model.request.PregnancyInput;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tries converting the domain object
 * 
 * @author Dries Schulten
 */
public class XmlTransformTest
{
	private static final Logger LOG = LoggerFactory.getLogger(XmlTransformTest.class);

	private static JAXBContext context;

	/**
	 * Setup JAXB context
	 * 
	 * @throws JAXBException
	 */
	@BeforeClass
	public static void setupContext() throws JAXBException
	{
		context = JAXBContext.newInstance(PregnancyInput.class, BirthInput.class, MeasurementsInput.class);
	}

	private void toXml(Object in, Writer out)
	{
		try
		{
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(in, out);
		}
		catch (JAXBException e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Transform pregnacy
	 */
	@Test
	public void testTransformPregnacy()
	{
		PregnancyInput pregnacy = new PregnancyInput();

		pregnacy.setEdd(LocalDate.now());
		pregnacy.setEthnicity("Nederlands");
		pregnacy.setMaternalHeight(100);
		pregnacy.setMaternalWeight(50);
		pregnacy.setParity(1);
		pregnacy.setRequestDate(LocalDate.now());

		StringWriter writer = new StringWriter();
		toXml(pregnacy, writer);

		LOG.info("PregnacyInput:\n" + writer);
	}

	/**
	 * Transform birth
	 */
	@Test
	public void testTransformBirth()
	{
		BirthInput birth = new BirthInput();

		birth.setAntenatalIugrDetection("t");
		birth.setBabyDob(LocalDate.now());
		birth.setBabyGender(0);
		birth.setBirthGestation("gest");
		birth.setBirthWeight(3200);

		StringWriter writer = new StringWriter();
		toXml(birth, writer);

		LOG.info("BirthInput:\n" + writer);
	}

	/**
	 * Transform measurements
	 */
	@Test
	public void testTransformMeasurements()
	{
		MeasurementsInput measurements = new MeasurementsInput();

		for (MeasurementType type : MeasurementType.values())
		{
			Measurement measurement = new Measurement();
			measurement.setType(type);
			measurement.setDate(LocalDate.now());
			measurement.setValue(type.ordinal());
			measurements.addMeasurement(measurement);
		}

		StringWriter writer = new StringWriter();
		toXml(measurements, writer);

		LOG.info("MeasurementsInput:\n" + writer);
	}
}
