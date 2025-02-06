class SpiralMetrix {
    
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralMetrix(matrix);
    }
    
    public static void spiralMetrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while (startCol <= endRow && startCol <= endCol) {
            
            //TOP
            for (int i = startCol; i <= endCol; i++) {
                System.out.println(matrix[startRow][i]);
            }
            //RIGHT
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.println(matrix[i][endCol]);
            }

            //BOTTOM
            for (int i = endCol - 1; i >= startCol; i--) {
                if (endRow == startRow) {
                    break;
                }
                System.out.println(matrix[endRow][i]);
            }

            //LEFT 
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.println(matrix[i][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}