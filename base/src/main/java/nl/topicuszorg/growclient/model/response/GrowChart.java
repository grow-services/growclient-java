package nl.topicuszorg.growclient.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Grow chart response.
 * 
 * <pre>
 * &lt;growchart&gt;
 *   &lt;growchartid&gt;0000001&lt;/growchartid&gt;
 *   &lt;growversion&gt;NL2012&lt;/growversion&gt;
 * &lt;/growchart&gt;
 * </pre>
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "growchart")
public class GrowChart
{
	@XmlElement(name = "growchartid")
	private String growChartId;

	@XmlElement(name = "growchartversion")
	private String growChartVersion;

	public String getGrowChartId()
	{
		return growChartId;
	}

	public void setGrowChartId(String growChartId)
	{
		this.growChartId = growChartId;
	}

	public String getGrowChartVersion()
	{
		return growChartVersion;
	}

	public void setGrowChartVersion(String growChartVersion)
	{
		this.growChartVersion = growChartVersion;
	}
}
