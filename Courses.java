import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Courses implements Comparable<Courses> {

    public String courseName;
    public int numberOfStudents;
    public String lecturer;


    //Getters
    public String getCourseName() {
        return courseName;
    }

    public int getNoOfStudents() {
        return numberOfStudents;
    }

    public String getLecturer() {
        return lecturer;
    }

    //Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNoOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    //Constructor
    public Courses(String name, int students, String courseLecturer) {
        courseName = name;
        numberOfStudents = students;
        lecturer = courseLecturer;

    }

    //Add to string method
    public String toString() {
        String output = "Course Name: " + courseName;
        output += "\nNumber of Students:" + numberOfStudents;
        output += "\nLecturer:" + lecturer;

        return output;

    }


    public static void main(String[] args) {

        ArrayList<Courses> courses1 = new ArrayList<>();
        courses1.add(new Courses("Intro to Python", 25, "Jo Loko\n"));
        courses1.add(new Courses("Intermediate Java", 30, "James Arthur\n"));
        courses1.add(new Courses("Data Science", 10, "Ann Jones\n"));
        courses1.add(new Courses("Web Development", 18, "Ben Lucas\n"));
        courses1.add(new Courses("SQL", 12, "Andrew Small\n"));
        //System.out.println("\n\n************* Courses 1: ***********\n" + courses1);


        //Swap the element at position 1 of the List with the element at position 2
        Collections.swap(courses1, 0, 1);

        //Sort the List according to the numberOfStudents and print it out
        System.out.println("\n\nBefore sorting: " + courses1);

        Collections.sort(courses1);

        System.out.println("\n\nAfter sorting: " + courses1);


        //Create new ArrayList
        ArrayList<Courses> courses2 = new ArrayList<>();
        courses2.add(new Courses("Swift", 25, "Steve Jobs"));
        courses2.add(new Courses("Kotlin", 30, "Pete Mills"));
        courses2.add(new Courses("Ruby", 10, "Carl Lager"));
        courses2.add(new Courses("C++", 18, "John Wick"));
        courses2.add(new Courses("C#", 12, "Joel Smith"));
        System.out.println("\n\n************ Courses 2: *************\n" + courses2);


        //Add two new courses
        courses2.add(new Courses("Java 101", 55, "Dr P Green"));
        courses2.add(new Courses("Advanced Programming", 93, "Prof. M Milton"));
        //System.out.println("\n\n******** ADD TWO NEW COURSES");


        //sort the list
        Collections.sort(courses2);
        //System.out.println("Sorted List: " + courses2);

        // get the element from the arraylist
        // get the position of Java
        int position = courses2.indexOf("Java 101");
        System.out.println("First Occurrence of Java: " + position);


        //Check if the lists have a course in common
        boolean inCommon = Collections.disjoint(courses1,courses2);
        System.out.println("Do the lists have elements in common: "+inCommon);


    }

    @Override
    public int compareTo(Courses o) {
        return 0;
    }
}
