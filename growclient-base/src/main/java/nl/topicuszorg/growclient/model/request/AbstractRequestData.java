package nl.topicuszorg.growclient.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Base data class contains fields that are the same in every request.
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AbstractRequestData
{
	@XmlAttribute(name = "growchartid")
	private String growchartId;

	@XmlElement(name = "licensekey")
	private String licenseKey;

	@XmlElement(name = "token")
	private String token;

	public String getGrowchartId()
	{
		return growchartId;
	}

	public void setGrowchartId(String growchartId)
	{
		this.growchartId = growchartId;
	}

	public String getLicenseKey()
	{
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey)
	{
		this.licenseKey = licenseKey;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}
}
