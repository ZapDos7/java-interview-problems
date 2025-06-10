package binary.tilde;

//  -x = ~x + 1;
// -~x = x + 1 (by replacing x by ~x)
public class TildeOperator {
    public static void main(String[] args) {
        System.out.println(~-9);     // 8
        System.out.println(~-100);   // 99
        System.out.println(~-1);     // 0
        System.out.println(~-0);     // -1

        System.out.println(~9);     // -10
        System.out.println(~100);   // -101
        System.out.println(~1);     // -2
        System.out.println(~0);     // -1
    }
}
