package missonToMars;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Mission {

        private String mission_name;
        private String mission_description;
        private String mission_destination;
        private String origin_country;
        private String allowed_country;
        private String coordinator_name;
        private String contact_info;
        private String job_name;
        private String job_description;
        private String employment_requirements_title;
        private int employment_requirements_number;
        private String cargo_requirements;
        private Date launchDate;
        private String destination_location;
        private int mission_duration;
        private String mission_status;
        private List<Mission> missions;

        public Mission() {
            mission_name = "";
            mission_description = "";
            mission_destination = "";
            origin_country = "";
            allowed_country = "";
            coordinator_name = "";
            contact_info = "";
            job_name = "";
            job_description = "";
            employment_requirements_title = "";
            employment_requirements_number = 0;
            cargo_requirements = "";
            launchDate = new Date();
            destination_location = "";
            mission_duration = 0;
            mission_status = "";
        }

    public Mission(String mission_name, String mission_description,
                   String mission_destination, String origin_country,
                   String allowed_country, String coordinator_name,
                   String contact_info, String job_name, String job_description,
                   String employment_requirements_title, int employment_requirements_number, String cargo_requirements,
                   Date lunch_date, String destination_location,
                   int mission_duration, String mission_status) {
        this.mission_name = mission_name;
        this.mission_description = mission_description;
        this.mission_destination = mission_destination;
        this.origin_country = origin_country;
        this.allowed_country = allowed_country;
        this.coordinator_name = coordinator_name;
        this.contact_info = contact_info;
        this.job_name = job_name;
        this.job_description = job_description;
        this.employment_requirements_title = employment_requirements_title;
        this.employment_requirements_number = employment_requirements_number;
        this.cargo_requirements = cargo_requirements;
        this.launchDate = lunch_date;
        this.destination_location = destination_location;
        this.mission_duration = mission_duration;
        this.mission_status = mission_status;
    }

    public Mission(String data) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String[] infos = data.split(";");
        this.mission_name = infos[0];
        this.mission_description = infos[1];
        this.origin_country = infos[2];
        this.allowed_country = infos[3];
        this.coordinator_name = infos[4];
        this.contact_info = infos[5];
        this.job_name = infos[6];
        this.job_description = infos[7];
        this.employment_requirements_title = infos[8];
        this.employment_requirements_number = Integer.parseInt(infos[9]);
        this.cargo_requirements = infos[10];
        this.launchDate = format.parse(infos[11]);
        this.destination_location = infos[12];
        this.mission_duration = Integer.parseInt(infos[13]);
        this.mission_status = infos[14];
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public String getMission_description() {
        return mission_description;
    }

    public void setMission_description(String mission_description) {
        this.mission_description = mission_description;
    }

    public String getMission_destination() {
        return mission_destination;
    }

    public void setMission_destination(String mission_destination) {
        this.mission_destination = mission_destination;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public String getAllowed_country() {
        return allowed_country;
    }

    public void setAllowed_country(String allowed_country) {
        this.allowed_country = allowed_country;
    }

    public String getCoordinator_name() {
        return coordinator_name;
    }

    public void setCoordinator_name(String coordinator_name) {
        this.coordinator_name = coordinator_name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getEmployment_requirements_title() {
        return employment_requirements_title;
    }

    public void setEmployment_requirements_title(String employment_requirements_title) {
        this.employment_requirements_title = employment_requirements_title;
    }

    public int getEmployment_requirements_number() {
    	return employment_requirements_number;
    }
    
    public void setEmployment_requirements_number(int employment_requirements_number) {
    	this.employment_requirements_number = employment_requirements_number;
    }
    public String getCargo_requirements() {
        return cargo_requirements;
    }

    public void setCargo_requirements(String cargo_requirements) {
        this.cargo_requirements = cargo_requirements;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public String getFormatLaunchDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String convert;
        try {
            convert = format.format(launchDate);
        } catch (Exception e) {
            return "";
        }
        return convert;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public String getDestination_location() {
        return destination_location;
    }

    public void setDestination_location(String destination_location) {
        this.destination_location = destination_location;
    }

    public int getMission_duration() {
        return mission_duration;
    }

    public void setMission_duration(int mission_duration) {
        this.mission_duration = mission_duration;
    }

    public String getMission_status() {
        return mission_status;
    }

    public void setMission_status(String mission_status) {
        this.mission_status = mission_status;
    }


    @Override
    public String toString() {
        return "Mission Name: "+ mission_name + ';' +
                "Mission Description: " +mission_description + ';' +
                "Mission Destination: " + mission_destination + ';' +
                "Origin Country: " + origin_country + ';' +
                "Allowed Country: " + allowed_country + ';' +
                "Coordinator's Name: " + coordinator_name + ';' +
                "Contact Information: " + contact_info + ';' +
                "Job Name: " + job_name + ';' +
                "Job Description: " + job_description + ';' +
                "Employment Requirement: " + employment_requirements_title + ';' + employment_requirements_number +
                "Cargo Requirements: " + cargo_requirements + ';' +
                "Launch Date: " + getFormatLaunchDate() + ';' +
                "Destination Location: " + destination_location + ';' +
                "Duration of the Mission: " + mission_duration + ';' +
                "Mission Status: " + mission_status + ';';
    }

    public String showConfirmInfo() {
        return "Mission Name: "+ mission_name + '\n' +
                "Mission Description: " +mission_description + '\n' +
                "Mission Destination: " + mission_destination + '\n' +
                "Origin Country: " + origin_country + '\n' +
                "Allowed Country: " + allowed_country + '\n' +
                "Coordinator's Name: " + coordinator_name + '\n' +
                "Contact Information: " + contact_info + '\n' +
                "Job Name: " + job_name + '\n' +
                "Job Description: " + job_description + ';' +
                "Employment Requirement: " + employment_requirements_title + employment_requirements_number + '\n' +
                "Cargo Requirements: " + cargo_requirements + '\n' +
                "Launch Date: " + getFormatLaunchDate() + '\n' +
                "Destination Location: " + destination_location + '\n' +
                "Duration of the Mission: " + mission_duration + '\n' +
                "Mission Status: " + mission_status + '\n';
    }

    public String writeFileInfo(){
            return  mission_name + ';' +
                    mission_description + ';' +
                    mission_destination + ';' +
                    origin_country + ';' +
                    allowed_country + ';' +
                    coordinator_name + ';' +
                    contact_info + ';' +
                    job_name + ';' +
                    job_description + ';' +
                    employment_requirements_title + ';' + employment_requirements_number + ';' +
                    cargo_requirements + ';' +
                    getFormatLaunchDate() + ';' +
                    destination_location + ';' +
                    mission_duration + ';' +
                    mission_status + ';';
    }

    //f1 - display all missions
    public void displayMissions(){
        missions = readMissionFile(new File("missions.txt"));
        if (missions==null||missions.size()==0){
            System.out.println("Please create mission first.");
            displayCoordinatorMenu();
        }
        System.out.println(missions);
        System.out.println("Enter R to return or enter E to exit.");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();
        if (choose.equalsIgnoreCase("R")){
            displayCoordinatorMenu();
        }else if (choose.equalsIgnoreCase("E")){
            System.exit(0);
        }else {
            System.exit(0);
        }
    }
    //f1 - read mission file
    private List<Mission> readMissionFile(File file) {
        List<Mission> missions = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),
                    "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                Mission mission=new Mission(line);
                if (mission!=null)
                    missions.add(mission);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("read errors :" + e);
        }
        return missions;
    }

    //f1 - creating a mission
    public void createMission() {
        System.out.println("Please enter mission name:");
        Mission mission = new Mission();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        mission.setMission_name(name);
        System.out.println("Please enter mission description:");
        String description = scanner.nextLine();
        mission.setMission_destination(description);
        System.out.println("Please enter country of origin:");
        String origin = scanner.nextLine();
        mission.setOrigin_country(origin);
        System.out.println("Please enter countries allowed:");
        String allowed = scanner.nextLine();
        mission.setAllowed_country(allowed);
        System.out.println("Please enter coordinators name:");
        String coordinator = scanner.nextLine();
        mission.setCoordinator_name(coordinator);
        System.out.println("Please enter  contact information:");
        String information = scanner.nextLine();
        mission.setContact_info(information);
        System.out.println("Please enter job name:");
        String jobName = scanner.nextLine();
        mission.setJob_name(jobName);
        System.out.println("Please enter job description:");
        String jobDescription = scanner.nextLine();
        mission.setJob_description(jobDescription);
        System.out.println("Please enter employment requirements:");
        scanner.nextLine();
        System.out.println("Please enter the title:");
        String title = scanner.nextLine();
        mission.setEmployment_requirements_title(title);
        System.out.println("Please enter the number required:");
        int number = scanner.nextInt();
        mission.setEmployment_requirements_number(number);
        System.out.println("Please enter cargo requirements:");
        String cargoRequirements = scanner.nextLine();
        mission.setCargo_requirements(cargoRequirements);
        System.out.println("Please enter launch date(yyyyMMdd):");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String launchDate = scanner.nextLine();
        try {
            mission.setLaunchDate(format.parse(launchDate));
        } catch (ParseException e) {

        }
        System.out.println("Please enter location:");
        String location = scanner.nextLine();
        mission.setDestination_location(location);
        System.out.println("Please enter duration of the mission:");
        int duration = scanner.nextInt();
        mission.setMission_duration(duration);
        mission.setMission_status(chooseMissionStatus());
        System.out.println();
        System.out.println("Mission Information Confirm:");
        System.out.println("**************************************");
        System.out.println(mission.showConfirmInfo());
        System.out.println("**************************************");
        System.out.println("Are you sure create the mission:(Y/N)");
        Scanner scanner1=new Scanner(System.in);
        String confirm = scanner1.next();
        if (confirm.equalsIgnoreCase("Y")){
            writeFile(mission.writeFileInfo(), "missions.txt");
            System.out.println("The mission has created.");
            displayCoordinatorMenu();
        }else if (confirm.equalsIgnoreCase("N")){
            createMission();
        }else {
            createMission();
        }

    }

    //F1 - choose the status of the mission
    private String chooseMissionStatus() {
        System.out.println("Please enter status of the mission:default a");
        System.out.println(" a. Planning phase");
        System.out.println(" b. Departed Earth");
        System.out.println(" c. Landed on Mars");
        System.out.println(" d. Mission in progress");
        System.out.println(" e. Returned to Earth");
        System.out.println(" f. Mission completed");
        Scanner scanner = new Scanner(System.in);
        String status = scanner.next();
        if (status.equalsIgnoreCase("a")){
            return "Planning phase";
        }else if (status.equalsIgnoreCase("b")){
            return "Departed Earth";
        }else if (status.equalsIgnoreCase("c")){
            return "Landed on Mars";
        }else if (status.equalsIgnoreCase("d")){
            return "Mission in progress";
        }else if (status.equalsIgnoreCase("e")){
            return "Returned to Earth";
        }else if (status.equalsIgnoreCase("f")){
            return "Mission completed";
        }else {
            return "Planning phase";
        }

    }

    private static void writeFile(String outputs, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path)),
                    "UTF-8"));
            bw.write(outputs);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.err.println("write errors :" + e);
        }
    }

    //f1 - display coordinators menu (if needed)
    public void displayCoordinatorMenu() {
        System.out.println("\f");
        System.out.println("--------------------------------");
        System.out.println("-                              -");
        System.out.println("-   Coordinator Menu Screen    -");
        System.out.println("-                              -");
        System.out.println("--------------------------------");

        System.out.println("[Mission Coordinator]");
        System.out.println("[1] Create a mission\n" +
                "\n" +
                "[2] Display Missions\n" +
                "\n" +
                "[0] exit\n" +
                "\n" +
                "Please enter one option (eg. Create)");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean proceed = true;
        while (proceed) {
            switch (input) {
                case "1":
                    createMission();
                    proceed = false;
                    break;
                case "2":
                    displayMissions();
                    proceed = false;
                    break;
                case "0":

                default:
                    System.out.println("Invalid option! Please choose 'Create Mission' or 'Display Mission'.");
                    break;
            }
        }
    }


}