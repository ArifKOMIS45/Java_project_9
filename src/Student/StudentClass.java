package Student;


import Data.StudentData;
import School.SchoolLocation;

import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {
    private String username, password;
    private LinkedHashMap<String, Integer> classNameAndScore= new LinkedHashMap<>();

    public StudentClass(String location) throws Exception {
        super(location);
    }

    public StudentClass( String username, String password,String location) throws Exception {
        super(location);
        setUsernamePassword(username, password);

    }

    public void setUsernamePassword(String username, String password) throws Exception {
        StudentData data = new StudentData();
        LinkedHashMap<String, String> map = data.AddUserNameAndPassword();

        if (map.containsKey(username) && map.containsValue(password)) {
            this.username = username;
            this.password = password;
        } else throw new Exception("Not able to find a username and password. Please sign up to website");

    }

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", price ='" + super.getPrice() + '\'' +
                ", schoolLocation ='" + super.getLocation() + '\'' +
                ", classNameAndScore=" + classNameAndScore +
                '}';
    }

}
