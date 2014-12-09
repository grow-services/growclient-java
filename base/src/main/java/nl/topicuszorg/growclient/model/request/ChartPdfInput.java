package nl.topicuszorg.growclient.model.request;

import java.time.LocalDate;

/**
 * Used to request a PDF version of a growchart.
 * 
 * @author Dries Schulten
 */
public class ChartPdfInput extends PregnacyInput
{
	private String firstName;

	private String surname;

	private LocalDate maternalDob;

	private String maternalReference;

	private String babyName;

	private int babyGender;

	private String babyGestation;

	private int babyBirthWeight;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public LocalDate getMaternalDob()
	{
		return maternalDob;
	}

	public void setMaternalDob(LocalDate maternalDob)
	{
		this.maternalDob = maternalDob;
	}

	public String getMaternalReference()
	{
		return maternalReference;
	}

	public void setMaternalReference(String maternalReference)
	{
		this.maternalReference = maternalReference;
	}

	public String getBabyName()
	{
		return babyName;
	}

	public void setBabyName(String babyName)
	{
		this.babyName = babyName;
	}

	public int getBabyGender()
	{
		return babyGender;
	}

	public void setBabyGender(int babyGender)
	{
		this.babyGender = babyGender;
	}

	public String getBabyGestation()
	{
		return babyGestation;
	}

	public void setBabyGestation(String babyGestation)
	{
		this.babyGestation = babyGestation;
	}

	public int getBabyBirthWeight()
	{
		return babyBirthWeight;
	}

	public void setBabyBirthWeight(int babyBirthWeight)
	{
		this.babyBirthWeight = babyBirthWeight;
	}
}
