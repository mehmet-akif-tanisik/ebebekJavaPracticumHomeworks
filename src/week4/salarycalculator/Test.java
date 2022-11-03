package week4.salarycalculator;



public class Test {

    public static void main(String[] args) {

        Employee mehmet = new Employee("Mehmet",900,40,2018);
        Employee ahmet = new Employee("Ahmet",1000,41,2018);
        Employee halil = new Employee("Halil",1000,40,2012);
        Employee deniz = new Employee("Deniz",1000,40,2010);
        Employee eren = new Employee("Eren",2000,45,1985);

        System.out.println("IF TOTAL WORK HOURS LESS OR EQUAL TO 40 HOURS ");
        System.out.println("AND SALARY IS LESS THAN 1000 , SEE TAX AND BONUS\n");
        System.out.println(mehmet);
        System.out.println("----------------------------------------------------");
        System.out.println("IF TOTAL WORK HOURS GREATER THAN 40 HOURS ");
        System.out.println("AND SALARY IS GREATER THAN 1000 , SEE TAX AND BONUS\n");
        System.out.println(ahmet);
        System.out.println("----------------------------------------------------");
        System.out.println("IF TOTAL WORKING YEARS LESS THAN 10 YEARS\n");
        System.out.println(halil);
        System.out.println("----------------------------------------------------");
        System.out.println("IF TOTAL WORKING YEARS GREATER THAN 10 YEARS AND LESS THAN 20 YEARS\n");
        System.out.println(deniz);
        System.out.println("----------------------------------------------------");
        System.out.println("IF TOTAL WORKING YEARS GREATER THAN 20 YEARS\n");
        System.out.println(eren);

        /*
        OUTPUT OF OBJECT EREN AS FOLLOWS:

        Name: Eren
        Salary: 2000.0
        Work Hours: 45
        Hire Year: 1985
        Tax: 60.0
        Bonus: 150.0
        Salary Raise: 300.0
        Net Salary: 2090.0
        Total Salary: 2390.0

         */









    }
}
