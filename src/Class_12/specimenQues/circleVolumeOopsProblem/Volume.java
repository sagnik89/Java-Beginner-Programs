package Class_12.specimenQues.circleVolumeOopsProblem;

public class Volume {

    Circle base; // Composition: Volume has a Circle as its base
    double height, volume;

    Volume(double r, double h) {
        base = new Circle(r); // Create a Circle object as the base
        height = h;
    }

    double calculate() {
        volume = base.area * height;
        return volume;
    }

    void display() {
        base.display();
        System.out.println("Volume of the cylinder: " + volume);
    }
}
