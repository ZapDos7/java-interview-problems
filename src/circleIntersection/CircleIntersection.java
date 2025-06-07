package circleIntersection;


import java.util.ArrayList;
import java.util.List;
import utils.InputReader;

public class CircleIntersection {
    public static void main(String[] args){
        List<Circle> circles = new ArrayList<>(2);
        for (int i = 1; i < 3; i++) {
            System.out.println("Enter the coordinates and radius for circle " + i + ": ");
            try{
                int x = InputReader.readInt();
                int y = InputReader.readInt();
                int radius = InputReader.readInt();
                circles.add(new Circle(x, y, radius));
            } catch (Exception e) {
                System.err.println("Invalid input");
                return;
            }
        }
        compareCircles(circles.get(0), circles.get(1));
    }

    private static void compareCircles(Circle c1, Circle c2) {
        int centresDistance = getDistance(c1, c2);
        if (centresDistance == c1.radius + c2.radius) {
            System.out.println("The circles are tangential.");
        } else if (centresDistance < c1.radius + c2.radius) {
            System.out.println("The circles overlap.");
        } else {
            System.out.println("The circles have no common points.");
        }
    }

    private static int getDistance(Circle c1, Circle c2) {
        return (int) (Math.sqrt(c1.x - c2.x) + Math.sqrt(c1.y - c2.y));
    }

    private static class Circle {
        int x;
        int y;
        int radius;

        public Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }
}
