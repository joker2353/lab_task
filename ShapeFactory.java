public class ShapeFactory {
    private static ShapeFactory instance=null;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.trim().equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.trim().equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}