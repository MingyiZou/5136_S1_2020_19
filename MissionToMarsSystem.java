package MissionToMars;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 public class MissionToMarsSystem {
     private static ArrayList<Shuttle> shuttles=new ArrayList<Shuttle>();
     private static ArrayList<Shuttle> selecteds=new ArrayList<Shuttle>();
     private static ArrayList<Mission> missions=new ArrayList<Mission>() ;
     private static SelectionCriteria criteria;
     private static ArrayList<String> se=new ArrayList<String>();
     private static CreatingCriteria criteria1;


     public static void main(String[] args) {
         shuttles = readShuttle.shuttleinfo("shuttle.txt");
         int id=-1;
         String name=null;
         while(true) {
             showLogin();
             Scanner sc=new Scanner(System.in);
             Userinterface uid= new userImpl();
             String choice = sc.nextLine();
            do {

                switch (choice) {
                    case "1":
                        System.out.println("-------------------Login------------------");
                        boolean flag=false;
                        int j=0;
                        do{
                            System.out.println("Please input your username");
                            name = sc.nextLine();
                            System.out.println("Please input your password");
                            String password = sc.nextLine();
                            flag = uid.isLogin(name, password);
                            id=uid.userRole(name,password);
                            if (flag==false)
                            {
                                System.out.println("Username or password error");
                                j++;
                            }
                            if(j==3)
                            {
                                System.out.println("ERROR Login 3 times,System is closing");
                                System.exit(0);
                            }
                        }
                        while(flag==false&&j<3);
                        boolean entry=false;
                        String sfilename=name+"shuttledata.txt";
                        fileExit(sfilename);
                        selecteds=readShuttle.shuttleinfo(sfilename);
                        if(id==2) {
                            System.out.println("Login successfully! Hello Coordinator "+name+" :)");
                        }
                        else if(id==1)
                        {
                            System.out.println("Login successfully! Hello Administrator "+name+" :)");
                        }
                        else{
                            System.out.println("Login successfully!  WELCOME USE MISSION TO MARS SYSTEM "+name+" :)");
                        }
                        String h=null;
                        String s1=null;
                        String s2=null;
                        String s3=null;
                        String s4=null;
                        do {
                            showList();
                            h = sc.nextLine();
                            switch (h) {
                                case "1":
                                    do {
                                        if (id == 2) {
                                            MMenuForC();
                                        } else if (id == 1) {
                                            MMenuForA();
                                        }
                                        else {
                                            nomalUser();
                                        }
                                            s1 = sc.nextLine();
                                         missions=Mission.readMissionFile("missions.txt");
                                            switch (s1) {

                                                case "3":
                                                    Mission.createMission("missions.txt");
                                                    break;
                                                case "1":
                                                    Mission.displayMissions("missions.txt");
                                                    break;
                                                case "2":

                                                    Mission.EditMission("missions.txt");
                                                    break;
                                                default:

                                                    break;
                                            }
                                        }
                                        while (!s1.equals("0")) ;
                                        break;
                                        case "2":
                                            do {
                                                if (id == 2||id == 1) {
                                                    SMenu();
                                                }
                                                else {
                                                    nomalUser();
                                                }
                                                s2 = sc.nextLine();
                                                switch (s2) {
                                                    case "1":
                                                        System.out.println("******************Shuttle Info******************");
                                                        readShuttle.showinfo(shuttles);
                                                        break;
                                                    case "2":
                                                        System.out.println("******************Shuttle Selection******************");
                                                        int selection = -1;
                                                        String a = null;
                                                        if (selecteds.size() != 0) {
                                                            System.out.println("Shuttle has been selected,do you want to delete?y/n");
                                                            Scanner sc2 = new Scanner(System.in);
                                                            a = sc2.nextLine();
                                                            if (a.equalsIgnoreCase("y")) {
                                                                for (int i = 0; i < selecteds.size(); i++) {
                                                                    selecteds.remove(i);
                                                                }
                                                                System.out.println("Shuttle selection has been deleted.");
                                                            }
                                                            if (a.equalsIgnoreCase("n")) {
                                                                System.out.println("Shuttle: "+selecteds.get(0).getS_name());
                                                            }
                                                        } else {
                                                            System.out.println("Please input the shuttle that you want to choose");
                                                            do {
                                                                selection = sc.nextInt();
                                                                if (selection > shuttles.size()) {
                                                                    System.out.println("Check the number");
                                                                }
                                                            } while (selection > shuttles.size());
                                                            selecteds.add(shuttles.get(selection - 1));
                                                            System.out.println("OK");
                                                            writeFile(readShuttle.readinfo(selecteds),name+"shuttledata.txt");
                                                            break;
                                                        }
                                                    default:
                                                        break;
                                                }
                                            } while (!s2.equals("0"));
                                            break;
                                        case "3":
                                            do {
                                                if (id == 2||id == 1) {
                                                    CMenu();
                                                }
                                                else {
                                                    nomalUser();
                                                }
                                                s3 = sc.nextLine();
                                                switch (s3) {
                                                    case "1":
                                                        System.out.println("******************SELECTED Shuttle INFO******************");
                                                        if (selecteds.size() == 0) {
                                                            System.out.println("Shuttle not selected");
                                                        } else {
                                                            readShuttle.showinfo(selecteds);
                                                        }
                                                        break;
                                                    case "2":
                                                        System.out.println("******************Employment Requirements******************");
                                                        do{
                                                            missions=Mission.displayMissions("missions.txt");
                                                        }while (missions.size() == 0);
                                                        if (missions.size() == 0) {
                                                            System.out.println("Employment requirements not set please back and create the mission");
                                                        } else {

                                                            System.out.println("The information of the employment requirements: \nEmployment title: "
                                                                    + missions.get(0).getEmployment_requirements_title() + "\nNumber required: " + missions.get(0).getEmployment_requirements_number());
                                                        }
                                                        break;
                                                    case "3":
                                                        System.out.println("******************Create Criteria******************");
                                                         CreatingCriteria criteria1 = new CreatingCriteria();
                                                        criteria = criteria1.create(name + "criteria.txt");
                                                        break;
                                                    default:

                                                        break;
                                                }
                                            } while (!s3.equals("0"));
                                            break;
                                        case "4":
                                            do {
                                                if (id == 2||id == 1) {
                                                    FMenu();
                                                }
                                                else {
                                                    nomalUser();
                                                }
                                                s4 = sc.nextLine();
                                                switch (s4) {
                                                    case "1":
                                                        boolean exits=false;
                                                        System.out.println("******************Candidates Matching******************");
                                                        try{
                                                            criteria.toString().isEmpty();
                                                        } catch (NullPointerException e)
                                                        {
                                                            System.out.println("Criteria not set,Please back!");
                                                            exits=true;
                                                        }
                                                        if(exits==false){
                                                            se = findCandidate.selectionCandidate(criteria);
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }

                                            } while (!s4.equals("0"));
                                            break;
                                        default:
                                            break;
                                    }
                            } while (!h.equals("5")) ;
                            break;


                    case "2":
                        System.out.println("--------------------Register-----------------");
                        System.out.println("Please input the Register username");
                        String newname=sc.nextLine();
                        System.out.println("Please input the password");
                        String newpassword=sc.nextLine();
                        System.out.println("Please input identification code");
                        String newuserrole=sc.nextLine();
                        user u=new user();
                        if(newname.isEmpty()||newpassword.isEmpty())
                        {
                            System.out.println("Input is error,Register failed.");
                        }
                        else{
                        u.setPassword(newpassword);
                        u.setUsername(newname);
                        u.setUserrole(newuserrole);
                        uid.regist(u);
                        }

                        break;

                    case "3":
                        System.out.println("Thankyou for use MissionToMars System");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error input");
                        break;
                }
            }while(choice.equals(""));
         }
     }
     public static void showList(){
         System.out.println("******************Main Function Menu******************");
         System.out.println("1.Mission    2.Shuttle     3.Create Criteria     4.Find Best N Candidates      5.Back to Login");
         System.out.println("----------Please choose the option--------");
     }
     public static void showLogin(){
         System.out.println("----------Mission To Mars System----------");
         System.out.println("1.Login	  2.Register	   3.Exit");
         System.out.println("----------Please choose the option--------");
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

public static void fileExit(String filename){
     File file=new File(filename);
    if(!file.exists())
     {
         try {
             file.createNewFile();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
     }}

     public static void MMenuForC(){
         System.out.println("******************Mission Menu******************");
         System.out.println("0.Back to previous menu    1.Mission list     2.Edit Mission     3.Create Mission");
         System.out.println("Please input the option:");
     }
     public static void MMenuForA(){
         System.out.println("******************Mission Menu******************");
         System.out.println("0.Back to previous menu    1.Mission list     2.Edit Mission  ");
         System.out.println("Please input the option:");
     }
     public static void nomalUser(){
         System.out.println("Premission Denied");
         System.out.println("System is closing");
         System.exit(0);
     }
     public static void SMenu(){
         System.out.println("******************Shuttle Menu******************");
         System.out.println("0.Back to previous menu     1.Show Shuttle     2.Select Shuttle ");
         System.out.println("Please input the option:");
     }
     public static void CMenu(){
         System.out.println("******************Criteria Menu******************");
         System.out.println("0.Back to previous menu     1.Show shuttle info     2.Show employment requirements     3.Create criteria ");
         System.out.println("Please input the option:");
     }
     public static void FMenu(){
         System.out.println("******************Find Candidate Menu******************");
         System.out.println("0.Back to previous menu     1.List the candidates");
         System.out.println("Please input the option:");
     }
 }