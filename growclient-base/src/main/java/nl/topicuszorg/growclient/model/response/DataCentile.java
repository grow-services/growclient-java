package nl.topicuszorg.growclient.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import nl.topicuszorg.growclient.model.GrowChartVersion;

/**
 * Get data value response object
 *
 * @author Dries Schulten
 */
@XmlRootElement(name = "datacentile")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataCentile
{
	@XmlElement(name = "growchartversion")
	private GrowChartVersion growChartVersion;

	@XmlElement(name = "tow")
	private double tow;

	@XmlElement(name = "bmi")
	private double bmi;

	public GrowChartVersion getGrowChartVersion()
	{
		return growChartVersion;
	}

	public void setGrowChartVersion(GrowChartVersion growChartVersion)
	{
		this.growChartVersion = growChartVersion;
	}

	public double getTow()
	{
		return tow;
	}

	public void setTow(double tow)
	{
		this.tow = tow;
	}

	public double getBmi()
	{
		return bmi;
	}

	public void setBmi(double bmi)
	{
		this.bmi = bmi;
	}
}
