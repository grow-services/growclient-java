package nl.topicuszorg.growclient.model.request;

import java.util.Date;

/**
 * Used to register a pregancy. Holds all the information needed.
 * 
 * @author Dries Schulten
 */
public class Pregnacy extends AbstractRequestData
{
	private String growchartVersion;

	private int maternalHeight;

	private int maternalWeight;

	private String ethnicity;

	private int parity;

	private Date edd;

	private Date requestDate;

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

	public Date getEdd()
	{
		return edd;
	}

	public void setEdd(Date edd)
	{
		this.edd = edd;
	}

	public Date getRequestDate()
	{
		return requestDate;
	}

	public void setRequestDate(Date requestDate)
	{
		this.requestDate = requestDate;
	}
}
