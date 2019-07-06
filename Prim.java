public class Prim {
    public static void main(String[] args) {

        int cnt = 0;
        int multi = 0;
        for (int row = 9;row >= 0; row--) {
            cnt++;
            multi = 0;
            for (int line = 10;line >= 0; line--) {
                System.out.print(cnt * multi + " ");
                multi++;
            }
            System.out.println();
        }
    }
}
