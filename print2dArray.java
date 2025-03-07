public class print2dArray {
    public static void main(String[] args) {
        String[][] values = {
                { "Andy", "Tyler" },
                { "John", "Cindy" },
                { "Mary", "Helen" }
        };

        for (int row = 0; row < values.length; row++) {
            // Print the row number starting at 1
            System.out.println("Row " + (row + 1));
            // Print each cell on a new indented line, also starting cell numbering at 1
            for (int column = 0; column < values[row].length; column++) {
                System.out.println("\tCell " + (column + 1) + ": " + values[row][column]);
            }
        }
    }
}
