package nl.topicuszorg.growclient.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * JAXB date adapter
 * 
 * @author Dries Schulten
 */
public class DateAdapter extends XmlAdapter<String, Date>
{
	private static final ThreadLocal<SimpleDateFormat> FORMATTER = new ThreadLocal<SimpleDateFormat>()
	{
		@Override
		protected SimpleDateFormat initialValue()
		{
			return new SimpleDateFormat("yyyyMMdd");
		}
	};

	@Override
	public Date unmarshal(String v) throws Exception
	{
		return FORMATTER.get().parse(v);
	}

	@Override
	public String marshal(Date v) throws Exception
	{
		return FORMATTER.get().format(v);
	}
}
