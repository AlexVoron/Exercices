package com.vansoftware.exercices.exercice1;

/**
 * Created by a.n.vorotnikov on 22.06.2015.
 */
public class ListReverser {
    public static ListNode reverseList(ListNode list) {
        if (list == null) {
            return null;
        }

        ListNode prevNode = null;
        ListNode curNode = null;
        ListNode nextNode = null;

        curNode = list;
        while (curNode.next != null) {
            nextNode = curNode.next;

            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }

        curNode.next = prevNode;

        return curNode;
    }
}
