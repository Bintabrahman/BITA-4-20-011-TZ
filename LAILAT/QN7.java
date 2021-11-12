import java.util.Scanner;
class QN7{
    public static void main(String[]args){
        int q, w, e;
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int x = scn.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int y = scn.nextInt();
        q = x;
        w = y;
        while(w != 0)
        {
            e = w;
            w = q%w;
            q = e;
        }
        int HCF = q;
        int LCM = (x*y)/HCF;
        System.out.println("HCF of "+ x + "and "+ y +"is = "+ HCF);
        System.out.println("And LCM of "+ x +" and "+ y +"is = "+ HCF);
    }
}