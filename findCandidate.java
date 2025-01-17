package MissionToMars;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class findCandidate {
    private static String filename;
    private static ArrayList<String> candidate;
    private static ArrayList<String> qualified_candidate;
    private static boolean health_record;
    private static int max_age;
    private static int min_age;
    private static int years_of_work_experience;
    private static mission mission;


    public static ArrayList<String> selectionCandidate(SelectionCriteria criteria){
        //get selection criteria
        boolean health_record = criteria.getHealth_records();
        int max_age = criteria.getMaxAge();
        int min_age = criteria.getMinAge();
        int years_of_work_experience = criteria.getYears_of_work_experience();

        // get candidate list
        candidate = readFile("candidate.txt");

        int id;
        String name;
        int age;
        boolean healthRecord;
        int work_years;
        ArrayList<String> qualified_candidate = new ArrayList<String>();
        for (int i = 0; i < candidate.size(); i++){
            String[] candidateInformation = candidate.get(i).split(",");
            id = Integer.parseInt(candidateInformation[0]);
            name = candidateInformation[1];
            age = Integer.parseInt(candidateInformation[2]);
            healthRecord = Boolean.parseBoolean(candidateInformation[3]);
            work_years = Integer.parseInt(candidateInformation[4]);

            if (health_record == healthRecord && min_age < age && age < max_age && work_years > years_of_work_experience){
                qualified_candidate.add(name);
            }
        }
        for(int k=0;k<qualified_candidate.size();k++)
        {
        System.out.println(qualified_candidate.get(k));
        }

        //check if the candidate list is enough for the number required.
//        if (qualified_candidate.size() < mission.getEmployment_requirements().getEmpReq()){
  //          System.out.println("Qualified Candidate in not enough. Please modifythe selection Criteria");
    //    }
        return qualified_candidate;
    }


    public static ArrayList<String> readFile(String fileName)
    {
        ArrayList<String> candidates = new ArrayList<>();
        try
        {
            FileReader inputFile = new FileReader(fileName);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while(parser.hasNextLine())
                {
                    candidates.add(parser.nextLine());
                }
           //     System.out.println(fileName + " is read successfully! ");
            }
            finally
            {
                inputFile.close();
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + "not found.");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O exception occurs");
        }
        return candidates;
    }
}
