package Constructor;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, String language, String address) {
        super(name, age, language, address);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void showinfo(int number){
        super.showinfo();
        setSalary(23);
        System.out.println("Salary: "+getSalary());
    }

}
