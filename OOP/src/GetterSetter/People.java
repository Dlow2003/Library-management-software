package GetterSetter;

import java.util.Calendar;

public class People {
    private int age;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Calendar calendar=Calendar.getInstance();


    public boolean showInfo() {
        System.out.println("info::");
        System.out.println("Age : " + this.getAge());
        System.out.println("Name: " + this.getName());
        System.out.println("Your Birth Year is: "+(calendar.get(Calendar.YEAR)-getAge()));

        return false;
    }

}
