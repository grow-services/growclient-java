package nl.topicuszorg.growclient.model.request;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nl.topicuszorg.growclient.model.GrowChartVersion;
import nl.topicuszorg.growclient.util.LocalDateAdapter;

/**
 * Used to register a pregnancy. Holds all the information needed.
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pregnancy")
public class PregnancyInput extends AbstractRequestData
{
	@XmlElement(name = "growchartversion")
	private GrowChartVersion growchartVersion;

	@XmlElement(name = "maternalheight")
	private int maternalHeight;

	@XmlElement(name = "maternalweight")
	private int maternalWeight;

	@XmlElement(name = "ethnicity")
	private String ethnicity;

	@XmlElement(name = "parity")
	private int parity;

	@XmlElement(name = "edd")
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate edd;

	@XmlElement(name = "requestdate")
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate requestDate;

	public GrowChartVersion getGrowchartVersion()
	{
		return growchartVersion;
	}

	public void setGrowchartVersion(GrowChartVersion growchartVersion)
	{
		this.growchartVersion = growchartVersion;
	}

	public int getMaternalHeight()
	{
		return maternalHeight;
	}

	public void setMaternalHeight(int maternalHeight)
	{
		this.maternalHeight = maternalHeight;
	}

	public int getMaternalWeight()
	{
		return maternalWeight;
	}

	public void setMaternalWeight(int maternalWeight)
	{
		this.maternalWeight = maternalWeight;
	}

	public String getEthnicity()
	{
		return ethnicity;
	}

	public void setEthnicity(String ethnicity)
	{
		this.ethnicity = ethnicity;
	}

	public int getParity()
	{
		return parity;
	}

	public void setParity(int parity)
	{
		this.parity = parity;
	}

	public LocalDate getEdd()
	{
		return edd;
	}

	public void setEdd(LocalDate edd)
	{
		this.edd = edd;
	}

	public LocalDate getRequestDate()
	{
		return requestDate;
	}

	public void setRequestDate(LocalDate requestDate)
	{
		this.requestDate = requestDate;
	}
}
