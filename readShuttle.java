package MissionToMars;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class readShuttle {


    public static ArrayList<Shuttle> shuttleinfo(String filename)//read venues information from venues.txt,samiliar to read Drivers
    {
        ArrayList<Shuttle> test=new ArrayList<>();
        ArrayList<String[]> info=new ArrayList<String[]>();
        info=readFile(filename);
        for(int i=0;i<info.size();i++)
        {
            String[] data=info.get(i);
            int id=Integer.parseInt(data[0]);
            String name=data[1];
            String manufact_year=data[2];
            int fuel_capacity=Integer.parseInt(data[3]);
            int passenger_capacity=Integer.parseInt(data[4]);
            int cargo_capacity= Integer.parseInt(data[5]);
            int travel_speed=Integer.parseInt(data[6]);
            String origin=data[7];
            Shuttle shuttle =new Shuttle();
            shuttle.setS_name(name);
            shuttle.setS_travel_speed(travel_speed);
            shuttle.setS_cargo_capacity(cargo_capacity);
            shuttle.setS_passenger_capacity(passenger_capacity);
            shuttle.setS_fuel_capacity(fuel_capacity);
            shuttle.setS_origin(origin);
            shuttle.setS_id(id);
            shuttle.setS_manufact_year(manufact_year);
           test.add(shuttle);
        }

        return test;
    }

    public static ArrayList<String[]> readFile(String filename)
    {
        try
        {
            FileReader inputFile = new FileReader(filename);
            try{
                Scanner file = new Scanner(inputFile);
                ArrayList<String[]> contents=new ArrayList<String[]>();
                while(file.hasNextLine())
                {
                    String Line= file.nextLine();
                    String[] word=Line.split("=");
                    contents.add(word);
                }
                return contents;
            }
            finally{
                inputFile.close();
            }
        }
        catch(FileNotFoundException exception) {
            System.out.println(filename + " not found"); }
        catch(IOException exception) {
            System.out.println("Unexpected I/O exception occurs"); }
        return null;
    }
    public static String readinfo(ArrayList<Shuttle> test){
        String result=null;
        for(int i=0;i<test.size();i++)
        {
            Shuttle s=test.get(i);
            int num=i+1;
            System.out.println(num+"."+" ShuttleID: "+s.getS_id()+" Shuttle name: "+s.getS_name()+" manufacture year:  "+s.getS_manufact_year()
                    +" fuel capacity (in litres): "+s.getS_fuel_capacity()+" passenger capacity: "+s.getS_passenger_capacity()+" cargo capacity (in kgs): "
                    +s.getS_cargo_capacity()+" travel speed (kms/hr): "+s.getS_travel_speed()+" Origin: "+s.getS_origin());
            result=s.getS_id()+"="+s.getS_name()+"="+s.getS_manufact_year()
                    +"="+s.getS_fuel_capacity()+"="+s.getS_passenger_capacity()+"="
                    +s.getS_cargo_capacity()+"="+s.getS_travel_speed()+"="+s.getS_origin();
        }
     return result;
    }
    }

