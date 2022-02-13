package main;
import java.time.LocalDateTime;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String userName;
    private LocalDateTime updated;
    //different constructors
    public Person() {
        this.personId = 0;
        this.firstName = "";
        this.lastName = "";
        this.userName = "";
        this.updated = LocalDateTime.now();
    }
    public Person(int personId, String firstName, String lastName, String userName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.updated = LocalDateTime.now();
    }
    //set methods
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUpdated() {
        this.updated = LocalDateTime.now();
    }
    //get methods
    public int getPersonId() {
        return this.personId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getUserName() {
        return this.userName;
    }
    public LocalDateTime getUpdated() {
        return updated;
    }
}
