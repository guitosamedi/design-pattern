package fr.diginamic.builder;

public class HTMLButton implements Button{

    private String action;
    @Override
    public void render() {
        System.out.println("<button href='" + action + "'>");
    }

    @Override
    public void onClick(String action) {
        this.action = action;
    }
}
