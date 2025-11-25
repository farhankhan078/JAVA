// Basic structure of Java program using constants, variables & data types

class BasicStructure {
    
    // Constant (value cannot be changed)
    static final double PI = 3.14159;

    public static void main(String[] args) {

        // Variables & Data Types
        int age = 20;                 // Integer variable
        double salary = 45000.50;     // Double variable
        char grade = 'A';             // Character variable
        boolean isStudent = true;     // Boolean variable
        String name = "Farhan";       // String (Reference type)

        // Output values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        // Using constant
        System.out.println("Value of PI: " + PI);
    }
}
