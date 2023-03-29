package src.tries;
import java.util.*;

public class AutoComplete {
    public static void main(String[] args) {

        class Pair {
            String str;
            int wt;

            public Pair(String str, int wt) {
                this.str = str;
                this.wt = wt;
            }

            @Override
            public String toString() {
                return "Pair{" +
                        "str='" + str + '\'' +
                        ", wt=" + wt +
                        '}';
            }
        }

        class Node {
            char val;
            Map<Character, Node> map;
            ArrayList<Pair> pairArray;

            public Node(char val) {
                this.val = val;
                this.map = new HashMap<>();
                this.pairArray = new ArrayList<>();
            }
        }

        class Trie {
            public Node root;

            public Trie() {
                this.root = new Node('\0');
            }

            public void insert(Pair pair) {
                Node temp = this.root;

                for(Character chr: pair.str.toCharArray()) {
                    if(!temp.map.containsKey(chr)) {
                        temp.map.put(chr, new Node(chr));
                    }
                    temp = temp.map.get(chr);
                    if(temp.pairArray.size() < 5) {
                        temp.pairArray.add(pair);
                    }
                }
            }

            public ArrayList<Pair> search(String prefix) {
                Node temp = this.root;
                ArrayList<Pair> result = new ArrayList<>();

                for(Character chr: prefix.toCharArray()) {
                    if(!temp.map.containsKey(chr)) {
                        result.add(new Pair("-1", -1));
                        return result;
                    }
                    temp = temp.map.get(chr);
                }

                result.addAll(temp.pairArray);
                return result;
            }
        }

        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt(); scan.nextLine();
        while(test-- != 0) {
            int N = scan.nextInt();
            int M = scan.nextInt(); scan.nextLine();
            String[] words = new String[N];
            for(int i=0; i<N; i++) {
                words[i] = scan.next();
            }
            scan.nextLine();
            int[] weights = new int[N];
            for(int i=0; i<N; i++) {
                weights[i] = scan.nextInt();
            }
            scan.nextLine();
            String inputPrefix = scan.nextLine();
            String[] prefixes = inputPrefix.split(" ");

            ArrayList<Pair> pairList = new ArrayList<>();
            for(int i=0; i<N; i++) {
                pairList.add(new Pair(words[i], weights[i]));
            }

            pairList.sort((pair1, pair2) -> {
                return pair2.wt - pair1.wt;
            });

            System.out.println(pairList);

            Trie trie = new Trie();
            for(Pair pair: pairList) {
                trie.insert(pair);
            }

            for(int j=0; j<prefixes.length; j++) {
                String str = prefixes[j];
                ArrayList<Pair> result = trie.search(str);
                for(int i=0; i<result.size(); i++) {
                    System.out.print(result.get(i).str);
                    if(i != result.size() - 1) System.out.print(" ");
                }
                if(j != prefixes.length - 1) System.out.println();
            }
        }
    }
}
