package fr.diginamic.builder;

public class DialogLogin extends DialogBuilder {
    public DialogLogin(ButtonFactory factory) {super(factory)};
    public void build(){
        System.out.println("Build password dialog");
    }
}
