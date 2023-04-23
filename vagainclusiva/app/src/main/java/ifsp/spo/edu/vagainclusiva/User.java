package ifsp.spo.edu.vagainclusiva;

public class User {

    String username;
    String password;


    String id;


    public User(String username, String password, String id){
        this.username = username;
        this.password = password;
        this.id = id;

    }


    public String getId() {
        return id;
    }
}