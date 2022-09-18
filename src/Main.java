public class Main {
    public static void main(String[] args) {
        task1and2();
        System.out.println();
        task3();
        System.out.println();
        task4();

    }

    private static void task3() {
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        double[] doubleArr = {1.57, 7.654, 9.986};
        for (int a = intArr.length - 1; a >= 0; a--) {
            System.out.print(doubleArr[a]);
            if (a != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        float[] floatArr = {2.3f, 3.6f, 3.4f};
        for (int b = intArr.length - 1; b >= 0; b--) {
            System.out.print(floatArr[b]);
            if (b != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

    }

    private static void task1and2() {
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i != intArr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

        }
        double[] doubleArr = {1.57, 7.654, 9.986};
        for (int a = 0; a < doubleArr.length; a++) {
            System.out.print(doubleArr[a]);
            if (a != intArr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        float[] floatArr = {2.3f, 3.6f, 3.4f};
        for (int b = 0; b < floatArr.length; b++) {
            System.out.print(floatArr[b]);
            if (b != intArr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

    }

    private static void task4() {
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr[i] = intArr[i] + 1;
            }
            System.out.print(intArr[i]);
            if (i != intArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
