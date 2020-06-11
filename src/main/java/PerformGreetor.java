/**
 * In this case 'executeGreet' is only taking behavior as an argument. It can execute any greet that is passed to it.
 */
public class PerformGreetor {
    public void executeGreet(GreetingInterface genericGreeting) {
        genericGreeting.perform();
    }

    public static void main(String[] args) {
        GreetingInterface helloWorldGreet = new GreetingInterface() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };

        GreetingInterface iLoveProgramming = new GreetingInterface() {
            @Override
            public void perform() {
                System.out.println("I love Programming");
            }
        };

        PerformGreetor performGreetor = new PerformGreetor();
        performGreetor.executeGreet(helloWorldGreet);
        performGreetor.executeGreet(iLoveProgramming);
    }
}
