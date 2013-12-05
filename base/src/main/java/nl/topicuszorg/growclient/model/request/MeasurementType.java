package nl.topicuszorg.growclient.model.request;

/**
 * Measurement types
 * 
 * @author Dries Schulten
 */
public enum MeasurementType
{
	/** */
	EFW("EFW"),
	/** */
	FUNDAL_HEIGHT("fundalheight"),
	/** */
	BIRTH_WEIGHT("birthweight");

	private final String type;

	/**
	 * Construct
	 * 
	 * @param type
	 *            the given type
	 */
	private MeasurementType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}
}
