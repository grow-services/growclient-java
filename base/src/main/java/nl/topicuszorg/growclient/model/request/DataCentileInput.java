package nl.topicuszorg.growclient.model.request;

import nl.topicuszorg.growclient.util.DateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Get data call input.
 * 
 * @author Dries Schulten
 */
@XmlRootElement(name = "datacentile")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataCentileInput extends AbstractRequestData
{
	/** Optional: if empty the data of the request itself is used */
	@XmlElement(name = "requestdate")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date requestDate;

	public Date getRequestDate()
	{
		return requestDate;
	}

	public void setRequestDate(Date requestDate)
	{
		this.requestDate = requestDate;
	}
}
