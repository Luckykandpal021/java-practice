// handling is handling an exception whereas ducking is bachna from exception  like b() keh rha hai mein nahi karuga handle
// exception jo mujhe call kar rha hai wahi handle karega exception

class Demo {
    public void a() throws Exception {
        b();
        System.out.println("result b");
        c();
    }

    public void b() throws Exception {
        int num1 = 8;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println("result");
        System.out.println(result);
        System.out.println("result1");

    }

    public void c() {
        System.out.println("C :- CALLS");
    }

}

public class ExceptionDuck {
    public static void main(String[] args) {
        try {
            Demo obj = new Demo();
            obj.a();
        } catch (Exception e) {
            System.out.println("ERROR:-" + e);
        }

    }
}
