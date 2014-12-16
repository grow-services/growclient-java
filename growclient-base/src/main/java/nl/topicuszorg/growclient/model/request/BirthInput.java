package nl.topicuszorg.growclient.model.request;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nl.topicuszorg.growclient.util.LocalDateAdapter;

/**
 * Used to register a birth.
 * 
 * @author Dries Schulten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "birth")
public class BirthInput extends AbstractRequestData
{
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate babyDob;

	private String birthGestation;

	private int birthWeight;

	private int babyGender;

	private String antenatalIugrDetection;

	public LocalDate getBabyDob()
	{
		return babyDob;
	}

	public void setBabyDob(LocalDate babyDob)
	{
		this.babyDob = babyDob;
	}

	public String getBirthGestation()
	{
		return birthGestation;
	}

	public void setBirthGestation(String birthGestation)
	{
		this.birthGestation = birthGestation;
	}

	public int getBirthWeight()
	{
		return birthWeight;
	}

	public void setBirthWeight(int birthWeight)
	{
		this.birthWeight = birthWeight;
	}

	public int getBabyGender()
	{
		return babyGender;
	}

	public void setBabyGender(int babyGender)
	{
		this.babyGender = babyGender;
	}

	public String getAntenatalIugrDetection()
	{
		return antenatalIugrDetection;
	}

	public void setAntenatalIugrDetection(String antenatalIugrDetection)
	{
		this.antenatalIugrDetection = antenatalIugrDetection;
	}
}
