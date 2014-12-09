package nl.topicuszorg.growclient.model.request;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nl.topicuszorg.growclient.util.LocalDateAdapter;

/**
 * Get data call input.
 * 
 * @author Dries Schulten
 */
@XmlRootElement(name = "datacentile")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataCentileInput extends AbstractRequestData
{
	/** Optional: if empty the date of the request itself is used */
	@XmlElement(name = "requestdate")
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate requestDate;

	public LocalDate getRequestDate()
	{
		return requestDate;
	}

	public void setRequestDate(LocalDate requestDate)
	{
		this.requestDate = requestDate;
	}
}
