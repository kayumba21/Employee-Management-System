public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Kayumba Eugene", 40, 80000);
        Manager manager2 = new Manager("Tuyishime Thierry", 45, 90000);

        Developer developer1 = new Developer("Charlie Brown", 30, 70000);
        Developer developer2 = new Developer("Daisy Lee", 28, 60000);

        System.out.println("Manager Details:");
        manager1.displayDetails();
        System.out.println("Bonus: " + manager1.calculateBonus());
        System.out.println();

        manager2.displayDetails();
        System.out.println("Bonus: " + manager2.calculateBonus());
        System.out.println();


        System.out.println("Developer Details:");
        developer1.displayDetails();
        System.out.println("Bonus: " + developer1.calculateBonus());
        System.out.println();

        developer2.displayDetails();
        System.out.println("Bonus: " + developer2.calculateBonus());
    }
}