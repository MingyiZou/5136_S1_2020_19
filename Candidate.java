package missonToMars;

import java.util.Date;

public class Candidate {
	private String can_name;
	private Date can_DOB;
	private String can_address;
	private String can_nationality;
	private int can_ID;
	private String can_gender;
	private String can_allergies;
	private String can_food_prefere;
	private String can_work_experience;
	private String can_occupation;
	private String can_computer_skills;
	private String can_lang_spoken;
	private String can_healthRecord;
	private String can_criminalRecord;
	
	public Candidate()
	{
		can_name = "Unknown";
		can_DOB = null;
		can_address = "Unknown";
		can_nationality = "Unknown";
		can_ID = 0;
		can_gender = "Unknown";
		can_allergies = "Unknown";
		can_food_prefere = "Unknown";
		can_work_experience = "Unknown";
		can_occupation = "Unknown";
		can_computer_skills = "Unknown";
		can_lang_spoken = "Unknown";
		can_healthRecord = "Unknown";
		can_criminalRecord = "Unknown";
	}
	
	public String getCan_name()
	{
		return can_name;
	}
	
	public Date getCan_DOB()
	{
		return can_DOB;
	}
	
	public String getCan_address()
	{
		return can_address;
	}
	
	public String getCan_nationality()
	{
		return can_nationality;
	}
	
	public int getCan_ID()
	{
		return can_ID;
	}
	
	public String getCan_gender()
	{
		return can_gender;
	}
	
	public String getCan_allergies()
	{
		return can_allergies;
	}
	
	public String getCan_food_prefere()
	{
		return can_food_prefere;
	}
	
	public String getCan_work_experience()
	{
		return can_work_experience;
	}
	
	public String getCan_occupation()
	{
		return can_occupation;
	}
	
	public String getCan_computer_skills()
	{
		return can_computer_skills;
	}
	
	public String getCan_lang_spoken()
	{
		return can_lang_spoken;
	}
	
	public String getCan_healthRecord()
	{
		return can_healthRecord;
	}
	
	public String getCan_criminalRecord()
	{
		return can_criminalRecord;
	}
	
	public void setCan_name(String newCan_name)
	{
		can_name = newCan_name;
	}
	
	public void setCan_DOB(Date newCan_DOB)
	{
		can_DOB = newCan_DOB;
	}
	
	public void setCan_address(String newCan_address)
	{
		can_address = newCan_address;
	}
	
	public void setCan_nationality(String newCan_nationality)
	{
		can_nationality = newCan_nationality;
	}
	
	public void setCan_ID(int newCan_ID)
	{
		can_ID = newCan_ID;
	}
	
	public void setCan_gender(String newCan_gender)
	{
		can_gender = newCan_gender;
	}
	
	public void setCan_allergies(String newCan_allergies)
	{
		can_allergies = newCan_allergies;
	}
	
	public void setCan_food_prefere(String newCan_food_prefere)
	{
		can_food_prefere = newCan_food_prefere;
	}
	
	public void setCan_work_experience(String newCan_work_experience)
	{
		can_work_experience = newCan_work_experience;
	}
	
	public void setCan_occupation(String newCan_occupation)
	{
		can_occupation = newCan_occupation;
	}
	
	public void setCan_computer_skills(String newCan_computer_skills)
	{
		can_computer_skills = newCan_computer_skills;
	}
	
	public void setCan_lang_spoken(String newCan_lang_spoken)
	{
		can_lang_spoken = newCan_lang_spoken;
	}
	
	public void setCan_healthRecord(String newCan_HealthRecord)
	{
		can_healthRecord = newCan_HealthRecord;
	}
	
	public void setCan_criminalRecord(String newCan_CriminalRecord)
	{
		can_criminalRecord = newCan_CriminalRecord;
	}
	
}
