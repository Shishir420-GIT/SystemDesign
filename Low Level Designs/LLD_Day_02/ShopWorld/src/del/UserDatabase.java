package del;

/*
Singleton design pattern example
 */
public class UserDatabase {

    private static UserDatabase instance;

    private UserDatabase(){}

    /*
    Syncronized to make it thread safe
     */
    public static synchronized UserDatabase getInstance(){
        if(instance == null){
            instance = new UserDatabase();
        }
        return instance;
    }
}

