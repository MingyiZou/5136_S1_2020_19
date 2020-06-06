package MissionToMars;


public interface Userinterface {
    public abstract boolean isLogin(String username,String passworld);

    int userRole(String user,String password);
    public abstract void regist(user userinformation);

}


