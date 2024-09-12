package school.management.system;

public class Teacher {
    int id;
    String name;
    float salary;

    /**
     * Creates a new teacher
     * @param id the id of the teacher
     * @param name the name of the teacher
     * @param salary the salary of the teacher
     */
    public Teacher(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public float getSalary() {
        return salary;
    }

    /**
     * updates the teacher salary
     * @param salary the salary of the teacher
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }


}
