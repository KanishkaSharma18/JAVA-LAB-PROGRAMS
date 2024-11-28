class MessageThread extends Thread {
    private String message;
    private int interval;
    private int count;

    
    public MessageThread(String message, int interval, int count) {
        this.message = message;
        this.interval = interval;
        this.count = count;
    }

    
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
                Thread.sleep(interval); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Message2Threads {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("BMS College of Engineering", 10000, 5); // 10 seconds, 5 times
        MessageThread thread2 = new MessageThread("CSE", 2000, 5); // 2 seconds, 5 times

        thread1.start();
        thread2.start();
    }
}
