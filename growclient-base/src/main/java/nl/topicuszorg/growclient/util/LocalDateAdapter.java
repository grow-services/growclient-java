package nl.topicuszorg.growclient.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * JAXB local date adapter
 *
 * @author Dries Schulten
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate>
{
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

	@Override
	public LocalDate unmarshal(String v) throws Exception
	{
		return LocalDate.parse(v, FORMATTER);
	}

	@Override
	public String marshal(LocalDate v) throws Exception
	{
		return FORMATTER.format(v);
	}
}
