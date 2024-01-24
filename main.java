public class main {
    public static void main(String[] args) {
    ShapeFactory shapeFactory = ShapeFactory.getInstance();
    Shape shape1 = shapeFactory.getShape("SQUARE");
    shape1.draw();
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.draw();
    System.out.println("Hashcode of shape1 is "+ shape1.hashCode());
System.out.println("Hashcode of shape2 is "+ shape1.hashCode());   

    }
}