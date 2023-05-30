package src.topinterview150;

public class LC_58_LengthOfTheLastWord {

    public int lengthOfLastWord(String s) {
        String[] stringSplit = s.split(" ");
        return stringSplit[stringSplit.length - 1].length();
    }

}
