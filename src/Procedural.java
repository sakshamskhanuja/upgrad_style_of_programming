/**
 * Following code represents the Procedural style of Programming.
 */
public class Procedural {

    // Stores the radius of a circle.
    public static float radius = 10F;

    public static void main(String[] args) {
        // Prints the area of a circle.
        System.out.println(getArea(radius));
    }

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