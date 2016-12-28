/* This class is used to solve the code */
public class solver{

  private static final int NUM_ROWS = 9;
  private static final int NUM_COLS = 9;

  // Returns a completed puzzle
  public static int[][] solver(int[][] puzzle){
    validNumbers validNumberArray[][] = new validNumbers[NUM_ROWS][NUM_COLS];
    for (int i=0;i<9;i++){
      for (int j=0;j<9;j++){
        validNumberArray[i][j] = new validNumbers();
      }
    }
    return null;
  }

}
