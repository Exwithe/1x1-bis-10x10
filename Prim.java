public class Prim {
    public static void main(String[] args) {

        int cnt = 0;
        int multi = 0;
        for (int row = 9;row >= 0; row--) {
            cnt++;
            multi = 1;
            for (int line = 9;line >= 0; line--) {
                System.out.print(cnt + "x" + multi + "=" + cnt * multi + " ");
                multi++;
            }
            System.out.println();
        }
    }
}
