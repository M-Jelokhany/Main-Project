package uni;
import java.util.ArrayList;

public class PresentedCourse {
    public int presentedCourseID ;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>() ;
    public int courseID ;
    public int professorID ;
    public int maxCapacity ;
    public ArrayList<Integer> studentIDList ;

    public PresentedCourse(int courseID , int professorID , int maxCapacity){
        this.courseID = courseID ;
        this.professorID = professorID ;
        this.maxCapacity = maxCapacity ;
        studentIDList = new ArrayList<>(this.maxCapacity) ;
        presentedCourseList.add(this) ;
        presentedCourseID = presentedCourseList.size() ;
    }

    public static PresentedCourse findById(int ID){
        return presentedCourseList.get(ID - 1) ;
    }

    public void addStudent(int studentID){
        studentIDList.add(studentID) ;
    }
}
