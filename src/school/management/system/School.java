package school.management.system;

import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private static float totalMoneySpent;
    private static float totalMoneyEarned;

    /**
     *
     * @param students the list of students
     * @param teachers the list of teachers
     */
    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        this.totalMoneySpent =0;
        this.totalMoneyEarned =0;
    }

    /**
     *
     * @return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @return the list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * to add a new teacher
     * @param teacher the new teacher to be added to the list of teachers
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * to add a new student
     * @param student the new student to be added to the list of the students
     */
    public void setStudents(Student student) {
        students.add(student);
    }

    /**
     * to update the total spent money
     * @param moneySpent the total amount spent money
     */
    public static void setTotalMoneySpent(float moneySpent) {
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }

    /**
     * to update the total money earned
     * @param totalMoneyEarn the total amount earned money
     */
    public static void setTotalMoneyEarned(float totalMoneyEarn) {
        totalMoneyEarned += totalMoneyEarn;
    }

    /**
     *
     * @return the total money spent
     */
    public float getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @return the total earned money
     */
    public float getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
}
