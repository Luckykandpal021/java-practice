import java.util.Scanner;

class MyThread1 extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("CALC")) {
            calc();
        } else {
            importantMsg();
        }
    }

    public void calc() {
        System.out.println("Calculation Task Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Please Enter second Number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation Task Ended");
        System.out.println("*******************************************************");

    }

    public void importantMsg() {
        System.out.println("Displaying Important Message");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("FOCUS is Important to Master Skill");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
        System.out.println("Displaying Import Message Importantly");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        // Calc c1 = new Calc();
        // Thread t1 = new Thread(c1);
        // t1.start(); //register on Thread Sheduler
        // // at a time 2 class ko extend nahi kar skte
        // t1.run(); //no error but it will perform as a single threaded program
        System.out.println("Main Thread Started");
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.setName("CALC");
        t2.setName("PRINT");
        t1.start();
        t2.start();

    }
}
