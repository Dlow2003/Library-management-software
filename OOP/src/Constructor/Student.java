package Constructor;

public class Student extends Person{
    private  int score;

    public Student(String name, int age, String language, String address) {
        super(name, age, language, address);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
