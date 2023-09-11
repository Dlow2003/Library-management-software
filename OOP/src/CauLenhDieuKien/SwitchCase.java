package CauLenhDieuKien;

import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        int thang;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap thang");
        thang=scanner.nextInt();
        switch (thang){
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("Thang 2");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                System.out.println("vv");
        }
    }
}
