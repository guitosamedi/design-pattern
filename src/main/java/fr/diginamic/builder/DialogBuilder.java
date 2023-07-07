package fr.diginamic.builder;

public abstract class DialogBuilder {
    private final ButtonFactory factory;

      public DialogBuilder(ButtonFactory factory, ButtonFactory factory1) {
          this.factory = factory1;
      }
}
