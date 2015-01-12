package nl.topicuszorg.growclient.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * GROW chart versions available
 *
 * @author Dries Schulten
 */
@XmlEnum(String.class)
public enum GrowChartVersion
{
	/** */
	@XmlEnumValue("NL2013")
	NL2013,
	/** */
	@XmlEnumValue("UK2014")
	UK2014,
	/** */
	@XmlEnumValue("NZ2014")
	NZ2014
}
