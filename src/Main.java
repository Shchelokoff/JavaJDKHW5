public class Main {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Fork[] forks = new Fork[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Fork();
        }
        for (int i = 0; i < numPhilosophers; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % numPhilosophers];
            philosophers[i] = new Philosopher(i + 1, leftFork, rightFork);
            Thread t = new Thread(philosophers[i]);
            t.start();
        }
    }
}




