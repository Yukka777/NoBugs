package home_work3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;
    public University(int someStudentID, String someStudentName){
        studentID =someStudentID;
        studentName =someStudentName;}
static void changeUniversityName(String newName){
    universityName = newName;}
    public String getStudentName(){
        return studentName;
    }
    public void printStudentInfo(){
        System.out.println("имя: " + studentName + ", ID: " + studentID +" и университет: " + universityName);
    }
}
