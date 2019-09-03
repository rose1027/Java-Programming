public class listNodesum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sumfirst = 0;
        int sumsencond = 0;
        int sumthird = 0;
        sumfirst = l1.next.next.val + l2.next.next.val;
        System.out.println("sumfirst=" + sumfirst);
        sumsencond = l1.next.val + l2.next.val;
        sumthird = l1.val + l2.val;
        if (sumfirst >= 10) {
            sumfirst = sumfirst - 10;

            if (sumsencond + 1 >= 10) {
                sumsencond = sumsencond - 10 + 1;
                sumthird += 1;
            }

        } else {
            if (sumsencond >= 10) {
                sumsencond = sumsencond - 10;
                System.out.println("second=" + sumsencond);
                sumthird += 1;
            }
        }
        ListNode l = new ListNode(sumthird, null);
        l = new ListNode(sumsencond, l);
        l = new ListNode(sumfirst, l);
        System.out.println("list = " + l);
        return l;


    }

    public static void main(String[] args) {
        ListNode L1 = new ListNode(3, null);
        ListNode L2 = new ListNode(4, null);

        L1 = new ListNode(4, L1);
        L1 = new ListNode(2, L1);
        L2 = new ListNode(6, L2);
        L2 = new ListNode(5, L2);
        Solution l = new Solution();
        ListNode list;
        list = l.addTwoNumbers(L1, L2);
        int item = 0;
        for (int i = 0; i < list.size(); i++) {
            item = list.getItem(i);
            System.out.println(item);
        }

    }
}
