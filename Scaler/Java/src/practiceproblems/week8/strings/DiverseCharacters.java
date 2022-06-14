package practiceproblems.week8.strings;

public class DiverseCharacters {

    public int solve(final String A) {
        int count1 = 0;
        int count2 = 0;
        for(Character chr: A.toCharArray()) {
            if((int)'0'<=(int)chr && (int)chr<=(int)'9') {
                count2++;
            }
            else count1++;
        }
        return Math.max(count1, count2);
    }

}
