package Class_12.OOPS.Polymorphism;

// Polymorphism: The ability of an object to identify as more than one type. 

public class mainPolymorphism {
    
    public static void main(String[] args) {
        
        car Car = new car();
        bicycle Bicycle = new bicycle();
        boat Boat = new boat();

        // An array of objects whose common type is saved as vehicle as it is super class of all 
        // the objects present in the array. 

        vehicle[] racers = {Car, Bicycle, Boat};

        for (vehicle x: racers)
        {
            x.go();
        }
    }
}
