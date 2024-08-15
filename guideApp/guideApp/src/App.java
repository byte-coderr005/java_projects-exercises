import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
         userRepository userRepository = new userRepository();
        userRepository.addUser(new User("admin", "1234"));
        userRepository.addUser(new User("user1", "password"));

        
        LoginService loginService = new LoginService(userRepository);
        Scanner sc = new Scanner(System.in);
        System.out.println("Press a for otherwise regular entry");
        String entry = sc.next();
        sc.nextLine();

        if(entry.equals("a"))
        {
            System.out.print("Admin için Kullanıcı adınızı girin: ");
            String userName = sc.nextLine();
            
            System.out.print("Şifrenizi girin: ");
            String password = sc.nextLine();
            loginService.login(userName, password);
        }
        else if(entry.equals("b")){
        System.out.print("Kullanıcı adınızı girin: ");
        String userName = sc.nextLine();

        System.out.print("Şifrenizi girin: ");
        String password = sc.nextLine();
        loginService.login(userName, password);
        }
        sc.close();
    }
}
