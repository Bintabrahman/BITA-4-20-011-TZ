import java.util.Scanner;
class QN8{
    public static void main(String[]args){
        System.out.println("Enter the minute");
        Scanner input = new Scanner(System.in);
        int minute = input.nextInt();
        int year = minute / 525600;
        int days = (minute % 525600)/1440;
        System.out.println(minute+"minute is approximately " +year+ "years and " +days+ "days");
    }
}