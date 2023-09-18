import java.util.Scanner;

class Calc implements Runnable {
    public void run() {
        System.out.println("Calculation Task Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Please Enter Second Number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation Task Ended");
        System.out.println("********************************");
    }
}

class Message implements Runnable {
    public void run() {
        System.out.println("Display Important Message Task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is Important to Master Skill");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
        System.out.println("Display Import Message Task ended");
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        // System.out.println("Before Thread Manipulation");
        // System.out.println("Main Thread Name:- " + Thread.currentThread().getName());
        // System.out.println("Main Thread Priority:- " +
        // Thread.currentThread().getPriority());
        // System.out.println("After Thread Manipulation");
        // Thread t = new Thread();
        // t.currentThread().setName("Lucky");
        // t.currentThread().setPriority(1);
        // System.out.println("Main Thread Name:- " + Thread.currentThread().getName());
        // System.out.println("Main Thread Priority:- " +
        // Thread.currentThread().getPriority());

        // MyThread t = new MyThread();
        // t.start();
        System.out.println("Main Thread Started");
        Calc t1 = new Calc();
        Message t2 = new Message();
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);
        t3.start();
        t4.start();
    }
}
