package may2020;

/*
Odd Even Linked List
Solution
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:

Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL
Note:

The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...

 */

import common.nodes.ListNode;

public class OddEvenList16 {

    public static void main(String[] asdsdsds){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = null;

        ListNode result = new OddEvenList16().oddEvenList(one);
        ListNode head = result;
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;
//        ListNode swapper;
//        int count = 1;
//        while(current != null){
//
//            if(count%2 == 0){
//
//                current =
//            }
//            else{
//                swapper = current;
//            }
//        }
        return head;
    }

}
