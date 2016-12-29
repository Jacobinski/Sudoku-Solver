/* This class is used to solve the code */
public class solver{

  private static final int NUM_ROWS = 9;
  private static final int NUM_COLS = 9;

  // Returns a completed puzzle
  public int[][] solve(int[][] puzzleInput){

    int[][] puzzle = new int[NUM_ROWS][NUM_COLS]; //Make a deep copy of puzzleInput when populating validNumbers
    boolean[][] solved = new boolean[NUM_ROWS][NUM_COLS];
    int numberSolved = 0;
    tile validNumbers[][] = new tile[NUM_ROWS][NUM_COLS]; // This will be the valid number array to keep track of possibilities
    for (int row=0;row<9;row++){
      for (int column=0;column<9;column++){
        validNumbers[row][column] = new tile();
        solved[row][column] = false;
      }
    }
    // Populate the validNumbers
    for (int row=0;row<9;row++){
      for (int column=0;column<9;column++){
        int toAdd = puzzleInput[row][column];
        puzzle[row][column] = toAdd;
        if (toAdd != 0){
          solved[row][column] = true;
          numberSolved++;
          validNumbers[row][column].clear();
          updateRow(row, column, toAdd, validNumbers);
          updateColumn(row, column, toAdd, validNumbers);
          updateSquare(row, column, toAdd, validNumbers);
        }
      }
    }
    while (numberSolved < 81){
      for (int row=0;row<9;row++){
        for (int column=0;column<9;column++){
          if(solved[row][column] == false){
            if(validNumbers[row][column].size() == 1){
              int found = validNumbers[row][column].lastNumber();
              solved[row][column] = true;
              numberSolved++;
              updateRow(row, column, found, validNumbers);
              updateColumn(row, column, found, validNumbers);
              updateSquare(row, column, found, validNumbers);
              puzzle[row][column] = found;
            }
          }
        }
      }
    }
    return puzzle;
  }
  // Row and columns start at 0
  /* Modifies: validNumbers to remove found in a row*/
  private void updateRow(int row, int column, int found, tile[][] validNumbers){
    for (int i=0;i<9;i++){
      validNumbers[i][column].remove(found);
    }
  }

  /* Modifies: validNumbers to remove found in a row*/
  private void updateColumn(int row, int column, int found, tile[][] validNumbers){
    for (int i=0;i<9;i++){
      validNumbers[row][i].remove(found);
    }
  }

  private void updateSquare(int row, int column, int found, tile[][] validNumbers){
    int minColumn;
    int maxColumn;
    int minRow;
    int maxRow;

    if (row <= 2){
      minRow = 0;
      maxRow = 2;
    }
    else if (row <= 5){
      minRow = 3;
      maxRow = 5;
    }
    else{
      minRow = 6;
      maxRow = 8;
    }

    if (column <= 2){
      minColumn = 0;
      maxColumn = 2;
    }
    else if (column <= 5){
      minColumn = 3;
      maxColumn = 5;
    }
    else{
      minColumn = 6;
      maxColumn = 8;
    }

    for (int i=minRow;i<=maxRow;i++){
      for (int j=minColumn;j<=maxColumn;j++){
        validNumbers[i][j].remove(found);
      }
    }
  }

}
