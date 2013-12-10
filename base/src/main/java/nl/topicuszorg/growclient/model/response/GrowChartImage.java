package nl.topicuszorg.growclient.model.response;

import nl.topicuszorg.growclient.util.DateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Grow chart image response object
 *
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "growchart")
public class GrowChartImage extends GrowChart
{
	@XmlElement(name = "width")
	private int width;

	@XmlElement(name = "height")
	private int height;

	@XmlElement(name = "language")
	private String language;

	@XmlElement(name = "format")
	private String format;

	@XmlElement(name = "firstname")
	private String firstName;

	@XmlElement(name = "lastname")
	private String lastName;

	@XmlElement(name = "maternaldob")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date maternalDob;

	@XmlElement(name = "url")
	private String url;

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getFormat()
	{
		return format;
	}

	public void setFormat(String format)
	{
		this.format = format;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Date getMaternalDob()
	{
		return maternalDob;
	}

	public void setMaternalDob(Date maternalDob)
	{
		this.maternalDob = maternalDob;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}
}
