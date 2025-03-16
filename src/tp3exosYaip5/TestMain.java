package tp3exosYaip5;

public class TestMain {
    public static void main(String[] args) {
    	
    	// Test Circle class
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(4.0, "blue");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(circle3.getRadius());
        System.out.println(circle3.getColor());
        System.out.println(circle3.getArea());

        circle3.setRadius(5.0);
        circle3.setColor("yellow");

        System.out.println(circle3);
        System.out.println(circle3.getArea());

        // Test Cylinder class
        
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(4.0);
        Cylinder cylinder3 = new Cylinder(4.0, 10.0);
        Cylinder cylinder4 = new Cylinder(4.0, 10.0, "red");

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder4);

        System.out.println(cylinder4.getHeight());
        System.out.println(cylinder4.getVolume());

        cylinder4.setHeight(15.0);
        System.out.println(cylinder4);
        System.out.println(cylinder4.getVolume());
    }
}
