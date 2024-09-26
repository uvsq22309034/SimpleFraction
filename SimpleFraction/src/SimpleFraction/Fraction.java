package SimpleFraction;

public class Fraction {
	
	private int numerator;
    private int denominator;
    
    
 // Constantes pour les fractions 0/1 et 1/1
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);
    
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

	// Constructeur avec numérateur et dénominateur
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
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
 // Méthode pour obtenir la valeur en double
    public double doubleValue() {
        return (double) numerator / denominator;
    }
    // Méthode pour additionner deux fractions 
    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }
    
 // Méthode pour simplifier la fraction
    private void simplify() {
        int gcd = gcd(numerator, denominator);  // Trouver le plus grand commun diviseur (PGCD)
        numerator /= gcd;
        denominator /= gcd;
        // Gérer le signe du dénominateur : toujours garder le signe sur le numérateur
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Méthode pour calculer le PGCD (Algorithme d'Euclide)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    // Redéfinition de la méthode equals pour tester l'égalité des fractions
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Vérifie si les deux références pointent vers le même objet
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si l'objet est null ou de type différent, ils ne sont pas égaux
        }
        Fraction other = (Fraction) obj;

        // Simplification automatique déjà effectuée, on compare simplement les numérateurs et dénominateurs
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // Redéfinition de hashCode pour être compatible avec equals
    @Override
    public int hashCode() {
        return 31 * numerator + denominator;  // Génère un code de hachage basé sur le numérateur et le dénominateur
    }

    

}
