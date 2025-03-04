package uni ;
import java.util.ArrayList ;

public class Major {
    public int majorID ;
    public static ArrayList<Major> majorList = new ArrayList<>() ;
    public String name ;
    public final int capacity;
    public int numberOfStudents = 0 ;

    public Major(String name , int capacity){
        this.name = name ;
        this.capacity = capacity ;
        majorList.add(this) ;
        majorID = majorList.size() ;
    }

    public static Major findById(int ID){
        if((majorList.size() >= ID) && (ID >= 0)) {
            return majorList.get(ID - 1) ;
        }
        else
        {
            return null ;
        }
    }

    public void addStudent(){
        if(numberOfStudents < capacity){
            numberOfStudents += 1 ;
        }
        else
        {
            System.out.println("Completion of capacity") ;
        }
    }
}
