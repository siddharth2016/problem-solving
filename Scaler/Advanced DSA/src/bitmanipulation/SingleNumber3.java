package src.bitmanipulation;

public class SingleNumber3 {

    public int[] solve(int[] A) {
        int[] result = new int[2];
        int temp = 0;
        for(int elem: A) {
            temp ^= elem;
        }

        int pos = 0;
        while((temp & 1) != 1) {
            temp = temp>>1;
            pos++;
        }

        int a = 0;
        int b = 0;
        for(int elem: A) {
            if((elem & (1<<pos)) > 0) a ^= elem;
            else b ^= elem;
        }
        result[0] = a;
        result[1] = b;
        if(a > b) {
            result[0] = b;
            result[1] = a;
        }
        return result;
    }

}
