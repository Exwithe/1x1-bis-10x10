public class Prim {
    public static void main(String[] args) {
        for (int factor1 = 1;factor1 <= 10; factor1++) {
            System.out.println("-");
            for (int i = 0; i < 71; i++) {
                System.out.print("-");
            }
            System.out.print("\n");
            for (int factor2 = 1; factor2 <= 10; factor2++) {
                System.out.print("-" + factor1 + "x" + factor2 + "=" + factor1 * factor2);
            }
        }
            System.out.println("-");
            for (int j = 0; j < 83; j++) {
            System.out.print("-");
        }

        }
    }

