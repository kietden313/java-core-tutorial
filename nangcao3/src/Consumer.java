import java.util.Queue;

public class Consumer implements Runnable{
    private final Queue<String> messageQueue;

    public Consumer() {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        while (true){
            synchronized (messageQueue){
                while(messageQueue.isEmpty()) {
                    try{
                        messageQueue.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                String message = messageQueue.poll();
                System.out.println("Consumer consumed: "+message);

                messageQueue.notifyAll();
            }

            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
