package org.example;

//* Schritt 5: Schreibt eine "Main"-Klasse, in der ihr einige Beispiele für das Erstellen von Students, Teachers und Courses mit den Konstruktoren anwendet.
//* Schritt 6: Prüft in der "Main"-Klasse ob die generierten Lombok Methoden korrekt funktionieren(getter, setter, toString,...).

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Schritt 5: Schreibt eine "Main"-Klasse, in der ihr einige Beispiele für das Erstellen von Students, Teachers und Courses mit den Konstruktoren anwendet.
       Student student1 = new Student("1","Jan","Berlin",10);
       Student student2 = new Student("2","Bob","Hamburg",10);
       Student student3 = new Student("3","Alice","Frankfurt",10);

       Teacher teacher1 = new Teacher("1","Heike","Deutsch");
       Teacher teacher2 = new Teacher("2","Erk","Mathe");

        ArrayList<Student> students = new ArrayList<>(List.of(student1,student2));
        Course course1 = new Course("22","Sprache",teacher1, students);
        //* Schritt 6: Prüft in der "Main"-Klasse ob die generierten Lombok Methoden korrekt funktionieren(getter, setter, toString,...).
        System.out.println(student1);//toString()
        System.out.println(teacher1);//toString()
        System.out.println(course1);//toString()
        System.out.println("-------------------");
        System.out.println("Name of the 3-Student is: " + student3.getName());//get()
        System.out.println("Name of mathematics teacher is:  " + teacher2.name());
        System.out.println("-------------------");
        student3.setAdress("Hamburg");//set()
        System.out.println("new address for the third student : " + student3.getAdress());//get()
        System.out.println("-------------------");
        System.out.println("is the first student the same as the second student? " + student1.equals(student2));
    }
}