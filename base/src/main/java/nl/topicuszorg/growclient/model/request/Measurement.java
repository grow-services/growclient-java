package nl.topicuszorg.growclient.model.request;

import java.util.Date;

/**
 * The data for adding a new measurement.
 * 
 * @author Dries Schulten
 */
public class Measurement extends AbstractRequestData
{
	private Date date;

	private MeasurementType type;

	private int measurement;

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
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

	public int getMeasurement()
	{
		return measurement;
	}

	public void setMeasurement(int measurement)
	{
		this.measurement = measurement;
	}
}
