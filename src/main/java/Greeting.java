/*
Let's say we have a Greeting class. Now Greeting class is having greet() method that prints the greet.
Now let's say we want to greet something else, but now my greet is designed to only print hello world.
What if instead of this, greet accepts an BEHAVIOR and execute that BEHAVIOR. This is done in @GreetingInterface class
 */

public class Greeting {
    public void greet() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
    }
}
