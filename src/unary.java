public class unary {
    public static void main(String[] args) {
        int z = 12;
        int s = -10;
        boolean truewe=true;
        boolean falsewe=false;
        System.out.println(z++);
        System.out.println(z--);
        System.out.println(++z);
        System.out.println(--z);

        System.out.println(z++ + s++);
        System.out.println(z-- + s--);

        System.out.println(~z);
        System.out.println(~s);
        System.out.println(!truewe);
        System.out.println(!falsewe);

    }
}
