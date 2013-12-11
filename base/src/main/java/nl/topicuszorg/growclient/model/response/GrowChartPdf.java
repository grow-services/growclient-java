package nl.topicuszorg.growclient.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Grow chart PDF response object
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "growchart")
public class GrowChartPdf extends GrowChartImage
{
	@XmlElement(name = "babyname")
	private String babyName;

	@XmlElement(name = "babygender")
	private String babyGender;

	@XmlElement(name = "babygestation")
	private int babyGestation;

	@XmlElement(name = "babybirthweight")
	private int babyBirthWeight;

	public String getBabyName()
	{
		return babyName;
	}

	public void setBabyName(String babyName)
	{
		this.babyName = babyName;
	}

	public String getBabyGender()
	{
		return babyGender;
	}

	public void setBabyGender(String babyGender)
	{
		this.babyGender = babyGender;
	}

	public int getBabyGestation()
	{
		return babyGestation;
	}

	public void setBabyGestation(int babyGestation)
	{
		this.babyGestation = babyGestation;
	}

	public int getBabyBirthWeight()
	{
		return babyBirthWeight;
	}

	public void setBabyBirthWeight(int babyBirthWeight)
	{
		this.babyBirthWeight = babyBirthWeight;
	}
}
