import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Employee emp = new Employee("Fatih", "Donat", "IT", 3000, 1998 );
        Employee emp1 = new Employee("Ozgur", "Gogersin", "IT", 5000, 2015);
        Employee emp2 = new Employee("Hidayet", "Boya", "IT", 1000, 2005);
        Employee emp3 = new Employee("Ogulcan", "Avcu", "IT", 4000, 2000);
        Employee emp4 = new Employee("Vehbi", "Bolat", "IT", 1500, 2005);

        Employee [] arr= {emp,emp1,emp2, emp3, emp4};

        for (int i = 0; i < arr.length; i++) {
            arr[i].ageC();
        }

    }


}
