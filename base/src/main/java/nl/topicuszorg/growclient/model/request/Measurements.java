package nl.topicuszorg.growclient.model.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Measurement container
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "measurements")
public class Measurements extends AbstractRequestData
{
	@XmlElement
	private List<Measurement> measurements = new ArrayList<>();

	public List<Measurement> getMeasurements()
	{
		return measurements;
	}

	public void setMeasurements(List<Measurement> measurements)
	{
		this.measurements = measurements;
	}

	/**
	 * Adds a measurement to the collection
	 * 
	 * @param measurement
	 *            the measurement to add
	 */
	public void addMeasurement(Measurement measurement)
	{
		this.measurements.add(measurement);
	}
}
