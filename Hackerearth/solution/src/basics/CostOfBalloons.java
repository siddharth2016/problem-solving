// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/mojtaba-prepares-contest-29b2a044/

package basics;

import java.util.Scanner;

public class CostOfBalloons {

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases--!=0) {
            int greenCost = scanner.nextInt();
            int purpleCost = scanner.nextInt();
            int n = scanner.nextInt();
            int count1 = 0;
            int count2 = 0;
            while(n--!=0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                count1+=x;
                count2+=y;
            }
            int priceGreen1 = greenCost * count1;
            int pricePurple2 = purpleCost * count2;
            int priceGreen2 = greenCost * count2;
            int pricePurple1 = purpleCost * count1;
            int price1 = priceGreen1 + pricePurple2;
            int price2 = priceGreen2 + pricePurple1;
            System.out.println(Math.min(price1, price2));
        }
    }
}
