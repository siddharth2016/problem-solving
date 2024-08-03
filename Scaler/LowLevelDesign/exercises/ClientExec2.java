package exercises;

import java.util.Scanner;

public class ClientExec2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            new ScalerThread(new TableCreator(i)).start();
        }

    }

}

class TableCreator implements Runnable {

    int num;
    public TableCreator(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i=1; i<11; i++) {
            System.out.println(this.num + " times " + i + " is " + (i*this.num));
        }
    }

}