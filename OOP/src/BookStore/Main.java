package BookStore;

import java.util.Scanner;

public class Main {
    static Book book=null;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int funtionID=0;
        boolean flag=true;
        do {
            showMenu();
            funtionID = scanner.nextInt();
            scanner.nextLine();
            switch (funtionID){
                case 1:addBook();break;
                case 2:editBook();break;
                case 3:inforBook();break;
                case 4:
                default:flag=false;
            }

        }while (flag==true);
        scanner.close();

    }
    public static void showMenu(){
        System.out.println("=========Books Manager========");
        System.out.println("1.Add a book");
        System.out.println("2.Edit Book");
        System.out.println("3.Info Book");
        System.out.println("4.Exit");
    }
    public static void addBook(){
        Scanner scanner=new Scanner(System.in);
        String BookName ="";
        int BookID=0;
        double BookPrice=0;
        System.out.println("ID: ");
        BookID=scanner.nextInt();
        System.out.println("Name: ");
        BookName=scanner.next();
        System.out.println("Price: ");
        BookPrice=scanner.nextDouble();
         book=new Book(BookID,BookName,BookPrice);



    }
    public static void editBook(){
        if (book!=null){
            Scanner scanner=new Scanner(System.in);
            String BookName ="";

            double BookPrice=0;

            System.out.println("Name: ");
            BookName=scanner.next();
            System.out.println("Price: ");
            BookPrice=scanner.nextDouble();
            book.setBookTitle(BookName);
            book.setPrice(BookPrice);

        }else System.out.println("NOT Exist!!!");
    }
    public static void inforBook(){

        if (book!=null){

            book.showInfor();

        }else System.out.println("NOT Exist!!!");


}
}
