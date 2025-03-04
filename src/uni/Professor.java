package uni ;
import java.util.ArrayList ;

public class Professor {
    public int professorID ;
    public static ArrayList<Professor> professorList = new ArrayList<>() ;
    public int personID ;
    public int majorID ;

    public Professor(int personID , int majorID){
        this.personID = personID ;
        this.majorID = majorID ;
        professorList.add(this) ;
        professorID = professorList.size() ;
    }

    public static Professor findById(int ID){
        if((professorList.size() >= ID) && (ID >= 0)) {
            return professorList.get(ID - 1) ;
        }
        else
        {
            return null ;
        }
    }
}
