package fr.diginamic;
import fr.diginamic.composite.CompoundGraphic;
import fr.diginamic.composite.Dot;
import fr.diginamic.composite.CircleCompo;
import fr.diginamic.prototype.CircleProto;
import fr.diginamic.prototype.Rectangle;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
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

        System.out.println("----- Test de Builder -----");
*/
        System.out.println("----- Test de Prototype -----");

        CircleProto circle = new CircleProto();
        circle.setX(20);
        circle.setY(0);
        circle.setColor("blue");
        circle.setRadius(5);

        CircleProto clonedCircle = circle.clone();
        clonedCircle.setColor("red");

        Rectangle rectangle = new Rectangle();
        rectangle.setX(25);
        rectangle.setY(0);
        rectangle.setColor("green");
        rectangle.setWidth(5);
        rectangle.setHeight(5);

        Rectangle clonedRectangle = rectangle.clone();
        clonedRectangle.setHeight(12);

        System.out.println("Circle (x=20, y=0, color=blue, radius=5) : " + circle);
        System.out.println("Clone Circle couleur « red » : " + clonedCircle);
        System.out.println("Rectangle (x=25, y=0, color=green, width=5, height=5) : " + rectangle);
        System.out.println("Clone Rectangle hauteur « 112 » : " + clonedRectangle);


        System.out.println("----- Test de Composite -----");
        CompoundGraphic root = new CompoundGraphic(1, 1);
        root.add(new Dot(2, 2));
        root.add(new CircleCompo(2, 2, 50));

        CompoundGraphic graph = new CompoundGraphic(10, 10);
        graph.add(new Dot(20, 20));
        graph.add(new CircleCompo(30, 20, 20));
        root.add(graph);

        root.draw();
        root.move(2, 2);
        root.draw();
    }
}