# Compléments de programmation - TD 1

NGOUFACK ZAGOUM, CARNOT SORENSEN, 22309034, 65
     
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp)).
À chaque étape, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`).

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    
	> Lorsque nous cochons une de ces cases, le dépôt est initialisé avec un commit initial contenant les 			fichiers sélectionnés (README, .gitignore, et/ou LICENSE).
		le commit est souvent intitulé "Initial commit" ou un message spécifique en fonction de ce qui été 			coché. Il est créé automatiquement par la forge.
	 > Lorsque nous ne cochons aucune de ces cases, Dans ce cas, le dépôt est créé sans aucun fichier et est 		complètement vide. Il n'y pas de commit initial, ni de fichier.

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`) (cf. [Personnalisation de Git](https://git-scm.com/book/fr/v2/Personnalisation-de-Git-Configuration-de-Git));
    ```bash
    	git config --global user.name "Zagoum Carnot"
	git config --global user.email "zagoumcarnot@gmail.com"
    ```
1. Initialisez le dépôt `git` local pour le projet (cf. [Démarrer un dépôt Git](https://git-scm.com/book/fr/v2/Les-bases-de-Git-D%C3%A9marrer-un-d%C3%A9p%C3%B4t-Git));
    ```bash
    # git clone git@github.com:uvsq22309034/SimpleFraction.git
	Cloning into 'SimpleFraction'...
	Enter passphrase for key '/c/Users/MAGAT STORE/.ssh/id_rsa':
	warning: You appear to have cloned an empty repository.

    ```
1. Dans votre IDE, créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet (cf. [Méthode `main`](https://docs.oracle.com/javase/specs/jls/se19/html/jls-12.html#jls-12.1.4));
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements (cf. [Enregistrer des modifications dans le dépôt](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Enregistrer-des-modifications-dans-le-d%C3%A9p%C3%B4t));
    ```bash
    # Commandes pour valider les changements
	 $ git commit -m "Initial commit: creation des classes Fraction et Main et compilation "
	[main (root-commit) be0e7d3] Initial commit: creation des classes Fraction et Main et compilation
 	9 files changed, 68 insertions(+)
 	create mode 100644 .gitignore
 	create mode 100644 SimpleFraction/.classpath
 	create mode 100644 SimpleFraction/.gitignore
 	create mode 100644 SimpleFraction/.project
 	create mode 100644 SimpleFraction/.settings/org.eclipse.core.resources.prefs
 	create mode 100644 SimpleFraction/.settings/org.eclipse.jdt.core.prefs
 	create mode 100644 SimpleFraction/src/SimpleFraction/Fraction.java
 	create mode 100644 SimpleFraction/src/SimpleFraction/Main.java
 	create mode 100644 SimpleFraction/src/module-info.java

	
    ```
1. Ajoutez la méthode `toString` à la classe `Fraction` (cf. [`Object.toString`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#toString())) qui retournera la chaîne `"Je suis une fraction."` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // 	
		// Activer les assertions
        	ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);

     // Test de création de fractions
        Fraction f1 = new Fraction(1, 2); // 1/2
        Fraction f2 = new Fraction(3, 4); // 3/4
	System.out.println(f1);

    ```
1. Publiez vos modifications sur le dépôt distant (cf. [Travailler avec des dépôts distants](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Travailler-avec-des-d%C3%A9p%C3%B4ts-distants));
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
	git remote add origin https://github.com/uvsq22309034/SimpleFraction.git
	git add .
	git commit -m "Ajout de la méthode tostring"
	git push -u origin master
	
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Le fichier README.md utilise la syntaxe Markdown.
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # git pull
	Enter passphrase for key '/c/Users/MAGAT STORE/.ssh/id_rsa':
	remote: Enumerating objects: 4, done.
	remote: Counting objects: 100% (4/4), done.
	remote: Compressing objects: 100% (2/2), done.
	remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
	Unpacking objects: 100% (3/3), 1.01 KiB | 115.00 KiB/s, done.
	From github.com:uvsq22309034/SimpleFraction
   	f468b5d..312485f  main       -> origin/main
	Updating f468b5d..312485f
	Fast-forward
 	README.md | 1 +
 	1 file changed, 1 insertion(+)
 	create mode 100644 README.md


    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (cf. [`.gitignore` pour Java](https://github.com/github/gitignore/blob/main/Java.gitignore));
    ```bash
    # Copier ici le contenu de `.gitignore`
	/bin/

    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # .classpath
	.project
	/.settings/
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
	
	/bin/
	.classpath
	.project
	/.settings/
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique
	Pour Configurer l'accès à GitHub en utilisant une paire de clés SSH, il faut d'abord Générer une paire de 	clés SSH. Ensuite Ajouter la clé SSH à l'agent SSH puis copier la cle publique et l'ajouter a notre compte 	GitHub et Testez votre connexion SSH avec GitHub.

## Partie II (à faire durant le TD) : compléter la classe `Fraction`
Dans cet partie, vous compléterez les classes `Fraction` et `Main`.
Un exemple d'interface pour une telle classe est donné par la classe [`Fraction`](http://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](http://commons.apache.org/math/).

Vous respecterez les consignes ci-dessous :
* chaque méthode de `Fraction` sera testée dans `Main` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp));
* à la fin de chaque question, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`) puis validez les changements.

1. Ajoutez les attributs représentants le numérateur et le dénominateur (nombres entiers).
    ```Java
    // Déclaration des attributs
	public class Fraction {
    private int numerator;
    private int denominator;
	}

    ```
1. Ajoutez les constructeurs (cf. [Constructor Declarations](https://docs.oracle.com/javase/specs/jls/se19/html/jls-8.html#jls-8.8)) suivants :
    * initialisation avec un numérateur et un dénominateur,
    * initialisation avec juste le numérateur (dénominateur égal à _1_),
    * initialisation sans argument (numérateur égal _0_ et dénominateur égal à _1_),
    ```Java
    // Assertions pour tester les constructeurs (avec toString)

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

        System.out.println("Tous les tests sont passés avec succès !");
    	}
    ```
1. Ajoutez les fractions constantes ZERO (0, 1) et UN (1, 1) (cf. [Constants in Java](https://www.baeldung.com/java-constants-good-practices)),
    ```Java
    // Déclaration des constantes
	// Constantes pour les fractions 0/1 et 1/1
    	public static final Fraction ZERO = new Fraction(0, 1);
    	public static final Fraction UN = new Fraction(1, 1);
    ```
1. Ajoutez une méthode de consultation du numérateur et du dénominateur (par convention, en Java, une méthode retournant la valeur de l'attribut `anAttribute` est nommée `getAnAttribute`),
    ```Java
    // Définition des getters
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

    ```
1. Ajoutez une méthode de consultation de la valeur sous la forme d'un nombre en virgule flottante (méthode `doubleValue()`) (cf. [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html)),
   ```Java
    // Assertions pour tester la conversion
	// Test de la méthode doubleValue avec une fraction 3/4
        Fraction f4 = new Fraction(3, 4);
        assert Math.abs(f4.doubleValue() - 0.75) < 0.0001 : "Erreur : 0.75 attendu, mais obtenu " + 	f4.doubleValue();

        // Test de la méthode doubleValue avec une fraction 1/2
        Fraction f6 = new Fraction(1, 2);
        assert Math.abs(f6.doubleValue() - 0.5) < 0.0001 : "Erreur : 0.5 attendu, mais obtenu " + 	f6.doubleValue();
    ```
1. Ajoutez une méthode permettant l'addition de deux fractions (la méthode `add` prend en paramètre *une* fraction et *retourne* la somme de la fraction courante et du paramètre),
   ```Java
    // Assertions pour tester l'addition
	
     // Test addition
	Fraction f1=new Fraction(1,2);
	Fraction f2=new Fraction(3,4);
        Fraction resultAdd = f1.add(f2); // 1/2 + 3/4 = 5/4
        assert resultAdd.toString().equals("5/4") : "Erreur dans l'addition";
    ```
1. Ajoutez le test d'égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) (cf. [`java.lang.Object.equals`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object))),
   ```Java
    // Assertions pour tester l'égalité
	// Test d'égalité de fractions égales
        Fraction f7 = new Fraction(1, 2);
        Fraction f8 = new Fraction(2, 4); // Equivalent à 1/2
        assert f7.equals(f8) : "Erreur : f1 et f2 devraient être égales";

        // Test d'égalité avec une fraction simplifiée automatiquement
        Fraction f9 = new Fraction(4, 8); // Simplifiée en 1/2
        assert f7.equals(f9) : "Erreur : f1 et f3 devraient être égales";

        // Test d'inégalité entre fractions différentes
        Fraction f10 = new Fraction(3, 4);
        assert !f1.equals(f10) : "Erreur : f1 et f4 ne devraient pas être égales";

        // Test d'égalité avec ZERO et UN
        assert Fraction.ZERO.equals(new Fraction(0, 1)) : "Erreur : Fraction.ZERO et 0/1 devraient être égales";
        assert Fraction.UN.equals(new Fraction(1, 1)) : "Erreur : Fraction.UN et 1/1 devraient être égales";

    ```
1. Ajoutez la comparaison de fractions selon l'ordre naturel (cf. [`java.lang.Comparable`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Comparable.html)).
   ```Java
    // Assertions pour tester la comparaison
	   // Comparaison de 1/2 et 2/4 (égaux)
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assert f1.compareTo(f2) == 0 : "Erreur : f1 et f2 devraient être égales";

        // Comparaison de 1/2 et 3/4 (1/2 < 3/4)
        Fraction f3 = new Fraction(3, 4);
        assert f1.compareTo(f3) < 0 : "Erreur : f1 devrait être plus petite que f3";

        // Comparaison de 3/4 et 1/2 (3/4 > 1/2)
        assert f3.compareTo(f1) > 0 : "Erreur : f3 devrait être plus grande que f1";

        // Comparaison avec ZERO et UN
        assert Fraction.ZERO.compareTo(Fraction.UN) < 0 : "Erreur : Fraction.ZERO devrait être plus petite que 	Fraction.UN";
        assert Fraction.UN.compareTo(Fraction.ZERO) > 0 : "Erreur : Fraction.UN devrait être plus grande que 	Fraction.ZERO";

    	}
    ```
1. Faites hériter votre classe `Fraction` de la classe [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html) et complétez les méthodes
   ```Java
    // Vérifiez avec le code ci-dessous
    Number aNumber = java.math.BigDecimal.ONE;
    Number anotherNumber = new Fraction(1, 2);
    assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    ```
	> le code ci dessus ne compile pas il y'a une erreur de typage du coup il faut remplacer le type de 	anotherNumber en Fraction pour que ca puisse compiler.

## Partie III (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > j'utilise comme OS Windows et comme shell Bash
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # help nom_commande ou man nom_commande
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # ls -lh
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # wc -l fichier.txt

        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # grep "uneVariable" Main.java

        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # grep -r "uneVariable" --include="*.java"

        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # find . -type f -name "README.md"

        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # diff TD1.md README.md

        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Secure Shell (SSH) permet de se connecter de manière sécurisée à un serveur distant via un réseau, utile 	pour les développeurs lorsqu'ils doivent gérer des serveurs ou des systèmes à distance.
    * `screen`/`tmux`
        > Ce sont des multiplexeurs de terminaux qui permettent d'exécuter et de gérer plusieurs sessions de 	terminal à la fois, même en arrière-plan, ce qui est utile pour maintenir des processus actifs sur des 	serveurs distants après la déconnexion
    * `curl`/[HTTPie](https://httpie.org/)
        > Outils en ligne de commande pour effectuer des requêtes HTTP, utilisés par les développeurs pour tester 	et interagir avec des API web.
    * [jq](https://stedolan.github.io/jq/)
        > Un outil de ligne de commande pour traiter et manipuler des données JSON, essentiel pour analyser les 	réponses JSON d'API ou pour travailler avec des données structurées dans des scripts.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > l'IDE que j'utilise c'est Eclipse

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Ouvrez Eclipse.
	Dans la barre de menu, allez dans Project > Properties.
	Dans la fenêtre des propriétés, sélectionnez Resource (située dans la section "Info").
	Dans la section Text file encoding, sélectionnez Other et choisissez UTF-8 dans le menu déroulant.
	Cliquez sur Apply and Close.
1. Comment choisir le JDK à utiliser dans un projet ?
    > Ouvrez Eclipse et sélectionnez votre projet dans l'explorateur de projets.
	Cliquez avec le bouton droit sur le projet et sélectionnez Properties (Propriétés).
	Dans la fenêtre des propriétés du projet, allez dans Java Build Path (Chemin de construction Java).
	Cliquez sur l'onglet "Libraries" (Bibliothèques).
	Cliquez sur Add Library... (Ajouter une bibliothèque), sélectionnez JRE System Library (Bibliothèque du 	système JRE), puis cliquez sur Next (Suivant).
	Sélectionnez Alternate JRE (JRE alternatif) et choisissez le JDK que vous souhaitez utiliser dans la liste 	déroulante. Si le JDK désiré n'est pas listé, vous devrez l'ajouter d'abord en cliquant sur Installed 	JREs... (JREs installés) et en l'ajoutant manuellement.
	Cliquez sur Finish (Terminer), puis sur Apply and Close (Appliquer et fermer).
1. Comment préciser la version Java des sources dans un projet ?
    > Ouvrez Eclipse et sélectionnez votre projet dans l'explorateur de projets.
	Cliquez avec le bouton droit sur le projet et choisissez Properties (Propriétés).
	Dans la fenêtre des propriétés du projet, allez dans Java Compiler (Compilateur Java).
	Cochez la case Enable project specific settings (Activer les paramètres spécifiques au projet) si elle 	n'est pas déjà cochée.
	Dans le menu déroulant Compiler compliance level (Niveau de conformité du compilateur), choisissez la 	version de Java que vous souhaitez utiliser pour les sources. Par exemple, vous pouvez sélectionner 1.8 	pour Java 8, 11 pour Java 11, etc.
	Cliquez sur Apply and Close (Appliquer et fermer) pour enregistrer les modifications.
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Ouvrez Eclipse et sélectionnez votre projet dans l'explorateur de projets.
	Cliquez avec le bouton droit sur le projet et sélectionnez Properties (Propriétés).
	Dans la fenêtre des propriétés du projet, allez dans Java Build Path (Chemin de construction Java).
	Cliquez sur l'onglet "Libraries" (Bibliothèques).
	Cliquez sur Add JARs... (Ajouter des JAR) si la bibliothèque est déjà dans le répertoire de votre projet 	ou Add External JARs... (Ajouter des JAR externes) si la bibliothèque est stockée ailleurs sur votre 	système de fichiers.
	Naviguez jusqu'au fichier JAR de la bibliothèque que vous souhaitez ajouter, sélectionnez-le, puis cliquez 	sur Open (Ouvrir).
	Cliquez sur Apply and Close (Appliquer et fermer) pour enregistrer les modifications.
1. Comment reformater un fichier source Java ?
    > Ouvrez Eclipse et ouvrez le fichier Java que vous souhaitez reformater.
	Cliquez avec le bouton droit dans l'éditeur de code ou utilisez le menu supérieur pour accéder aux options 	de reformatage :
    	Menu contextuel : Cliquez avec le bouton droit dans la vue de l'éditeur de code et sélectionnez Source > 	Format.
   	 Raccourci clavier : Utilisez le raccourci clavier pour reformater le fichier. Par défaut, c'est Ctrl + 	Shift + F sur Windows/Linux ou Cmd + Shift + F sur macOS.
	Eclipse reformatera automatiquement le code source selon les conventions de style définies dans les 	préférences du projet.
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Ouvrez Eclipse et votre projet Java.
	Ouvrez le fichier source contenant l'utilisation de la variable ou de la méthode dont vous souhaitez 	trouver la déclaration.
	Placez le curseur sur le nom de la variable ou de la méthode.
	Cliquez avec le bouton droit et sélectionnez Open Declaration (Ouvrir la déclaration). Vous pouvez aussi 	utiliser le raccourci clavier :
    	F3 : Sur Windows/Linux et macOS.
	Eclipse ouvrira automatiquement le fichier où la variable ou la méthode est déclarée et placera le curseur 	à la ligne de déclaration.
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Ouvrez Eclipse et le fichier source dans lequel vous souhaitez insérer un snippet.
	Commencez à taper le nom du snippet que vous souhaitez utiliser. Eclipse propose des suggestions de 	snippets prédéfinis au fur et à mesure que vous tapez.
	Utilisez les suggestions de complétion automatique en appuyant sur Ctrl + Space (Windows/Linux) ou Cmd + 	Space (macOS) pour afficher les options disponibles.
	Sélectionnez le snippet souhaité dans la liste et appuyez sur Enter pour l'insérer.
1. Comment renommer une classe dans l'ensemble du projet ?
    > Ouvrez Eclipse et localisez la classe que vous souhaitez renommer dans l'explorateur de projets.
	Cliquez avec le bouton droit sur le nom de la classe dans l'éditeur de code ou dans l'explorateur de 	projets.
	Sélectionnez Refactor > Rename (Renommer) dans le menu contextuel. Vous pouvez également utiliser le 	raccourci clavier :
    	Alt + Shift + R (Windows/Linux et macOS).
	Une boîte de dialogue apparaîtra, vous permettant de saisir le nouveau nom de la classe. Tapez le nouveau 	nom de la classe.
	Eclipse affichera un aperçu des modifications qui seront apportées. Vous pouvez vérifier les changements 	pour vous assurer que toutes les références à la classe seront correctement mises à jour.
	Cliquez sur OK ou Finish pour appliquer les modifications.
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Ouvrez un terminal (cmd sur Windows, Terminal sur macOS/Linux).
	Naviguez jusqu'au répertoire contenant le fichier .class de votre programme Java ou assurez-vous que le 	classpath est correctement configuré.
	 java -cp <chemin_du_classpath> <nom_de_la_classe_principale> param1 param2
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Pour le développement Java, plusieurs paramètres et fonctionnalités sont particulièrement importants et 	utiles pour améliorer la productivité, la gestion du code, et la qualité du développement.
