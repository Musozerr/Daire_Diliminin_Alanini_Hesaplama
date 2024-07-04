import java.util.Scanner;

public class Daire_dilimi {
    public static void main(String[] args) {
        double r,a,pi,alan,dilimalanı;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yaricapini Giriniz : ");
        r = input.nextDouble();
        System.out.println("Merkez Aci Olcusunu Giriniz : ");
        a = input.nextDouble();
        pi = 3.14;
        alan = (pi*r*r);
        dilimalanı = (alan*a) / 360;
        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Merkez Acisinin (a) alani :" + dilimalanı);


    }
}
