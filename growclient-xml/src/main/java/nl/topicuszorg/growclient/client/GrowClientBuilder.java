package nl.topicuszorg.growclient.client;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import nl.topicuszorg.growclient.GrowClientSettings;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.message.Message;

/**
 * Grow proxy client builder
 *
 * @author Dries Schulten
 */
public class GrowClientBuilder
{
	private static final String BASE_URL = "https://www.grow-services.net";

	private GrowXmlClient client;

	private Optional<List<Interceptor<? extends Message>>> inInterceptors = Optional.empty();

	private Optional<List<Interceptor<? extends Message>>> outInterceptors = Optional.empty();

	/**
	 * @return a initialised grow charts proxy client
	 */
	public GrowXmlClient getClient()
	{
		if (client == null)
		{
			// Check again in sync block if client still null
			synchronized (this)
			{
				if (client == null)
				{
					client = createClient();
				}
			}
		}

		return client;
	}

	private GrowXmlClient createClient()
	{
		if (!GrowClientSettings.isValid())
		{
			throw new IllegalStateException("No settings supplied, cannot create client");
		}

		// Request filter
		TokenRequestFilter filter = new TokenRequestFilter();

		JAXRSClientFactoryBean factoryBean = new JAXRSClientFactoryBean();

		factoryBean.setServiceClass(GrowXmlClient.class);
		factoryBean.setAddress(BASE_URL);
		factoryBean.setProviders(Collections.singletonList(filter));

		outInterceptors.ifPresent(factoryBean::setOutInterceptors);
		inInterceptors.ifPresent(factoryBean::setInInterceptors);

		// Construct proxy client
		return factoryBean.create(GrowXmlClient.class);
	}

	/**
	 * @param inInterceptors
	 * 		the interceptors to set for incoming messages (= responses)
	 */
	public void setInInterceptors(List<Interceptor<? extends Message>> inInterceptors)
	{
		this.inInterceptors = Optional.of(inInterceptors);
	}

	/**
	 * @param outInterceptors
	 * 		the interceptors to set for outgoing messages (= requests)
	 */
	public void setOutInterceptors(List<Interceptor<? extends Message>> outInterceptors)
	{
		this.outInterceptors = Optional.of(outInterceptors);
	}
}
