package uni ;
import java.util.ArrayList ;
import java.util.Objects;

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
        Objects.requireNonNull(Major.findById(majorID)).addStudent() ;
        setStudentCode() ;
        studentList.add(this) ;
        studentID = studentList.size() ;
    }

    public static Student findById(int ID){
        if((studentList.size() >= ID) && (ID >= 0)) {
            return studentList.get(ID - 1) ;
        }
        else
        {
            return null ;
        }
    }

    public void setStudentCode() {
        studentCode = String.valueOf((entranceYear * 10000) + (majorID * 100) + (Objects.requireNonNull(Major.findById(majorID)).numberOfStudents)) ;
    }
}
