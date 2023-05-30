public class ShiftVS {
    public static void main(String[] args) {
        // For Positive number, >> and >>> work same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        // For Negative Number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }
}
