package homework.lesson12;

public class Employee extends Person {
    private String company;

    public String getCompany() {
        return company;
    }

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void work() {
        System.out.printf("%s works in %s \n", getName(), company);
    }

    @Override
    public void display() {
        super.display();
        work();
    }
}
