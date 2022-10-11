import java.util.concurrent.Semaphore;
class BufferQueue{
 int item;
 static Semaphore semCon = new Semaphore(0);
 static Semaphore semProd = new Semaphore(1);
 void get()
 {
 try{
 semCon.acquire();
 }
 catch (InterruptedException e) {
 System.out.println("InterruptedException caught");
 }
 System.out.println("Item consumed by Consumer: " +item);
 semProd.release();
 }
 void put(int item) {
 try{
 semProd.acquire();
 }
 catch (InterruptedException e) {
 System.out.println("InterruptedException caught");
 }
 this.item = item;
 System.out.println("Item produced by Producer :" + item);
 semCon.release();
 }
}
class Producer implements Runnable{
 BufferQueue bufferQueue;
 Producer (BufferQueue bufferQueue)
 {
 this.bufferQueue = bufferQueue;
 new Thread(this, "Producer").start();
 }
 public void run()
 {
 for (int i = 0; 1 < 5; i++)
 bufferQueue.put(i);
 }
}
class Consumer implements Runnable{
 BufferQueue bufferQueue;
 Consumer (BufferQueue bufferQueue)
 {
 this.bufferQueue = bufferQueue;
 new Thread(this, "Consumer").start();
 }
 public void run()
 {
 for (int i = 0; i < 5; i++)
 bufferQueue.get();
 }
}
public class ProducerConsumer1050 {
 public static void main(String[] args) {

 BufferQueue bufferQueue = new BufferQueue ();
 new Consumer (bufferQueue);
 new Producer (bufferQueue);
 }
}
