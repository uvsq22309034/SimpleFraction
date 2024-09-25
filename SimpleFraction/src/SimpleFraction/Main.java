package SimpleFraction;

public class Main {

	public static void main(String[] args) {
		
		// Activer les assertions
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);

     // Test de création de fractions
        Fraction f1 = new Fraction(1, 2); // 1/2
        Fraction f2 = new Fraction(3, 4); // 3/4
//System.out.println(f1);
assert f1.toString().equals("Je suis une fraction") : "Erreur c'est n'est pas une fraction";
	}

}
