package nl.topicuszorg.growclient.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import nl.topicuszorg.growclient.model.request.Measurement;

/**
 * Measurment response object. Has an extra 'uuid' field compared to the measuremnt request object.
 *
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "measurement")
public class MeasurementResponse extends Measurement
{
	@XmlElement(name = "uuid")
	private String uuid;

	public String getUuid()
	{
		return uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}
}
