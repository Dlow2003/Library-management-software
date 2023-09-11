package Constructer;

public class Mydate {
    private int day;
    private int month;
    private int year;

    public Mydate(int day, int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;


    }
    public void printDay(){
        System.out.println("Day= "+this.day);
    }
    public void printMonth(){
        System.out.println("month= "+this.month);
    }
    public void printYear(){
        System.out.println("year= "+this.year);
    }
    public boolean printDate(){
        System.out.println("Mydate= "+this.day+"/"+this.month+"/"+this.year);
        return true;
    }

}

