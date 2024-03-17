package Class_12.OOPS.Constructors;

/*
 * Main point to remember:
 *  Functionality of the "this" keyword. 
 *      The this keyword basically refers to the immediate object that is created by the class 
 *      and helps to access the member methods and various argument. 
 *      Ex: In this case, 
 *              the human constructor is defined with the following arguments but if we dont 
 *              write the this keyword here, it does not let the child class access and print the 
 *              value of the required(immediate) object. 
 */


public class Human {

    String name;
    int age;
    double weight;

    // constructor
    Human(String name, int age, double weight){

        // accesses the immediate object properties
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public void eat(){

        // this also accesses the immediate object properties rather than any specific value. 
        System.out.println(this.name + " is eating now! ");
    }
    
}
