public class Admin {
    public String username;
    public String password;

    public Admin() {

    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Display_Admin(){
        System.out.println("\n\nUser-Name: "+this.username);
        System.out.println("Password: "+this.password);
    }
}

