package Class_12.OOPS.Abstraction;

public class cow extends animal {

    // abstract method implemented
    void baby() {
        System.out.println("Cow's baby is the calf. ");
    }

    public static void main(String[] args) {
        cow ob = new cow();
        ob.baby();
    }

}
