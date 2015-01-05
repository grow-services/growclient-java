package nl.topicuszorg.growclient.model.request;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nl.topicuszorg.growclient.util.LocalDateAdapter;

/**
 * The data for adding a new measurement.
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "measurement")
public class Measurement
{
	@XmlElement
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate date;

	@XmlElement
	private MeasurementType type;

	@XmlElement
	private int value;

	@XmlElement(name = "uuid")
	private String uuid;

	public LocalDate getDate()
	{
		return date;
	}

	public void setDate(LocalDate date)
	{
		this.date = date;
	}

	public MeasurementType getType()
	{
		return type;
	}

	public void setType(MeasurementType type)
	{
		this.type = type;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public String getUuid()
	{
		return uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}
}
