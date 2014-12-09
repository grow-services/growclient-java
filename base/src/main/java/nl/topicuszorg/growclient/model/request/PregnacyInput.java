package nl.topicuszorg.growclient.model.request;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nl.topicuszorg.growclient.util.LocalDateAdapter;

/**
 * Used to register a pregancy. Holds all the information needed.
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pregnacy")
public class PregnacyInput extends AbstractRequestData
{
	@XmlElement(name = "growchartversion")
	private String growchartVersion;

	@XmlElement(name = "maternalheight")
	private int maternalHeight;

	@XmlElement(name = "maternalwidth")
	private int maternalWidth;

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

	public String getGrowchartVersion()
	{
		return growchartVersion;
	}

	public void setGrowchartVersion(String growchartVersion)
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

	public int getMaternalWidth()
	{
		return maternalWidth;
	}

	public void setMaternalWidth(int maternalWidth)
	{
		this.maternalWidth = maternalWidth;
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
