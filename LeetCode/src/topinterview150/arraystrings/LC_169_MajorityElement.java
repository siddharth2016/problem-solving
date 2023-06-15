package src.topinterview150.arraystrings;

public class LC_169_MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int majElem = 0;
        for(int val: nums) {
            if(count == 0 || majElem == val) {
                majElem = val;
                count++;
            }
            else {
                count--;
            }
        }
        return majElem;
    }

}
