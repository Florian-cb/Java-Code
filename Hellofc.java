public class Hellofc {
    public static void main(String[] args) {
        double[][] values = { { 10.0, 12.0 }, { 6.0, 4.0 }, { 7.0, 2.0 } };

        for (int row = values.length - 1; row >= 0; row--) {
            for (int column = values[row].length - 1; column >= 0; column--) {
                System.out.print(values[row][column] + " ");
            }
            System.out.println();
        }
    }
}