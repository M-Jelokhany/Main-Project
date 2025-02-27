package uni;
import java.util.ArrayList;

public class Major {
    public int majorID ;
    public static ArrayList<Major> majorList = new ArrayList<>() ;
    public String name ;
    public final int maxCapacity ;
    public int numberOfStudents = 0 ;

    public Major(String name , int maxStudentNumber){
        this.name = name ;
        maxCapacity = maxStudentNumber ;
        majorList.add(this) ;
        majorID = majorList.size() ;
    }

    public static Major findById(int ID){
        return majorList.get(ID - 1) ;
    }

    public void addStudent(){
        numberOfStudents += 1 ;
        if(numberOfStudents == maxCapacity){
            System.out.println("Completion of capacity") ;
        }
    }
}
