import java .util.Scanner;
class QN4{
    public static void main(String[]args){
        System.out.println("Write the numbar of gallons of gas in the tank");
        Scanner input = new Scanner(System.in);
        int number_of_galoon = input.nextInt();
        
        System.out.println("Write the number of galoon per miles");
        Scanner as = new Scanner(System.in);
        int number_of_galoon_per_miles = as.nextInt();

        System.out.println("Write the price of gas per gallos");
        Scanner df = new Scanner(System.in);
        int price = df.nextInt();

        int distance = number_of_galoon * number_of_galoon_per_miles;
        System.out.println("The distance when the car travel is"+distance);

        int cost_of_travel = 250 % number_of_galoon_per_miles;
        System.out.println("The cost is"+cost_of_travel);
      
            }
}