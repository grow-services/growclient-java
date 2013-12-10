package nl.topicuszorg.growclient;

/**
 * Client settings
 * 
 * @author Dries Schulten
 */
public final class GrowClientSettings
{
	private static String apiKey;

	private static String secret;

	/** No public constructor */
	private GrowClientSettings()
	{
	}

	public static String getApiKey()
	{
		return apiKey;
	}

	public static void setApiKey(String apiKey)
	{
		GrowClientSettings.apiKey = apiKey;
	}

	public static String getSecret()
	{
		return secret;
	}

	public static void setSecret(String secret)
	{
		GrowClientSettings.secret = secret;
	}

	/**
	 * @return if the suplied settings are valid
	 */
	public static boolean isValid()
	{
		return secret != null && apiKey != null;
	}
}
