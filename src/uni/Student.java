package uni;
import java.util.ArrayList;

public class Student {
    public int studentID ;
    public static ArrayList<Student> studentList = new ArrayList<>() ;
    public int personID ;
    public final int entranceYear ;
    public int majorID ;
    public String studentCode ;

    public Student(int personID , int entranceYear , int majorID){
        this.personID = personID ;
        this.entranceYear = entranceYear ;
        this.majorID = majorID ;
        Major.findById(majorID).addStudent() ;
        setStudentCode() ;
        studentList.add(this) ;
        studentID = studentList.size() ;
    }

    public static Student findById(int ID){
        return studentList.get(ID - 1) ;
    }

    public void setStudentCode(){
        studentCode = String.valueOf((entranceYear * 10000) + (majorID * 100) + (Major.findById(majorID).numberOfStudents) ) ;
    }
}
