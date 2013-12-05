package nl.topicuszorg.growclient.model.request;

/**
 * Base data class contains fields that are the same in every request.
 * 
 * @author Dries Schulten
 */
public abstract class AbstractRequestData
{
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
