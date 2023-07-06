package fr.diginamic.builder;

public abstract class Dialog implements ButtonFactory{

    public void render() {
        Button okButton = createButton();
        okButton.onClick("Ok");
        okButton.render();

        Button annulerButton = createButton();
        annulerButton.onClick("Annuler");
        annulerButton.render();
    }
}
