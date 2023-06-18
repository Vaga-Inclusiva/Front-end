package ifsp.spo.edu.vagainclusiva;

public class User {

    private final String username;
    private final String email;
    private final String password1;
    private final String password2;

    public User(String nome, String email, String senha, String senha2) {
        this.username = nome;
        this.email = email;
        this.password1 = senha;
        this.password2 = senha2;
    }

    @SuppressWarnings("unused")
    public String getUsername() {
        return username;
    }

    @SuppressWarnings("unused")
    public String getEmail() {
        return email;
    }

    @SuppressWarnings("unused")
    public String getPassword1() {
        return password1;
    }

    @SuppressWarnings("unused")
    public String getPassword2() {
        return password2;
    }
}
