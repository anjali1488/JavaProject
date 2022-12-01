package TestPackage;

public class ShapesMain {
    public static void main(String[] args) {

        Square obj_square = new Square();
        obj_square.setLength(77.5);
        obj_square.setBreadth(77.5);
        System.out.println("Area of square: " +obj_square.findArea());
        System.out.println("Perimeter of square: " +obj_square.findPerimeter());

        Shape obj_shape = new Shape();
        obj_shape.setLength(77.5);
        obj_shape.setBreadth(77.5);
        System.out.println("Area of square: " +obj_shape.findArea());
        System.out.println("Perimeter of square: " +obj_shape.findPerimeter());

        //created an object of shape class but instantiating with Square class
        //so we r overriding Shape class method with Square class
        //run time method overriding
        Shape obj_shape1 = new Square();
        obj_shape1.setLength(77.5);
        obj_shape1.setBreadth(77.5);
        System.out.println("Area of square: " +obj_shape1.findArea());
        System.out.println("Perimeter of square: " +obj_shape1.findPerimeter());

       // Square obj_square1 = new Shape();

    }
}
