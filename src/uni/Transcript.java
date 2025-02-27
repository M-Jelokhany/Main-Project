package uni;
import base.Person;
import java.util.HashMap;
import java.util.Map;

public class Transcript {
    public int studentID ;
    public HashMap<Integer , Double> transcript ;

    public Transcript(int studentID){
        this.studentID = studentID ;
        transcript = new HashMap<>() ;
    }

    public void setGrade(int presentedCourseID , double grade){
        if(PresentedCourse.findById(presentedCourseID).studentIDList.contains(studentID)){
            transcript.put(presentedCourseID , grade) ;
        }
    }

    public void printTranscript(){
        System.out.println( Person.findById( Student.findById(studentID).personID ).name + "'s" + " grades" + " :") ;
       for(Map.Entry<Integer , Double> entry : transcript.entrySet()){
           System.out.println( entry.getValue()  +  " : "  +  Course.findById(PresentedCourse.findById(entry.getKey()).courseID).title ) ;
       }
       System.out.println() ;
    }

    public double getGPA(){
        double avg , sumGrades = 0 ;
        int sumUnits = 0 ;

        for(Map.Entry<Integer , Double> entry : transcript.entrySet()){
            sumUnits += Course.findById(PresentedCourse.findById(entry.getKey()).courseID).units ;
            sumGrades += (entry.getValue()) * (Course.findById(PresentedCourse.findById(entry.getKey()).courseID).units) ;
        }

        avg = sumGrades / sumUnits;
        return  avg ;
    }
}
