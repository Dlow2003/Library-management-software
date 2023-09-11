package OverLoading;

public class Main {
    public static void main(String[] args) {
        School school=new School();
        school.setCode();
        System.out.println("code: "+school.getCode());
        school.setCode(123);
        System.out.println("code: "+school.getCode());
        school.setCode("SV234");
        System.out.println("code: "+school.getCode());
        school.setCode("IT",1234);
        System.out.println("code: "+school.getCode());
    }
}
