package week4.salarycalculator;

/**
 * Class for an employee that has String name, double salary, int workHours, int hireYear instances.
 * Class methods calculate the tax,bonus and salary raise base on the net salary.
 * Class method of overridden toString represents the class object's information.
 */
public class Employee {
    private String name; //employee name
    private double salary; //employee gross salary
    private int workHours; //total working hours
    private int hireYear; //Hiring year

    /**
     * All argument constructor that creates an Employee object
     * @param theName is initial name of the employee
     * @param theSalary is initial gross salary of an employee
     * @param theWorkHours is initial total working hours of an employee
     * @param theHireYear is initial year of hiring year of an employee
     */
    public Employee(String theName, double theSalary,
                    int theWorkHours,int theHireYear){
        name = theName;
        salary = theSalary;
        workHours = theWorkHours;
        hireYear = theHireYear;
    }

    /**
     * This method does not take any argument. It calculates the tax of an employee.
     * If the salary of an employee is less than 1000 then there will not be tax calculated.
     * If the salary of an employee is greater than 1000 then the tax will be %3 of employee salary.
     * @return the tax value as double
     */
    public double tax(){
        if (salary<1000){
            return 0;
        } else{
            return salary*0.03;
        }
    }

    /**
     * This method calculates the bonus salary for extra working hours.
     * If the employee's working hours is less or equal to 40 hours then there will not be bonus salary.
     * If the employee's working hours is greater than 40 hours then bonus salary will be 30 turkish
     * lira for each extra hours.
     * @return the bonus value as decimal
     */
    public double bonus(){
        if (workHours<=40){
            return 0;
        } else {
            return (workHours-40)*30;
        }
    }

    /**
     * This method calculates the salary raise of an employee base on total working years.
     * If the employee's total working years is less than 10 years, then salary raise will be %5 of the net salary.
     * If the employee's total working years is greater than 10 years or less than 20 years then salary raise will
     * be %10 of the net salary.
     * If the employee's total working years is greater than 20 years then salary raise will be %15 of the net salary.
     * @return the net salary as double
     */
    public double raiseSalary(){
        int totalWorkingYear = 2021 - hireYear;
        //double netSalary = ( salary + bonus() ) - tax();

        if (totalWorkingYear<10){
            return salary*0.05;
        } else if (totalWorkingYear<20){
            return salary*0.10;
        } else {
            return salary*0.15;
        }
    }

    /**
     * Overridden toString method that represents the employee object information.
     * @return a string representation of the employee object.
     */
    public String toString(){
        return ("Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Raise: " + raiseSalary() +
                "\nNet Salary: " + (salary+bonus()-tax()) +
                "\nTotal Salary: " + (salary+raiseSalary()+bonus()-tax()));
    }
}