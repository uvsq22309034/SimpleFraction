package SimpleFraction;

public class Fraction {
	
	private int numerator;
    private int denominator;

    /// Constructeur avec numérateur et dénominateur
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Constructeur avec seulement le numérateur (dénominateur égal à 1)
    public Fraction(int numerator) {
        this(numerator, 1);  // Appel au constructeur avec deux arguments
    }

    // Constructeur sans arguments (numérateur = 0, dénominateur = 1)
    public Fraction() {
        this(0, 1);  // Appel au constructeur avec deux arguments
    }
    
 // Redéfinition de la méthode toString
    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);  // Si le dénominateur est 1, ne pas afficher "/1"
        } else {
            return numerator + "/" + denominator;
        }
    }

}
