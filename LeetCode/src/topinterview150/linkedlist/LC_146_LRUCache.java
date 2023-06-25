package src.topinterview150.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LC_146_LRUCache {

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1));
        lru.put(3, 3);
        System.out.println(lru.get(2));
        lru.put(4, 4);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }

    static class LRUCache {
        Node head;
        Node tail;
        Map<Integer, Node> map;
        int cap;

        public LRUCache(int capacity) {
            map = new HashMap<>();
            cap = capacity;
        }

        public int get(int key) {
            if(map.containsKey(key)) {
                Node node = map.get(key);
                Node newNode = new Node(key, node.val);
                update(node, newNode);
                map.put(key, newNode);
                return map.get(key).val;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(map.containsKey(key)) {
                Node node = map.get(key);
                Node newNode = new Node(key, value);
                update(node, newNode);
                map.put(key, newNode);
            }
            else {
                if(cap == map.size()) {
                    Node node = tail;
                    tail = tail.prev;
                    if(tail != null) {
                        tail.next = null;
                    }
                    else {
                        head = null;
                    }
                    node.prev = null;
                    map.remove(node.key);
                }

                Node newNode = new Node(key, value);
                if(head == null) {
                    head = newNode;
                    tail = newNode;
                }
                else {
                    head.prev = newNode;
                    newNode.next = head;
                    head = newNode;
                }
                map.put(key, newNode);
            }
        }

        public void update(Node node, Node newNode) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            node.prev.next = node.next;
            if(node.next != null) {
                node.next.prev = node.prev;
            }
            if(tail == node) {
                tail = tail.prev;
            }
            node.next = null;
            node.prev = null;
        }
    }

    static class Node {
        int key;
        int val;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
