package practiceproblems.hashing;

import java.util.HashSet;
import java.util.List;

public class ValidSudoku {

    public boolean validRow(List<String> A) {
        for(int i=0; i<9; i++) {
            HashSet<Character> hs = new HashSet<>();
            for(int j=0; j<9; j++) {
                char val = A.get(i).charAt(j);
                if(val != '.' && hs.contains(val)) return false;
                hs.add(val);
            }
        }
        return true;
    }

    public boolean validCol(List<String> A) {
        for(int j=0; j<9; j++) {
            HashSet<Character> hs = new HashSet<>();
            for(int i=0; i<9; i++) {
                char val = A.get(i).charAt(j);
                if(val != '.' && hs.contains(val)) return false;
                hs.add(val);
            }
        }
        return true;
    }

    public boolean validMat(List<String> A) {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                HashSet<Character> hs = new HashSet<>();
                if(!checkMat(A, i*3, j*3, i*3 + 3, j*3 + 3, hs)) return false;
            }
        }
        return true;
    }

    public boolean checkMat(List<String> A, int starti, int startj, int endi, int endj,
                            HashSet<Character> hs) {
        for(int i=starti; i<endi; i++) {
            for(int j=startj; j<endj; j++) {
                char val = A.get(i).charAt(j);
                if(val != '.' && hs.contains(val)) return false;
                hs.add(val);
            }
        }
        return true;
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        if(validRow(A) && validCol(A) && validMat(A)) return 1;
        return 0;
    }

}
