package fr.diginamic;
import fr.diginamic.composite.CompoundGraphic;
import fr.diginamic.composite.Dot;
import fr.diginamic.composite.CircleCompo;
import fr.diginamic.prototype.CircleProto;
import fr.diginamic.prototype.Rectangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

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

*/
        System.out.println("----- Test de Iterator -----");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <10; i++){
            arrayList.add("Element :" + (i +1));
        }
        //arrayList.add("Element 1");
        //arrayList.add("Element 2");
        //arrayList.add("Element 3");
        //arrayList.add("Element 4");
        //arrayList.add("Element 5");
        //arrayList.add("Element 6");
        //arrayList.add("Element 7");
        //arrayList.add("Element 8");
        //arrayList.add("Element 9");
       // arrayList.add("Element 10");

        Vector<String> vector = new Vector<>();
        for (int i = 0; i <15; i++){
        vector.add("Elements " + (i +1));
        }
        //vector.add("Element 11");
        //vector.add("Element 12");
        //vector.add("Element 13");
        //vector.add("Element 14");
        //vector.add("Element 15");

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i <20; i++){
            hashSet.add("Element " + (i +1));
        }
       // hashSet.add("Element 16");
        //hashSet.add("Element 17");
        //hashSet.add("Element 18");
        //hashSet.add("Element 19");
       // hashSet.add("Element 20");

        afficheElement(arrayList);
        afficheElement(vector);
        afficheElement(hashSet);
    }

    public static void afficheElement(Iterable<String> iterable) {
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}