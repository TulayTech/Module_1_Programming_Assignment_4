package Module_1_Programming_Assignment_4;
/**
Exercise 9.9 — Geometry: n-sided regular polygon

    A RegularPolygon object represents a polygon where:
    - all sides are equal in length
    - all angles are equal in measure

    Formula for area:
    - area = (n * side^2) / (4 * tan(π / n))

This program creates three RegularPolygon objects and displays each polygon's perimeter and area.
*/
public class TestRegularPolygon {
    public static void main(String[] args) {

        // Creating three RegularPolygon objects using different constructors
        RegularPolygon polygon1 = new RegularPolygon();  // (triangle)
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // Hexagon
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8); // Decagon

        // Format to display perimeter and area for each polygon
        System.out.println("Polygon 1: Perimeter = " + polygon1.getPerimeter()
                + " Area = " + polygon1.getArea());

        System.out.println("Polygon 2: Perimeter = " + polygon2.getPerimeter()
                + " Area = " + polygon2.getArea());

        System.out.println("Polygon 3: Perimeter = " + polygon3.getPerimeter()
                + " Area = " + polygon3.getArea());
    }

}

class RegularPolygon {

    // Private data fields for encapsulation
    private int n = 3;        // number of sides (default 3)
    private double side = 1;  // length of each side (default 1)
    private double x = 0;     // x-coordinate of center
    private double y = 0;     // y-coordinate of center

   // creates a default triangle (3 sides of length 1)
    public RegularPolygon() {
    }

  // Constructor for specified number of sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

// Constructor for specified sides, length, and center coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Returns the number of sides.
    public int getN() {
        return n;
    }

    // Set a new number of sides.
    public void setN(int n) {
        this.n = n;
    }

    // Returns the side length.
    public double getSide() {
        return side;
    }

    // Set a new side length.
    public void setSide(double side) {
        this.side = side;
    }

    // Returns the x-coordinate of the center.
    public double getX() {
        return x;
    }

    // Set a new x-coordinate.
    public void setX(double x) {
        this.x = x;
    }

    // Returns the y-coordinate of the center.
    public double getY() {
        return y;
    }

    // Set a new y-coordinate.
    public void setY(double y) {
        this.y = y;
    }

    // Returns the perimeter of the polygon.
    public double getPerimeter() {
        return n * side;
    }

    // Returns the area using the formula for the area
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}