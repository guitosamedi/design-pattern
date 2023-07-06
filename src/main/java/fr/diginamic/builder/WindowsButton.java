package fr.diginamic.builder;

public class WindowsButton implements Button{

    private String action;

    @Override
    public void onClick(String action) {
        this.action = action;
    }

    @Override
    public void render() {
        System.out.println("+--------+");
        System.out.println("| Bouton | -> " + action);
        System.out.println("+--------+");
    }
}
