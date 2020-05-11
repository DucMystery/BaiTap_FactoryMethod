public class FactoryPatternDemo {

    public static void main(String[] args) {


        String c1 = "circle";
        String r1 = "Rectangle";

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape(c1).draw();
        shapeFactory.getShape(r1).draw();
    }
}
