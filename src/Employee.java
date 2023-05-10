public class Employee {

    private String name;

    private String Surname;
    private String Department;
    private double Salary;
    private int DateofBirth;

    public Employee() {
        this.name = ",";
        this.Surname = ",";
        this.Department = ",";
        this.Salary = 0;
        this.DateofBirth = 0;
    }
    public Employee(String name, String surname, String department, double salary, int dateofBirth) {
        this.name = name;
        this.Surname = surname;
        this.Department = department;
        this.Salary = salary;
        this.DateofBirth = dateofBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(int dateofBirth) {
        DateofBirth = dateofBirth;
    }


    public void ageC(){

        if (getDateofBirth()<2005){
            System.out.println("\"Welcome to our company "+ name+" "+Surname+". You will work in "+ getDepartment() +"\n" +
                    "department. Your salary is "+Salary+" USD.\"\n");
            System.out.println("----------------------------------------");
        } else if (getDateofBirth()>2005) {
            System.out.println("\"We appreciate your interest in our company "+ name+" "+Surname+". But we can't hire you\n" +
                    "as per labor laws. Please come back when you are 18.\"");

            System.out.println("----------------------------------------");
        }else {
            System.out.println("\"We have an internship opportunity for you "+ name+" "+Surname+". After 3-month\n" +
                    "internship, we will offer you a position in our "+Department+" with a salary of "+Salary+".");
            System.out.println("----------------------------------------");
        }

    }
}

