import java.util.Scanner;
class QN2{
    public static void main(String[]args){
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("What is your age?");
        Scanner xy = new Scanner(System.in);
        int age = xy.nextInt();

        System.out.println("What is your city were you live in?");
        Scanner qw = new Scanner(System.in);
        String city = qw.nextLine();

        System.out.println("What is the name of your collage?");
        Scanner er = new Scanner(System.in);
        String collage = er.nextLine();

        System.out.println("What is the professionality");
        Scanner rt = new Scanner(System.in);
        String professionality = rt.nextLine();

        System.out.println("What is the type animal you like");
        Scanner ty = new Scanner(System.in);
        String animal = ty.nextLine();

        System.out.println("What is the name of your pet");
        Scanner yu = new Scanner(System.in);
        String name_of_pet = yu.nextLine();
        System.out.print("There once was a person named "+name);
        System.out.print("who lived in"+city+".At the age of"+age);
        System.out.print(","+name+"went to collage at"+collage);
        System.out.print("."+name+"graduated and went to work as a"+professionality);
        System.out.print(".Then,"+name+"adopted a(n)"+animal+"named"+name_of_pet);
        System.out.print(".They both lived happily ever after");

   
    }
}