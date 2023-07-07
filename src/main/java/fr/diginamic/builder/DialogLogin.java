package fr.diginamic.builder;

public class DialogLogin extends DialogBuilder {
    private static final ButtonFactory factory1 = null;

    public DialogLogin(ButtonFactory factory) {super(factory, factory1);};
    public void build(){
        System.out.println("Build password dialog");
    }
}
