public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public int getItem(int i) {
        if (i == 0) {
            return val;
        }
        i = i - 1;
        return next.getItem(i);

    }

    public int size() {
        if (next == null) {
            return 1;
        }
        return 1 + next.size();

    }
}
