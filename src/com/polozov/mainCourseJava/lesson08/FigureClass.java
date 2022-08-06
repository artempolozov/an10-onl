package com.polozov.mainCourseJava.lesson08;

public class FigureClass {
    public static void main(String[] args) {
//        Printable circle = new Circle();
//        Printable rectangle = new Rectangle();
//
//        Printable[] figures = new Printable[]{circle, rectangle};
//
//        for (Printable p : figures) {
//            p.print(10, 5);
//            p.fillColor("yellow");
//            if (p instanceof Rectangle) {
//                ((Rectangle) p).print(1,2, 3);
//            }
//        }

//        Sizable square = new Square();
//        square.draw();
//        square.reduceSize();
//        square.hide();
//
//        Drawable.someStaticMethod();
//        System.out.println(Drawable.LINE_SIZE);

        TShortClass tShort1 = new TShortClass("L", "black", new Circle());
        TShortClass tShort2 = new TShortClass("XL", "black", new Rectangle());
        tShort1.presentTShort();
        tShort2.presentTShort();
    }
}
