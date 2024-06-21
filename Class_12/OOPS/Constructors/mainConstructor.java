package Class_12.OOPS.Constructors;

public class mainConstructor {

    public static void main(String[] args) {
        
        // so this creates an object "Sagnik" of the human class. 

        Human human1 = new Human("Sagnik", 18, 78.5);

        System.out.println(human1.name);
        human1.eat();
    }
    
}
