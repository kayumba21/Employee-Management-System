public abstract class Employee {
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public abstract double calculateBonus();

        public void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Age: " + age);
            System.out.println("Employee Salary: " + salary);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }
    }
