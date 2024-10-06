import school.management.system.School;
import school.management.system.Student;
import school.management.system.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Farouk=new Teacher(10,"Farouk",500);
        Teacher Rob3=new Teacher(11,"Rob3",9000);
        List <Teacher> teacherList=new ArrayList<>();
        teacherList.add(Farouk);
        teacherList.add(Rob3);

        Student Maro =new Student(10,"Maro",2);
        Student Koky=new Student(11,"Koky",3);
        List <Student> studentList=new ArrayList<>();
        studentList.add(Maro);
        studentList.add(Koky);

        School Eleman =new School(studentList,teacherList);
        Maro.payFees(10000);
        Koky.payFees(3000);
        System.out.println(Eleman.getTotalMoneyEarned());

        //Pay the Teacher's Salaries
        Farouk.receiveSalary(Farouk.getSalary());
        System.out.println("ElEman has paid the salary to "+Farouk.getName()+" And now has "+(int)Eleman.getTotalMoneyEarned()+" $");
        Rob3.receiveSalary(Rob3.getSalary());
        System.out.println("ElEman has paid the salary to " +Rob3.getName()+" And now has "+(int)Eleman.getTotalMoneyEarned() +" $");

        System.out.println("ElEman has paid the salaries "+(int)Eleman.getTotalMoneySpent()+" $");
    }
}