class Philosopher implements Runnable {
    private int id;
    private Fork leftFork;
    private Fork rightFork;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
    @Override
    public void run() {
        for(int i = 0; i < 2; i++){
            think();
            leftFork.pickUp();
            rightFork.pickUp();
            eat();
            rightFork.putDown();
            leftFork.putDown();
        }
    }
    // Логика философа во время размышлений
    private void think() {
        System.out.println("Философ " + id + " размышляет");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Логика философа во время приема пищи
    private void eat() {
        System.out.println("Философ " + id + " ест");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}