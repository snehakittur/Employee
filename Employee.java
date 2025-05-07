public class Employee {
    String name;
    int id,age;
    double salary;
    
    public Employee(String name, int id, double salary,int age){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Employee emp1=new Employee("Sita",101,50000.0,29);
        emp1.displayInfo();
    }
}
