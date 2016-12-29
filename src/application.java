/* This class executes the code*/
public class application {
  public static void main(String[] args) {
    // Puzzle input. Zeroes represent empty values
    // http://www.puzzles.ca/sudoku_puzzles/sudoku_easy_261_solution.html
    int[][] puzzle = new int[][]{
      {0,0,0,0,4,0,0,0,3},
      {0,0,0,6,0,0,0,0,2},
      {0,0,0,0,8,1,0,5,0},
      {6,0,0,0,0,7,0,4,0},
      {0,1,0,3,0,0,0,0,0},
      {0,0,9,0,5,0,0,0,0},
      {0,0,0,0,0,3,0,0,5},
      {0,0,3,9,2,5,0,7,4},
      {0,0,6,0,7,4,0,8,0}
    };
    solver solver = new solver();
    int[][] solution = solver.solve(puzzle);
    for (int i=0;i<9;i++){
      for (int j=0;j<9;j++){
        System.out.print(solution[i][j] + " ");
      }
      System.out.print("\n");
    }
  }
}
