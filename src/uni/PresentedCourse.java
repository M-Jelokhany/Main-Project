package uni ;
import java.util.ArrayList ;

public class PresentedCourse {
    public int presentedCourseID ;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>() ;
    public int courseID ;
    public int professorID ;
    public int capacity;
    public ArrayList<Integer> studentIds;

    public PresentedCourse(int courseID , int professorID , int maxCapacity){
        this.courseID = courseID ;
        this.professorID = professorID ;
        this.capacity = maxCapacity ;
        studentIds = new ArrayList<>(this.capacity) ;
        presentedCourseList.add(this) ;
        presentedCourseID = presentedCourseList.size() ;
    }

    public static PresentedCourse findById(int ID){
        if((presentedCourseList.size() >= ID) && (ID >= 0)) {
            return presentedCourseList.get(ID - 1) ;
        }
        else
        {
            return null ;
        }
    }

    public void addStudent(int studentID){
        if(studentIds.size() < capacity){
            studentIds.add(studentID) ;
        }
        else
        {
            System.out.println("Completion of capacity") ;
        }
    }
}
