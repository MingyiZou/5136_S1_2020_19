package missonToMars;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class findCandidate{


    private static String filename;
    private static ArrayList<String> candidate;


    public String[] selectionCandidate(SelectionCriteria criteria){
        //get selection criteria
        boolean health_record = criteria.getHealth_records();
        int max_age = criteria.getMaxAge();
        int min_age = criteria.getMinAge();
        int years_of_work_experience = criteria.getYears_of_work_experience();

        // get candidate list
        candidate = readFile("candidate.txt");


        for (int i = 0; i < candidate.size(); i++){
        	String[] candidateInformation = candidate.get(i).split(",");
        	int id = Integer.parseInt(candidateInformation[0]);
        	String name = candidateInformation[1];
        	int age = Integer.parseInt(candidateInformation[2]);
        	boolean healthRecord = Boolean.parseBoolean(candidateInformation[3]);
        	int years = Integer.parseInt(candidateInformation[4]);        	
        }
    }


    public ArrayList<String> readFile(String fileName)
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
                System.out.println(fileName + " is read successfully! ");
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


    // read candidate
//    ArrayList<readCandidate> Candidates = new ArrayList<readCandidate>();
//    readCandidate candidate = new readCandidate();
// read employment deployment

    // read selection criteria
//comparation health record, work experience, range of age
//come out with a list of candidate the meet the criteria
    //don't have to be larger than N, if i < N, message: not ehough candidate, change the selection crieteria.


}