public class User {
    public String name;
    public String gender;
    public String phone_no;

    public User() {

    }

    public User(String name, String gender, String phone_no) {
        this.name = name;
        this.gender = gender;
        this.phone_no = phone_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public void User_Display(){
        System.out.println("\n\nUser-Name: "+this.getName());
        System.out.println("Gender: "+this.getGender());
        System.out.println("Phone Number: "+this.getPhone_no());
    }
}

