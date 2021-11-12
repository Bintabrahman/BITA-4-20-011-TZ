import java.util.Scanner;
class QN3{
    public static void main(String[]args){
        System.out.println("enter tha number of participant");
        Scanner AS = new Scanner(System.in);
        int participant = AS.nextInt();
        int revenue = 2500 * participant;
        System.out.println("The revenue is " +revenue);
        }
}