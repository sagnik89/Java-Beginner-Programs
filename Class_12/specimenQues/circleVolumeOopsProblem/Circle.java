package Class_12.specimenQues.circleVolumeOopsProblem;

public class Circle {

    double radius, area;

    Circle(double r) {
        radius = r;
    }

    void cal_area() {
        area = 3.14 * radius * radius;
    }

    void display() {
        System.out.println("Area of the circle is: " + area);

    }
}
