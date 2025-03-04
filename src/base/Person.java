package base ;
import java.util.ArrayList ;

public class Person {
    public int personID ;
    public static ArrayList<Person> personList = new ArrayList<>() ;
    public String name ;
    public final String nationalID ;

    public Person(String name , String nationalID){
        this.name = name ;
        this.nationalID = nationalID ;
        personList.add(this) ;
        personID = personList.size() ;
    }

    public static Person findById(int ID) {
        if((personList.size() >= ID) && (ID >= 0)) {
            return personList.get(ID - 1) ;
        }
        else
        {
            return null ;
        }
    }
}
