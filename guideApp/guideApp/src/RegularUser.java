public class RegularUser extends User {
    public RegularUser(String userName,String password)
            {
                super(userName,password);
            }
            public void displayUserInfo(){
                System.out.println("Regular Username: " + getUsername());
            }
    
}
