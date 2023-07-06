package fr.diginamic;
import fr.diginamic.factory.Dialog;
import fr.diginamic.factory.HTMLDialog;
import fr.diginamic.factory.WindowsDialog;
import fr.diginamic.singleton.Singleton;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("----- Test de Singleton -----");
        // Singleton singleton = new Singleton(); constructeur private instance impossible
        Singleton singleton = Singleton.getInstance();
        //singleton.getMessage();
        System.out.println("Singleton : " + singleton);
        singleton.setMessage(" Message : " + singleton.getMessage());

        try {
            Singleton singleton2 = singleton.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println("Singleton2 : " + singleton2.clone());
        //singleton.setMessage(" Message2 : " + singleton2.getMessage());
        //System.out.println(singleton);

        System.out.println("----- Test de Factory -----");
        System.out.println("Affichages des boutons pour Windows");
        Dialog dialog = new WindowsDialog();
        dialog.render();

        System.out.println();
        System.out.println("Affichages des boutons pour HTML");
        dialog = new HTMLDialog();
        dialog.render();
        }
}