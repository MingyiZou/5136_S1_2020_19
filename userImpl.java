package MissionToMars;
import test.Userinterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter ;
import java.io.IOException;


public class userImpl implements Userinterface {
    private static File file=new File("user.txt");
    static {
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("User account data build failed");
        }
    };
    public boolean isLogin(String username, String passworld) {
        BufferedReader br=null;
        boolean flag=false;
        try {
            br=new BufferedReader(new FileReader(file));
            String s=null;
            while((s=br.readLine())!=null){
                String []data=s.split("=");
                if((data[0].equals(username))&&(data[1].equals(passworld))) {
                    flag=true;
                }
            }
        } catch (FileNotFoundException e) {
//			e.printStackTrace();
            System.out.println("Database error");
        }catch (IOException e) {
            System.out.println("User Login error");
//			e.printStackTrace();
        }finally {
            if(br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
//					e.printStackTrace();
                    System.out.println("User Login data error");
                }
            }
        }


        return flag;
    }

    public void regist(user userinformation) {
        if (userinformation.getUserrole().equals("mc2020"))
        {
            System.out.println("You has register as a new Candidate!");
        }
        if (userinformation.getUserrole().equals("mad2020"))
        {
            System.out.println("You has register as a new Administrator!");
        }
        if(userinformation.getUserrole().equals("mco2020"))
        {
            System.out.println("Hello,Coordinator!");
        }
        else {
            System.out.println("Register successfully,Weclome use Mission To Mars");
        }
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(file,true));
            bw.write(userinformation.getUsername()+"="+userinformation.getPassword()+"="+userinformation.getUserrole());
            bw.newLine();
            bw.flush();
        }
        catch (IOException e) {
            System.out.println("Register failed");
//			e.printStackTrace();
        }finally {
            if(bw!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
//					e.printStackTrace();
                    System.out.println("User register data release failed");
                }
            }
        }

    }

    public int userRole(String user,String password){
    BufferedReader br=null;
    int flag=0;
        try {
        br=new BufferedReader(new FileReader(file));
        String s=null;
        while((s=br.readLine())!=null){
            String []data=s.split("=");
            if((data[0].equals(user))&&(data[1].equals(password))) {
                if (data[2].equals("mco2020")) {
                    flag = 2;
                }
                if (data[2].equals("mad2020")) {
                    flag = 1;
                }
            }
        }
    } catch (FileNotFoundException e) {
//			e.printStackTrace();
        System.out.println("Database error");
    }catch (IOException e) {
        System.out.println("User Login error");
//			e.printStackTrace();
    }finally {
        if(br!=null) {
            try {
                br.close();
            } catch (IOException e) {
//					e.printStackTrace();
                System.out.println("User Login data error");
            }
        }
    }
        return flag;
}
}

