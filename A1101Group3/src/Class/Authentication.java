package Class;

public class Authentication {
    private String Username;
    private String Password;
    
    public Authentication(String Username, String Password){
    this.Username = Username;
    this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    
}
