package src.topinterview150.stack;

import java.util.Deque;
import java.util.LinkedList;

public class LC_71_SimplifyPaths {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/.."));
        System.out.println(simplifyPath("/home//foo"));
        System.out.println(simplifyPath("/..../abc//../."));
        System.out.println(simplifyPath("/..hidden"));
        System.out.println(simplifyPath("/.hidden"));
    }

    public static String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        String[] paths = path.split("/");
        for (String s : paths) {
            String val = s.trim();
            if (!("".equals(val) || ".".equals(val) || "..".equals(val))) {
                stack.addLast(val);
            } else if ("..".equals(val)) {
                if (!stack.isEmpty()) stack.removeLast();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append("/");
            sb.append(stack.removeFirst());
        }
        if(sb.length() == 0) sb.append("/");
        return sb.toString();
    }

}
