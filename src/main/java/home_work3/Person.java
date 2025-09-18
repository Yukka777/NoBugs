package home_work3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;
    Person(String someFirstName, String someLastName, String someSsn){
        firstName = someFirstName;
        lastName =someLastName;
        ssn = someSsn;
    }
    String getFirstName(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }
    String getSsn(){
        return this.ssn;
    }
    public void setFirstName( String newFirstName){
        firstName =newFirstName;
    }
    public void setLastNameName( String newLastName){
        lastName =newLastName;
    }
    public void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName +", SSN: " + ssn);
    }
}
