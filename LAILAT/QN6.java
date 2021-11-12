import java.util.Scanner;
class QN6{
    public static void main(String[]args){
        System.out.println("Write the perfomance number of employee");
        Scanner input = new Scanner(System.in);
        int perfomance = input.nextInt();
        System.out.println("Write the salary of employee");
        double salary_of_employee = input.nextDouble();
        if(perfomance >= 90){
         salary_of_employee += salary_of_employee * 0.03;
        }
            System.out.println("salary is "+salary_of_employee);
        
    }
}