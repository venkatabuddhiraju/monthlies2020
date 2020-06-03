package trial;

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


public class AddTwoListsAsNumbers {
      public static void main(String[] sdfdf){
          ListNode one = new ListNode(9);
          ListNode two = new ListNode(9);
          ListNode result = addTwoNumbers(one, two);
          while (result != null) {
              System.out.println(result.val);
              result = result.next;
          }
      }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode returnVal = sum;
        int carry = 0;
        while (l1 != null || l2 != null){
            int v1 = 0,v2 = 0;
            if(l1 != null){
                v1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }
            int val = v1 + v2;
            if(carry == 1){
                val = val + 1;
                carry = 0;
            }
            if(val >= 10){
                carry = 1;
                val = val%10;
            }
            ListNode newNode = new ListNode(val);
            sum.next = newNode;
            sum = sum.next;
        }
        if(carry == 1){
            sum.next = new ListNode(1);
        }
        return returnVal.next;
    }

}
