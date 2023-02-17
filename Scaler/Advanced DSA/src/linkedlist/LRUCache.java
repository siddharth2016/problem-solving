package src.linkedlist;

import java.util.HashMap;
import java.util.Scanner;

public class LRUCache {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution solution = new Solution(4);
        for(int i=0; i<32; i++) {
            char query = scan.next().charAt(0);
            if(query == 'S') {
                int key = scan.nextInt();
                int val = scan.nextInt();
                solution.set(key, val);
                solution.printList();
            }
            else {
                int key = scan.nextInt();
                System.out.println(solution.get(key));
                solution.printList();
            }
        }
    }

    public static class Solution {

        public int capacity;

        public HashMap<Integer, Integer> keyValue;

        public HashMap<Integer, DLLNode> keyNode;

        public static class DLLNode {
            public int val;
            public DLLNode next;
            public DLLNode prev;

            public DLLNode(int val) {
                this.val = val;
            }
        }

        public DLLNode head;

        public DLLNode tail;

        public Solution(int capacity) {
            this.capacity = capacity;
            this.keyValue = new HashMap<>();
            this.keyNode = new HashMap<>();
        }

        public int get(int key) {
            if (keyNode.containsKey(key)) {
                DLLNode node = keyNode.get(key);
                if(this.head != node) {
                    if (this.tail == node) {
                        this.tail = this.tail.prev;
                    }
                    if (node.prev != null) {
                        node.prev.next = node.next;
                    }
                    if (node.next != null) {
                        node.next.prev = node.prev;
                    }
                    if (this.head != null) {
                        this.head.prev = node;
                    }
                    node.next = this.head;
                    node.prev = null;
                    this.head = node;
                    if (this.tail == null) {
                        this.tail = this.head;
                    }
                }
                return keyValue.get(key);
            } else return -1;
        }

        public void set(int key, int value) {
            DLLNode newNode = new DLLNode(key);
            if (keyNode.containsKey(key)) {
                DLLNode node = keyNode.get(key);
                newNode = node;
                if(this.head != node) {
                    if (this.tail == node) {
                        this.tail = this.tail.prev;
                    }
                    if (node.prev != null) {
                        node.prev.next = node.next;
                    }
                    if (node.next != null) {
                        node.next.prev = node.prev;
                    }
                    if (this.head != null) {
                        this.head.prev = node;
                    }
                    node.next = this.head;
                    node.prev = null;
                    this.head = node;
                    if (this.tail == null) {
                        this.tail = this.head;
                    }
                }
            } else if (keyNode.size() == this.capacity) {
                keyNode.remove(this.tail.val);
                keyValue.remove(this.tail.val);
                DLLNode temp = this.tail.prev;
                this.tail.prev = null;
                this.tail = temp;
                if (this.tail != null && this.head != null) {
                    this.tail.next = null;
                    newNode.next = this.head;
                    this.head.prev = newNode;
                    this.head = newNode;
                } else {
                    this.head = newNode;
                    this.tail = this.head;
                }
            } else {
                if (this.head == null) {
                    this.head = newNode;
                    this.tail = this.head;
                } else {
                    newNode.next = this.head;
                    this.head.prev = newNode;
                    this.head = newNode;
                }
            }
            keyNode.put(key, newNode);
            keyValue.put(key, value);
        }


        public void printList() {
            DLLNode temp = head;
            System.out.println("Head - " + this.head.val);
            System.out.println("Tail - " + this.tail.val);
            int count = 0;
            while(temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
                if(count > 10) break;
                count++;
            }
            System.out.println();
        }
    }

}
