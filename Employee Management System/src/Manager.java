public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}
