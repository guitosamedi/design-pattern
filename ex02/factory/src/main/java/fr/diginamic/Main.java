package fr.diginamic;

public class Main {
    public static void main(String[] args) {
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