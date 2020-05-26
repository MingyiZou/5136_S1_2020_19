package missionToMars;

import java.util.Scanner;

public class mission {

	String m_name=null;
	String m_description=null;
	String m_destination=null;
	String OriCon=null;
	String AllowCon=null;
	String CoordiName=null;
	String ContactInfo=null;
	String LaunchDate=null;
	String m_status=null;
	String[] cargoRequire=null;
	String m_durarion=null;
public mission() {
		m_name=null;
		m_description=null;
		m_destination=null;
		OriCon=null;
		AllowCon=null;
		CoordiName=null;
		ContactInfo=null;
		LaunchDate=null;
		m_status=null;
		cargoRequire=null;
		m_durarion=null;
	}
public void SetMissionName() {
	Scanner input1=new Scanner(System.in);
	System.out.println("Please input the mission name");
	m_name=input1.nextLine();
	
	}

public void SetMissionDesc() {
	Scanner input2=new Scanner(System.in);
	System.out.println("Please input the mission Description");
	m_description=input2.nextLine();
	
}

public void SetOriCountry() {
	Scanner input3=new Scanner(System.in);
	System.out.println("Please input the Contry of Orgin");
	OriCon=input3.nextLine();
	
}
public void SetAllowCountry() {
	Scanner input4=new Scanner(System.in);
	System.out.println("Please input the Contry allowed");
	AllowCon=input4.nextLine();
	
}
public void SetCoordName() {
	Scanner input5=new Scanner(System.in);
	System.out.println("Please input the Coordinator's name");
	CoordiName=input5.nextLine();
}
public void SetContactInfo() {
	Scanner input6=new Scanner(System.in);
	System.out.println("Please input the Coordinator's contact information");
	ContactInfo=input6.nextLine();
}
public void SetLaunchDate() {
	Scanner input7=new Scanner(System.in);
	System.out.println("Please input the Launch Date");
	LaunchDate=input7.nextLine();
}
public void SetMissionStatus() {
	Scanner input8=new Scanner(System.in);
	System.out.println("Please input the Mission Status");
	m_status=input8.nextLine();
}

public void SetCargoRequir() {
	String requir1="For the journey";
	String requir2="For the mission";
	String requir3="For other missions";
	cargoRequire[0]=requir1;
	cargoRequire[1]=requir2;
	cargoRequire[2]=requir3;
}
public void SetMissionDurar() {
	Scanner input8=new Scanner(System.in);
	System.out.println("Please input the Mission Durarion");
	m_durarion=input8.nextLine();
}

public String GetMissionName() {
	return m_name;
	
}

public String GetMissionDescr() {
	return m_description;
}

public String GetMissionDestination() {
	return m_destination;
}

public String GetOrigCountry() {
	return OriCon;
}

public String GetAllowCountry() {
	return AllowCon;
	
}

public String GetCoordiname() {
	return CoordiName;
	
}

public String GetCoordiContact() {
	return ContactInfo;
	
}

public String GetLaunchDate() {
	
	return LaunchDate;
}

public String GetMissionStatus() {
	return m_status;
}
public String GetMissionDurartion() {
	
	return m_durarion;
}
public String[] GetCargoRequire() {
	
	return cargoRequire;
}
}