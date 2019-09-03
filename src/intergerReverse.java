public class intergerReverse {
    public int reverse(int x) {
        int px = x;
        if (x == 0) return 0;
        if (x < 0) {
            px = Math.abs(x);
        }
        int sw = 0;
        String result = "";
        while (px > 0) {
            //int to string that can use concat()
            String r = Integer.toString(px % 10);
            result = result.concat(r);
            //System.out.println("result = " + result);
            px /= 10;
        }
//using try catch to handle the num out of the integer scope
        try {
            //int re = Integer.parseInt(result);
            if (x > 0) return Integer.parseInt(result);
            else
                return -Integer.parseInt(result);
        } catch (Exception ex) {
            return 0;
        }

    }

    public static void main(String[] args) {
        intergerReverse o = new intergerReverse();
        int x = o.reverse(1534236469);
        System.out.println("result = " + x);
    }

}
