package missonToMars;

import java.util.Scanner;

public class MissionToMars {
	private static Shuttle shuttle;
	private static Mission mission;
	private static EmploymentDeployment em_deployment;
	private static SelectionCriteria criteria;

	public MissionToMars() {
		shuttle = new Shuttle();
		mission = new Mission();
		em_deployment = new EmploymentDeployment();
		criteria = new SelectionCriteria();
	}

	public static void displayShuttle(Shuttle shuttle) {
		System.out.println("The information of the shuttle: \nShuttle name: " + shuttle.getS_name()
				+ "\nShuttle manufacturing year: " + shuttle.getS_manufact_year() + "\nShuttle fuel capacity: "
				+ shuttle.getS_fuel_capacity() + "\nShuttle passenger capacity: " + shuttle.getS_passenger_capacity()
				+ "\nShuttle cargo capacity: " + shuttle.getS_cargo_capacity() + "\nShuttle travle speed: "
				+ shuttle.getS_travel_speed() + "\nShuttle origin: " + shuttle.getS_origin()
				+ "\nPlease press enter to view the information of employment requirements.");
	}

	public static void displayEmploymentDeployment(EmploymentDeployment em_deployment) {
		System.out.println("The information of the employment requirements: \nEmployment requirements: "
				+ em_deployment.getEmpTitle() + "\nNumber required: " + em_deployment.getEmpReq());
	}

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		Shuttle shuttle1 = new Shuttle();
		displayShuttle(shuttle1);
		console.nextLine();
		EmploymentDeployment em_deployment1 = new EmploymentDeployment();
		displayEmploymentDeployment(em_deployment1);
		console.nextLine();
		System.out.println("Please create the selecting criteria: ");
		SelectionCriteria criteria1 = new SelectionCriteria();
		console.nextLine();
		System.out.println("Step 1: Please enter the health record criteria:");
		Scanner input=new Scanner(System.in);
		String record = input.nextLine();
		criteria1.setHealth_records(record);
		System.out.println("Step2: Please input the maximum age required: ");
		Scanner input1=new Scanner(System.in);
		int maxAge = input1.nextInt();
		criteria1.setMaxAge(maxAge);
		System.out.println("Please input the minimum age required: ");
		Scanner input2=new Scanner(System.in);
		int minAge = input2.nextInt();
		criteria1.setMinAge(minAge);
		System.out.println("Step3: Please input the years of experience required: ");
		Scanner input3=new Scanner(System.in);
		int years = input3.nextInt();
		criteria1.setYears_of_work_experience(years);
		System.out.println("Here is the selection criteria: \na.Range of age: " + criteria1.getMinAge() + "-" + criteria1.getMaxAge()
				+ "\nb.Years of experience: " + criteria1.getYears_of_work_experience()
				+ "\nc.Health record: " + criteria1.getHealth_records());
		boolean a = true;
		while(a)
		{
			System.out.println("Do you want to add or remove criterias? Please enter a for adding criterias, "
					+ "r for removing or n for doing nothing and save the criterias");
			Scanner input4 = new Scanner(System.in);
			String selection = input4.nextLine();
			if (selection.equals("a") || selection.equals("A")) 
			{
				boolean b = true;
				while(b)
				{
					System.out.println("Please select the criterias you want to add by enter the letter number: "
							+ "\na.Range of age\nb.Qualification\nc.Years of work experience\nd.Occupations\ne.Health records\nf.Criminal records"
							+ "\ng.Computer skills\nh.Language spoken");
					Scanner input5 = new Scanner(System.in);
					String option = input5.nextLine();
					if (option.equals("a") || option.equals("A")) {
						System.out.println("Please input the maximum age required: ");
						Scanner input6 = new Scanner(System.in);
						int maxAge1 = input6.nextInt();
						criteria1.setMaxAge(maxAge1);
						System.out.println("Please input the minimum age required: ");						
						Scanner input7 = new Scanner(System.in);
						int minAge1 = input7.nextInt();
						criteria1.setMinAge(minAge1);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("b") || option.equals("B")) {
						System.out.println("Please input the qualification required: ");
						Scanner input8 = new Scanner(System.in);
						String qualification = input8.nextLine();
						criteria1.setQualification(qualification);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("c") || option.equals("C")) {
						System.out.println("Please input the years of experience required: ");
						Scanner input9 = new Scanner(System.in);
						int years1 = input9.nextInt();
						criteria1.setYears_of_work_experience(years1);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("d") || option.equals("D")) {
						System.out.println("Please input the occupations required: ");
						Scanner input10 = new Scanner(System.in);
						String occupation = input10.nextLine();
						criteria1.setOccupation(occupation);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("e") || option.equals("E")) {
						System.out.println("Please enter the health record criteria:");
						Scanner input11 = new Scanner(System.in);
						String record1 = input11.nextLine();
						criteria1.setHealth_records(record1);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("f") || option.equals("F")) {
						System.out.println("Please enter the criminal record criteria:");
						Scanner input12 = new Scanner(System.in);
						String record2 = input12.nextLine();
						criteria1.setCriminal_records(record2);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("g") || option.equals("G")) {
						System.out.println("Please enter the computer skills criteria:");
						Scanner input13 = new Scanner(System.in);
						String skill = input13.nextLine();
						criteria1.setComputer_skills(skill);
						System.out.println("Criterias added successfully");
						b = false;
					} else if (option.equals("h") || option.equals("H")) {
						System.out.println("Please enter the language spoken criteria:");
						Scanner input14 = new Scanner(System.in);
						String language = input14.nextLine();
						criteria1.setLanguage(language);
						System.out.println("Criterias added successfully");
						b = false;
					} else {
						System.out.println("The input is invalid. Please input again");
					}
				}
				System.out.println("Here is the selection criteria: \na.Range of age: " + criteria1.getMinAge() + "-" + criteria1.getMaxAge()
				+ "\nb.Qualifications: " + criteria1.getQualification() + "\nc.Years of experience: " + criteria1.getYears_of_work_experience()
				+ "\nd.Occupations: " + criteria1.getOccupation() + "\ne.Health record: " + criteria1.getHealth_records() 
				+ "\nf.Criminal record: " + criteria1.getCriminal_records() + "\ng.Computer skills: " + criteria1.getComputer_skills()
				+ "\ng.Language: " + criteria1.getLanguage());
				System.out.println("Do you want to make more change for the criteria? y or n");
				Scanner input15 = new Scanner(System.in);
				String choice = input15.nextLine();
				if(choice.equals("y") || choice.equals("Y"))
				{
					a = true;
				}
				else if (choice.equals("n") || choice.equals("N"))
				{
					a = false;
				}
			}
			else if(selection.equals("r") || selection.equals("R"))
			{
				boolean c = true;
				while(c) 
				{
					System.out.println("Please select the criterias you want to remove by enter the letter number: "
							+ "\na.Range of age\nb.Qualification\nc.Years of work experience\nd.Occupations\ne.Health records\nf.Criminal records"
							+ "\ng.Computer skills\nh.Language spoken");
					Scanner input15 = new Scanner(System.in);
					String option1 = input15.nextLine();
					if (option1.equals("a") || option1.equals("A")) {
						criteria1.setMaxAge(0);
						criteria1.setMinAge(0);
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("b") || option1.equals("B")) {
						criteria1.setQualification("Undefined");
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("c") || option1.equals("C")) {
						criteria1.setYears_of_work_experience(0);
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("d") || option1.equals("D")) {
						criteria1.setOccupation("Undefined");
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("e") || option1.equals("E")) {
						criteria1.setHealth_records("Undefined");
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("f") || option1.equals("F")) {
						criteria1.setCriminal_records("Undefined");
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("g") || option1.equals("G")) {
						criteria1.setComputer_skills("Undefined");
						System.out.println("Criterias removed successfully");
						c = false;
					} else if (option1.equals("h") || option1.equals("H")) {
						criteria1.setLanguage("Undefined");
						System.out.println("Criterias removed successfully");
						c = false;
					} else {
						System.out.println("The input is invalid. Please input again");
					}
				}
				System.out.println("Here is the selection criteria: \na.Range of age: " + criteria1.getMinAge() + "-" + criteria1.getMaxAge()
				+ "\nb.Qualifications: " + criteria1.getQualification() + "\nc.Years of experience: " + criteria1.getYears_of_work_experience()
				+ "\nd.Occupations: " + criteria1.getOccupation() + "\ne.Health record: " + criteria1.getHealth_records() 
				+ "\nf.Criminal record: " + criteria1.getCriminal_records() + "\ng.Computer skills: " + criteria1.getComputer_skills()
				+ "\ng.Language: " + criteria1.getLanguage());
				System.out.println("Do you want to make more change for the criteria? y or n");
				Scanner input16 = new Scanner(System.in);
				String choice2 = input16.nextLine();
				if(choice2.equals("y") || choice2.equals("Y"))
				{
					a = true;
				}
				else if (choice2.equals("n") || choice2.equals("N"))
				{
					a = false;
				}
			}
			else if (selection.equals("n") || selection.equals("N"))
			{				
				a = false;
			}
		}
		System.out.println("You have finished creating selection criteria");
	}
}