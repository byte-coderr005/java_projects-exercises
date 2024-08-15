public class Adminuser extends User {
    private String adminCode;
        public Adminuser(String userName, String password){
            super(userName, password);
        }
        public String getAdminCode(){
            return adminCode;
        }
        public void  setAdminCode(String adminCode){
            this.adminCode = adminCode;
        }
        public void displayAdminInfo(){
            System.out.println("Admin Username is " + getUsername());
            System.out.println("Admin code is " + adminCode);

        }
}
