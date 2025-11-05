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
public class RegularPolygon {
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
