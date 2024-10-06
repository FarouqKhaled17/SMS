package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * creating a new Student
     * the initial fees will be added to the student
     * @param id the id of the student
     * @param name the name of the student
     * @param grade the grade of the student
     */

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid =0;
        this.feesTotal =2000;
    }

    /**
     * update the student grade
     * @param grade the grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * update the student fees
     * @param feesPaid the fees of the student
     */
    public void payFees(int feesPaid){
        this.feesPaid+=feesPaid;
        School.setTotalMoneyEarned(this.feesPaid);
    }

    /**
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the feesPaid of the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees of the student
     */
    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }
}
