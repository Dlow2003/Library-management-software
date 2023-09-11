package Exercise;

import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        System.out.println("Nhap so nguyen a : ");
        a=scanner.nextInt();
        System.out.println(a);
        if (a>=1){
            System.out.println(a+" la so nguyen duong");
        }
        else if (a==0) System.out.println(a);
        else System.out.println(a+" la so nguyen am");
    }
}
