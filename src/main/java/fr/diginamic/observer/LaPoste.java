package fr.diginamic.observer;

import java.util.HashSet;
import java.util.Set;

public class LaPoste {
    private Set<BoiteALettre> abonnes;

    public LaPoste() {
        abonnes = new HashSet<>();
    }

    public void subscribe(BoiteALettre boite) {
        abonnes.add(boite);
    }

    public void unsubscribe(BoiteALettre boite) {
        abonnes.remove(boite);
    }

    public void publish(String message) {
        for (BoiteALettre boite : abonnes) {
            boite.notify(message);
        }
    }
}
