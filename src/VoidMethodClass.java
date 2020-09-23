import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class VoidMethodClass {
    private List users = new ArrayList<>();
    public void addUser(String user){
        users.add(user);
    }
    public void removeUser(String user){
        if(!users.contains(user))
        {
            throw new NoSuchElementException();
        }
        users.remove(user);
    }
    public int size(){
        return users.size();
    }
    public void removeAll(){
        users.clear();
    }
}
