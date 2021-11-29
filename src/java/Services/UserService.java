package Services;

import DataAccess.UserDb;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author BritishWaldo
 */
public class UserService
{
    public User get(String inputEmail) throws Exception 
    {
        UserDb userConnection = new UserDb();
        User tempUser = userConnection.get(inputEmail);
        return tempUser;
    }
    
    public ArrayList<User> getAll() throws Exception 
    {
        UserDb userConnection = new UserDb();
        ArrayList<User> allUsersList = userConnection.getAll();
        return allUsersList;
    }
    
    public void insert(String inputEmail, boolean inputActive, String inputFirstName, String inputLastName
                    , String inputPassword, int inputUserRole) throws Exception 
    {
        UserDb userConnection = new UserDb();
        User tempUser = new User(inputEmail, inputActive, inputFirstName, inputLastName, inputPassword, inputUserRole);
        userConnection.insert(tempUser);
    }
    
    public void update(String originalEmail, String inputEmail, boolean inputActive, String inputFirstName, String inputLastName
                    , int inputUserRole) throws Exception 
    {
        UserDb userConnection = new UserDb();
        User tempUser = new User(inputEmail, inputActive, inputFirstName, inputLastName, "noPass", inputUserRole);
        userConnection.update(originalEmail, tempUser);
    }
    
    public void delete(String inputEmail) throws Exception 
    {
        UserDb userConnection = new UserDb();
        User tempUser = new User(inputEmail);
        userConnection.delete(tempUser);
    }
}
