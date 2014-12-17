package nl.topicuszorg.growclient.client;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import nl.topicuszorg.growclient.GrowClientSettings;
import nl.topicuszorg.growclient.model.request.PregnancyInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.client.ClientRequestContext;
import java.io.IOException;

/**
 * Token filter tests
 * 
 * @author Dries Schulten
 */
public class TokenRequestFilterTest
{
	@Mock
	private ClientRequestContext clientRequestContext;

	TokenRequestFilter filter;

	/**
	 * Setup Mockito
	 */
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);

		GrowClientSettings.setApiKey("key");
		GrowClientSettings.setSecret("secret");

		filter = new TokenRequestFilter();
	}

	/**
	 * Token generation
	 * 
	 * @throws java.io.IOException
	 */
	@Test
	public void testGenerateToken() throws IOException
	{
		PregnancyInput pregnancyInput = new PregnancyInput();

		when(clientRequestContext.getEntity()).thenReturn(pregnancyInput);

		filter.filter(clientRequestContext);

		assertNotNull(pregnancyInput.getToken());
		assertNotNull(pregnancyInput.getLicenseKey());
	}

	/**
	 * Test whithout an applicable input obect
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGenerateTokenNoValidInput() throws IOException
	{
		Object data = new Object();

		when(clientRequestContext.getEntity()).thenReturn(data);

		filter.filter(clientRequestContext);
	}
}
