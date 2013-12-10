package nl.topicuszorg.growclient.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Generates a security token based on the given API key and secret
 * 
 * @author Dries Schulten
 */
public class SecurityTokenGenator
{
	/**
	 * Generate the security token over the given parameters
	 * 
	 * @param apiKey
	 *            the API key to use
	 * @param secret
	 *            the seret to use
	 * @return a SHA-1 hash of the parameters
	 */
	public static String getToken(String apiKey, String secret)
	{
		return DigestUtils.sha1Hex(apiKey + secret);
	}
}
