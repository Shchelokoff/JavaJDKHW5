import java.util.concurrent.locks.ReentrantLock;

class Fork {
    private ReentrantLock lock;
    public Fork() {
        lock = new ReentrantLock();
    }
    public void pickUp() {
        lock.lock();
    }
    public void putDown() {
        lock.unlock();
    }
}