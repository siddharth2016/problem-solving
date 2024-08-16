package src.lld1.exceptions;

public class Client {

    public static void main(String[] args) {
        try {
            int n = 0;
            System.out.println(1 / n);;
        } catch (RuntimeException re) {
            re.printStackTrace();
            System.out.println("END");
        }
    }

}
