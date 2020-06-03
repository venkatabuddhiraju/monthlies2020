package april2020;


/**
 * GIven a list find its middle node
 * if two nodes are middle return second middle
 *
 *
 *  * Definition for singly-linked list.
 *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode(int x) { val = x; }
 *  * }
 *  */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MidOfList8 {

    public static void main(String[] ascsfs){
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
        System.out.println(middleNode(one).val);
    }

    public static ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode nextNode = head.next;
        if(nextNode.next == null){
            return nextNode;
        }
        ListNode nextNodeNext = nextNode.next;

        while(nextNodeNext != null){
            if(nextNodeNext.next == null || nextNode.next.next == null){
                break;
            }
            nextNode = nextNode.next;
            nextNodeNext = nextNodeNext.next.next;
        }
        return nextNode;
    }
}
