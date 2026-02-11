package home_work3;

public class Company {
   static String companyName  = "Apple";

    private final int employeeID;
    private String employeeName;
    public Company(int someEmployeeID, String SomeEmployeeName){
        employeeID = someEmployeeID;
        employeeName = SomeEmployeeName;
    }
    void printCompanyName(){
        System.out.println(companyName);
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String newEmployeeName){
        employeeName = newEmployeeName;
    }
    public void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }
//    public void setEmployeeID(int newEmployeeID){
//        employeeID = newEmployeeID;
//    }
}
