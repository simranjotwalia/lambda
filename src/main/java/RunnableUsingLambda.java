public class RunnableUsingLambda {
    public static void main(String[] args) {
        Runnable runnableLambdaImplementationExample_one = () -> System.out.println("Hello Simran");

        Runnable runnableLambdaImplementationExample_two = () -> {
            double random = Math.random();
            System.out.println("Today's lucky number is: " + random);
        };

        Thread runnerThread_one = new Thread(runnableLambdaImplementationExample_one);
        Thread runnerThread_two = new Thread(runnableLambdaImplementationExample_two);

        //run
        runnerThread_one.start();
        runnerThread_two.start();
    }
}
