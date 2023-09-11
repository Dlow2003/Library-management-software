package Constructor;

public class Person {
    private int age;
    private String name;
    private String language;
    private String address;

    public Person(String name, int age, String language, String address) {
        this.age = age;
        this.name = name;
        this.language = language;
        this.address = address;

    }

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showinfo() {
        System.out.println("Info of person: ");
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
        System.out.println("Language: " + getLanguage());
        System.out.println("Name: " + getName());
    }
}
