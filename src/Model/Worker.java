package Model;

import Common.Library;

public class Worker {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String workLocation;

    public Worker() {

    }

    public Worker(int id, String name, int age, int salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public void input() {
        setName(Library.validString("Enter Name"));
        setAge(Library.getInt("Enter Age", 18, 50));
        setSalary(Library.validNumber("Enter Salary"));
        setWorkLocation(Library.validString("Enter location"));
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", salary=" + salary;
    }

}
