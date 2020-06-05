package MissionToMars;

public class user {

        private String username;

        private String password;

        private String userrole;

        public user(){

        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setUserrole(String userrole)
        {
            this.userrole=userrole;
        }
        public String getUserrole(){
            return userrole;
        }
    }

