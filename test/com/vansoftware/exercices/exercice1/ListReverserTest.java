package com.vansoftware.exercices.exercice1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a.n.vorotnikov on 22.06.2015.
 */
public class ListReverserTest {
    private ListNode[] createList(int length) {
        ListNode[] result = new ListNode[length];

        result[length - 1] = new ListNode(length);
        for (int i = length - 2; i >= 0; i--) {
            result[i] = new ListNode(i + 1, result[i + 1]);
        }

        return result;
    }

    private void checkReversedList(ListNode reversedList, ListNode[] originalList) {
        int i = originalList.length - 1;
        ListNode curNode = reversedList;
        while (curNode != null) {
            Assert.assertEquals(originalList[i], curNode);
            i--;
            curNode = curNode.next;
        }
    }

    @Test
    public void testReverseList1() throws Exception {
        Assert.assertNull(ListReverser.reverseList(null));
    }

    @Test
    public void testReverseList2() throws Exception {
        ListNode oneNode = new ListNode(1);
        Assert.assertEquals(oneNode, ListReverser.reverseList(oneNode));
        Assert.assertNull(oneNode.next);
    }

    @Test
    public void testReverseList3() throws Exception {
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeOne = new ListNode(1, nodeTwo);

        ListNode reversedList = ListReverser.reverseList(nodeOne);

        Assert.assertEquals(nodeTwo, reversedList);
        Assert.assertEquals(nodeOne, reversedList.next);
        Assert.assertNull(reversedList.next.next);
    }

    @Test
    public void testReverseList4() throws Exception {
        testReverseList(3);
    }

    @Test
    public void testReverseList5() throws Exception {
        testReverseList(4);
    }

    @Test
    public void testReverseList6() throws Exception {
        testReverseList(5);
    }

    @Test
    public void testReverseList7() throws Exception {
        testReverseList(10);
    }

    private void testReverseList(int length) {
        ListNode[] list = createList(length);

        ListNode reversedList = ListReverser.reverseList(list[0]);

        checkReversedList(reversedList, list);
    }
}
