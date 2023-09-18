// class Car implements Runnable {
//     synchronized public void run() {
//         try {
//             System.out.println(Thread.currentThread().getName() + " Has Entered the parked slot");
//             Thread.sleep(2000);
//             System.out.println(Thread.currentThread().getName() + " Got Into Car to Drive");
//             Thread.sleep(2000);
//             System.out.println(Thread.currentThread().getName() + " Started to Drive the car");
//             Thread.sleep(2000);
//             System.out.println(Thread.currentThread().getName() + " Come Back and Parked the Car");
//             Thread.sleep(2000);
//         } catch (Exception e) {
//             System.out.println("Some Problem");
//         }
//     }
// }

class Car implements Runnable {
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Has Entered the parked slot");
            Thread.sleep(2000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Got Into Car to Drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to Drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Come Back and Parked the Car");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
    }
}

public class SynchronizedPractice {
    public static void main(String[] args) {
        Car car = new Car();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
