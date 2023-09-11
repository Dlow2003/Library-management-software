package Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(Fraction fraction1, Fraction fraction2, String operator) {
        fraction1.normalize();
        fraction2.normalize();
        switch (operator) {
            case "+":
                this.add(fraction1, fraction2);
                break;
            case "-":
                this.sub(fraction1, fraction2);
                break;
            case "*":
            case "x":
            case "X":
                this.multiply(fraction1,fraction2);
                break;
            case "/":
            case ":":
                this.divide(fraction1,fraction2);
                break;
        }
    }
// tong hai phan so : x/y + a/b=(x*b +a*y)/(y*b)
    private void add(Fraction fraction1, Fraction fraction2) {
   this.numerator=(fraction1.getNumerator()* fraction2.getDenominator()+ fraction2.getNumerator()* fraction1.getDenominator());
   this.denominator=(fraction1.getDenominator()* fraction2.getDenominator());
   this.normalize();
   this.mot();
    }
//hieu hai phan so
    private void sub(Fraction fraction1, Fraction fraction2) {
        this.numerator=(fraction1.getNumerator()* fraction2.getDenominator()- fraction2.getNumerator()* fraction1.getDenominator());
        this.denominator=(fraction1.getDenominator()* fraction2.getDenominator());

    }
//nhan 2 phan so
    private void multiply(Fraction fraction1, Fraction fraction2) {
        this.numerator=(fraction1.getNumerator()* fraction2.getNumerator());
        this.denominator=(fraction1.getDenominator()* fraction2.getDenominator());
    }
//chia 2 phan so
    private void divide(Fraction fraction1, Fraction fraction2) {
        this.numerator=(fraction1.getNumerator()* fraction2.getDenominator());
        this.denominator=(fraction1.getDenominator()* fraction2.getNumerator());
    }

    Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int UCLN(int x, int y) {
        int ucln = Math.min(x, y);
        while (ucln >= 1) {
            if (x % ucln == 0 && y % ucln == 0)
                return ucln;
            ucln--;
        }
        return ucln;
    }
    public void mot() {
        if(numerator == denominator) {
           System.out.println("1");
        }else System.out.println(this.print());
    }

    public String print() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    public boolean checkNormalize() {
        boolean flag = false;
        if (this.UCLN(getNumerator(), getDenominator()) == 1) return true;
        return false;
    }

    //toi gian phan so
    public void normalize() {
        int ucln = this.UCLN(getNumerator(), getDenominator());
        setNumerator(this.getNumerator() / ucln);
        setDenominator(this.getDenominator() / ucln);

    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
