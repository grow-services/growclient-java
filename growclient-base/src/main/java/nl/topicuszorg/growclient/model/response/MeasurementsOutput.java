package nl.topicuszorg.growclient.model.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Add measurements response; returns the added measurements with an added 'uuid' field per measurement.
 *
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "measurements")
public class MeasurementsOutput
{
	@XmlElement
	private List<MeasurementResponse> measurements;

	public List<MeasurementResponse> getMeasurements()
	{
		return measurements;
	}

	public void setMeasurements(List<MeasurementResponse> measurements)
	{
		this.measurements = measurements;
	}
}
