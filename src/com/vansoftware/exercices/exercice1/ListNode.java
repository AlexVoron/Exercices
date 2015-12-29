package com.vansoftware.exercices.exercice1;

/**
 * Created by a.n.vorotnikov on 22.06.2015.
 */
public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
