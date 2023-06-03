public class AuthenticationInfo {
    private String URL;
    private String username;
    private String password;
    public AuthenticationInfo(String URL, String username, String password){
        this.URL = URL;
        this.username = username;
        this.password = password;
    }

    public String getURL() {
        return this.URL;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
