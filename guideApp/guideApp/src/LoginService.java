

public class LoginService {
    public userRepository userRepository;
    public LoginService(userRepository userRepository){
        this.userRepository = userRepository;
    }
    public boolean login(String userName, String password){
        User user = userRepository.findUserByUsername(userName);
        if(user != null && user.getPassword().equals(password))
        {
            System.out.println("Login Successfull! " + userName);
            return true;
        }
        else{
            System.out.println("Login Failed! Username or password wrong.");
        return false;
        }

    }
}
