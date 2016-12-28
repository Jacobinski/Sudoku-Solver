/* This class is used to solve the code */
public class solver{

  private static final int NUM_ROWS = 9;
  private static final int NUM_COLS = 9;

  // Returns a completed puzzle
  public static void solver(int[][] puzzleInput){

    int[][] puzzle = new int[NUM_ROWS][NUM_COLS];
    tile validNumbers[][] = new tile[NUM_ROWS][NUM_COLS]; // This will be the valid number array to keep track of possibilities
    for (int i=0;i<9;i++){
      for (int j=0;j<9;j++){
        validNumbers[i][j] = new tile();
      }
    }

    // Populate the validNumbers




  }
  // Row and columns start at 0
  /* Modifies: validNumbers to remove found in a row*/
  private void updateRow(int row, int column, int found, tile[][] validNumbers){
    for (int i=0;i<9;i++){
      validNumbers[i][column].removeNum(found);
    }
  }

  /* Modifies: validNumbers to remove found in a row*/
  private void updateColumn(int row, int column, int found, tile[][] validNumbers){
    for (int i=0;i<9;i++){
      validNumbers[row][i].removeNum(found);
    }
  }

  private void updateSquare(int row, int column, int found, tile validNumbers){
    int squareLocation; //Top left = 0, Top Right = 2, Bottom Left = 6
    // determine the column squareNum, then correct for row by adding factors of 3
    if (column <= 2){squareLocation = 0;}
    else if (column <=5){squareLocation = 1;}
    else {squareLocation = 2;}

    if (row <= 2){squareLocation += 3*0;}
    else if (row <=5){squareLocation += 3*1;}
    else {squareLocation += 3*2;}

  }

}
