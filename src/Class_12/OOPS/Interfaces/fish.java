package Class_12.OOPS.Interfaces;

public class fish implements prey,predator{

    @Override
    public void hunt() {
       System.out.println("The fish is hunting a smaller fish! ");
    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing from the bigger fish! ");
    }
    
}
