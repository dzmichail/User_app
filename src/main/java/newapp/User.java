package newapp;

public class User {
    private String name;
    private String dateofBirth;
    private String sex;


    public User(String name, String dateofBirth, String sex) {
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.sex = sex;

    }

    public User() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofBirth() {
        return this.dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}