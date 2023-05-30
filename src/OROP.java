public class OROP {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int c = 16;
        System.out.println(a > b || c < b );
        System.out.println(a > b | c < b );

        //vs
        System.out.println(a > b || c++ < b );
        // c in second conditions is checked
        System.out.println(c);
        System.out.println(a > b | c++ < b );
        // c in second condition is not checked
        System.out.println(c);

    }
}
