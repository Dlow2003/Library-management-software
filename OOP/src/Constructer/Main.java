package Constructer;

public class Main {
    public static void main(String[] args) {
        Mydate mydate=new Mydate(23,02,2003);
        System.out.println(mydate.printDate());
        mydate.printDay();
        mydate.printMonth();
        mydate.printYear();
        mydate.printDate();

    }
}
