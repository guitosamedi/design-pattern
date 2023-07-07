package fr.diginamic.observer;

public class Maison implements BoiteALettre{
    private String name;

    public Maison(String name) {
        this.name = name;
    }
    @Override
    public void notify(String message) {
        System.out.println("Message reçu par la maison " + name + " : " + message);
    }
}
