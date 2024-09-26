package SimpleFraction;

public class Main {

	public static void main(String[] args) {
		
		// Activer les assertions
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);

     // Test du constructeur avec numérateur et dénominateur
        Fraction f1 = new Fraction(3, 4);
        assert f1.toString().equals("3/4") : "Erreur : 3/4 attendu, mais obtenu " + f1;

        // Test du constructeur avec juste le numérateur (dénominateur = 1)
        Fraction f2 = new Fraction(5);
        assert f2.toString().equals("5") : "Erreur : 5 attendu, mais obtenu " + f2;

        // Test du constructeur sans argument (fraction par défaut)
        Fraction f3 = new Fraction();
        assert f3.toString().equals("0") : "Erreur : 0 attendu, mais obtenu " + f3;

        // Test du dénominateur égal à 1 (pas d'affichage de "/1")
        Fraction f5 = new Fraction(10, 1);
        assert f5.toString().equals("10") : "Erreur : 10 attendu, mais obtenu " + f5;
        
        // Test de la méthode doubleValue avec une fraction 3/4
        Fraction f4 = new Fraction(3, 4);
        assert Math.abs(f4.doubleValue() - 0.75) < 0.0001 : "Erreur : 0.75 attendu, mais obtenu " + f4.doubleValue();

        // Test de la méthode doubleValue avec une fraction 1/2
        Fraction f6 = new Fraction(1, 2);
        assert Math.abs(f6.doubleValue() - 0.5) < 0.0001 : "Erreur : 0.5 attendu, mais obtenu " + f6.doubleValue();

        System.out.println("Tous les tests sont passés avec succès !");
    }

	}


