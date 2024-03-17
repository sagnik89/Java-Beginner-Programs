package Class_12.OOPS.Interfaces;

/*
 * Interface: A template that can be applied to a class, similar to inheritance, but specifies 
 *            what a class must do. Classes can apply more than one interfaces but inheritance is 
 *            limited to one super class.   
 * 
 * IMP note: Interfaces are similar to inhertiance but you specify what you do with the   
 *           implementations. 
 */

public class mainInterface {

    public static void main(String[] args) {

        // test code
        // rabbit Rabbit = new rabbit();

        // Rabbit.flee();

        // hawk Hawk = new hawk();
        // Hawk.hunt();

        fish Fish = new fish();

        Fish.flee();
        Fish.hunt();
    }

}
