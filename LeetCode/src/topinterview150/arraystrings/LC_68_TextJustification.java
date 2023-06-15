package src.topinterview150.arraystrings;

import java.util.ArrayList;
import java.util.List;


/*

Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]

 */

public class LC_68_TextJustification {

    public static void main(String[] args) {
        System.out.println(fullJustify(new String[] {
                "This", "is", "an", "example", "of", "the", "justification."
        }, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while(index < words.length) {
            StringBuilder sb = new StringBuilder();
            sb.append(words[index]);
            int count = words[index].length();
            int last = index + 1;
            while(last < words.length && count <= maxWidth) {
                if(count + 1 + words[last].length() > maxWidth) break;
                count += 1 + words[last].length();
                last++;
            }

            int normalSpaces = last - index - 1;
            if(last == words.length || normalSpaces == 0) {
                for(int i=index+1; i<last; i++) {
                    sb.append(" ");
                    sb.append(words[i]);
                }
                sb.append(" ".repeat(Math.max(0, maxWidth - sb.length())));
            }

            else {
                int actualSpaces = (maxWidth - count) / normalSpaces;
                int remainingSpaces = (maxWidth - count) % normalSpaces;
                for(int i=index+1; i<last; i++) {
                    sb.append(" ".repeat(actualSpaces));
                    if(remainingSpaces > 0) {
                        sb.append(" ");
                        remainingSpaces--;
                    }
                    sb.append(" ");
                    sb.append(words[i]);
                }
            }

            result.add(sb.toString());
            index = last;
        }
        return result;
    }

}
