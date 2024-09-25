package SimpleFraction;

public class Fraction {
	
	private int numerator;
    private int denominator;

    // Constructeur
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
 // Représentation en chaîne de la fraction
    @Override
    public String toString() {
        return "Je suis une fraction";
    }

}
