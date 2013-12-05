package nl.topicuszorg.growclient.model.request;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Base data class contains fields that are the same in every request.
 * 
 * @author Dries Schulten
 */
public abstract class AbstractRequestData
{
	@XmlAttribute(name = "growchartid")
	private String growchartId;

	public String getGrowchartId()
	{
		return growchartId;
	}

	public void setGrowchartId(String growchartId)
	{
		this.growchartId = growchartId;
	}
}
