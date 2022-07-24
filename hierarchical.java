class Employee {
    double salary = 50000;
    void displaySalary() {
      System.out.println("Employee Salary: Rs."+salary);
    }
   }
   class FullTimeEmployee extends Employee{
    double hike = 0.50;
    void incrementSalary() {
      salary = salary + (salary * hike);
    }
   }
   class InternEmployee extends Employee{
    double hike = 0.25;
    void incrementSalary() {
      salary = salary + (salary * hike);
    }
   }

public class hierarchical {
    public static void main(String[] args) {
      FullTimeEmployee emp1 = new FullTimeEmployee();
      InternEmployee emp2 = new InternEmployee();
      System.out.println("Salary of a full-time employee before incrementing:");
      emp1.displaySalary();
      System.out.println("Salary of an intern before incrementing:");
      emp2.displaySalary();
      emp1.incrementSalary();
      emp2.incrementSalary();
      System.out.println("Salary of a full-time employee after incrementing:");
      emp1.displaySalary();
      System.out.println("Salary of an intern after incrementing:");
      emp2.displaySalary();
    }
}