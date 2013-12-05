package nl.topicuszorg.growclient.model.request;

import java.util.Date;

/**
 * Chart input object. Used to request a chart.
 * 
 * @author Dries Schulten
 */
public class ChartImage extends AbstractRequestData
{
	private int width;

	private int height;

	private String format = "png";

	private String language;

	private String firstName;

	private String lastName;

	private Date maternalDob;

	private String maternalReference;

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

	public String getFormat()
	{
		return format;
	}

	public void setFormat(String format)
	{
		this.format = format;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
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

	public String getMaternalReference()
	{
		return maternalReference;
	}

	public void setMaternalReference(String maternalReference)
	{
		this.maternalReference = maternalReference;
	}
}
