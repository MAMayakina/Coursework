import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;

    private static final AtomicInteger counter = new AtomicInteger(1);

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter.getAndIncrement();
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int number) {
        this.department = number;
    }

    public void setSalary(int amount) {
        this.salary = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "id-"+id+": ФИО-" + name + "; Отдел-" + department + "; З/п-" + salary;
    }


}