package nl.topicuszorg.growclient.model.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Measurement types
 * 
 * @author Dries Schulten
 */
@XmlEnum(String.class)
public enum MeasurementType
{
	/** */
	@XmlEnumValue("EFW")
	EFW,
	/** */
	@XmlEnumValue("funalheight")
	FUNDAL_HEIGHT,
	/** */
	@XmlEnumValue("birthweight")
	BIRTH_WEIGHT;
}
