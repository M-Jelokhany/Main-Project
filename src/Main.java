import base.Person ;
import uni.* ;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       Major math = new Major("Math" , 60) ;
       Major physics = new Major("Physics" , 70) ;

       Person ali = new Person("Ali" , "0200634709") ;
       Person reza = new Person("Reza" , "0200635710") ;
       Person farhad = new Person("Farhad" , "0200636711") ;
       Person amir = new Person("Amir" , "0200637712") ;
       Person hashem = new Person("Hashem" , "0200638713") ;

       Student Ali = new Student(1 , 403 , 1) ;
       Student Reza = new Student(2 , 403 , 1) ;
       Student Farhad = new Student(3 , 403 , 2) ;

       System.out.println(Objects.requireNonNull(Person.findById(Ali.personID)).name + " " + Ali.studentCode) ;
       System.out.println(Objects.requireNonNull(Person.findById(Reza.personID)).name + " " +  Reza.studentCode) ;
       System.out.println(Objects.requireNonNull(Person.findById(Farhad.personID)).name + " " + Farhad.studentCode) ;

       Professor Amir = new Professor(4 , 1) ;
       Professor Hashem = new Professor(5 , 2) ;

       System.out.println(Objects.requireNonNull(Person.findById(Amir.personID)).name + " " + Amir.professorID) ;
       System.out.println(Objects.requireNonNull(Person.findById(Hashem.personID)).name + " " + Hashem.professorID) ;

       Course AP = new Course("Advance Programming" , 3) ;
       Course Math = new Course("Math 1" , 3) ;
       Course Physics = new Course("Physics 1" , 3) ;

       PresentedCourse preAP = new PresentedCourse(1 , 1 , 50) ;
       PresentedCourse preMath = new PresentedCourse(2 , 1 , 50) ;
       PresentedCourse prePhysics = new PresentedCourse(3 , 2 , 50) ;

       preAP.addStudent(1) ;
       preAP.addStudent(2) ;
       preMath.addStudent(1) ;
       preMath.addStudent(2) ;
       preMath.addStudent(3) ;
       prePhysics.addStudent(3) ;

       Transcript aliTranscript = new Transcript(1) ;
       Transcript rezaTranscript = new Transcript(2) ;
       Transcript farhadTranscript = new Transcript(3) ;

       aliTranscript.setGrade(1 , 18) ;
       aliTranscript.setGrade(2 , 20) ;
       rezaTranscript.setGrade(1 , 16) ;
       rezaTranscript.setGrade(2 , 18) ;
       farhadTranscript.setGrade(2 , 17) ;
       farhadTranscript.setGrade(3 , 19) ;

       System.out.println() ;

       aliTranscript.printTranscript() ;
       rezaTranscript.printTranscript() ;
       farhadTranscript.printTranscript() ;

       System.out.println(Objects.requireNonNull(Person.findById(Objects.requireNonNull(Student.findById(aliTranscript.studentID)).personID)).name + "'s" + " GPA" + " : " + aliTranscript.getGPA()) ;
       System.out.println(Objects.requireNonNull(Person.findById(Objects.requireNonNull(Student.findById(rezaTranscript.studentID)).personID)).name + "'s" + " GPA" + " : " + rezaTranscript.getGPA()) ;
       System.out.println(Objects.requireNonNull(Person.findById(Objects.requireNonNull(Student.findById(farhadTranscript.studentID)).personID)).name + "'s" + " GPA" + " : " + farhadTranscript.getGPA()) ;

    }
}