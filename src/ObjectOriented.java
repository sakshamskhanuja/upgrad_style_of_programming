/**
 * Following code represents the Object-Oriented style of Programming.
 */
public class ObjectOriented {

    // Stores the radius of the circle.
    public static float radius = 10F;

    public static void main(String[] args) {
        // Prints the area of the circle.
        System.out.println(Circle.getArea(radius));
    }
}

/**
 * Contains method to calculate the area of a circle.
 */
class Circle {

    /**
     * Calculates the area of a circle.
     *
     * @param radius Radius of the circle.
     * @return Area of the circle.
     */
    public static float getArea(float radius) {
        return 3.141F * radius * radius;
    }
}