/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l26m1
 */
public class Node {
    
    int info;
    Node next;

    public Node() {
    }

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(int info) {
        this.info = info;
    }
    
}
