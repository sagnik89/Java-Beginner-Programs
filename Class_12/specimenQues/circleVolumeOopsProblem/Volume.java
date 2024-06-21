package Class_12.specimenQues.circleVolumeOopsProblem;

public class Volume extends Circle {

    double height, volume;

    Volume(double h, double r) {
        super(r);
        height = h;
    }

    double calculate() {
        super.cal_area();
        volume = super.area * height;
        return volume;
    }

    void display() {
        super.display();
        System.out.println("Volume of the cylinder: " + volume);
    }

    public static void main(String[] args) {
        Volume ob = new Volume(10, 5);

        ob.calculate();
        ob.display();
    }
}