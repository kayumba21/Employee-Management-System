public class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
