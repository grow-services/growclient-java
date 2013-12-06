package nl.topicuszorg.growclient.model;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import nl.topicuszorg.growclient.model.request.Birth;
import nl.topicuszorg.growclient.model.request.Measurement;
import nl.topicuszorg.growclient.model.request.MeasurementType;
import nl.topicuszorg.growclient.model.request.Measurements;
import nl.topicuszorg.growclient.model.request.Pregnacy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

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
		context = JAXBContext.newInstance(Pregnacy.class, Birth.class, Measurements.class);
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
		Pregnacy pregnacy = new Pregnacy();

		pregnacy.setEdd(new Date());
		pregnacy.setEthnicity("Nederlands");
		pregnacy.setMaternalHeight(100);
		pregnacy.setMaternalWidth(50);
		pregnacy.setParity(1);
		pregnacy.setRequestDate(new Date());

		StringWriter writer = new StringWriter();
		toXml(pregnacy, writer);

		LOG.info("Pregnacy:\n" + writer);
	}

	/**
	 * Transform birth
	 */
	@Test
	public void testTransformBirth()
	{
		Birth birth = new Birth();

		birth.setAntenatalIugrDetection("t");
		birth.setBabyDob(new Date());
		birth.setBabyGender(0);
		birth.setBirthGestation("gest");
		birth.setBirthWeight(3200);

		StringWriter writer = new StringWriter();
		toXml(birth, writer);

		LOG.info("Birth:\n" + writer);
	}

	/**
	 * Transform measurements
	 */
	@Test
	public void testTransformMeasurements()
	{
		Measurements measurements = new Measurements();

		for (MeasurementType type : MeasurementType.values())
		{
			Measurement measurement = new Measurement();
			measurement.setType(type);
			measurement.setDate(new Date());
			measurement.setValue(type.ordinal());
			measurements.addMeasurement(measurement);
		}

		StringWriter writer = new StringWriter();
		toXml(measurements, writer);

		LOG.info("Measurements:\n" + writer);
	}
}
