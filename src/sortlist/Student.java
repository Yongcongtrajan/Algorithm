package sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String lastName;
    private String firstName;
    private int age;

    public Student(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Zou", "Yongcong", 25);
        Student student2 = new Student("Li", "Jiawei", 22);
        Student student3 = new Student("XXX", "XXX", 21);
        Student student4 = new Student("AAA", "AAA", 24);
        Student student5 = new Student("BBB", "BBB", 29);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //Collections.sort(studentList,new sortbyName());
        //System.out.println(;);
        Collections.sort(studentList, sortByAge);
        for(Student str : studentList) {
            System.out.println(str);
        }


    }

    private static class sortbyName implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            //returnString
            String studentName1 = a.lastName.toUpperCase();
            String studentName2 = b.lastName.toUpperCase();

            return studentName1.compareTo(studentName2);
        }
    }

    public static Comparator<Student> sortByAge = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age < o2.age ? -1 : 1;
        }
    };

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age  ;
    }
}
