import java.util.ArrayList;
import java.util.List;
//KUllanıcı bilgileri saklamak için ArrayList kullanıldı.
//for save for user info, Arraylist used.
public class userRepository {
    public List<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
        
    }
    public User findUserByUsername(String userName)
    {
        for(User user : users)
        {
            if(user.getUsername().equals(userName))
            {
                return user;
            }
        }
        return null;
    }
}
