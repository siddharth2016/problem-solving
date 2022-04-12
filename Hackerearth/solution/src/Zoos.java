import java.util.Scanner;

public class Zoos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int countz = 0;
        int counto = 0;
        for(Character c: str.toCharArray()) {
            if(c == 'z') countz++;
            else counto++;
        }
        System.out.println(2 * countz == counto ? "Yes" : "No");
    }

}
