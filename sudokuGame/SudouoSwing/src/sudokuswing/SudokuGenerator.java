package sudokuswing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SudokuGenerator {
    public static SudokuPuzzle generateRandomSudoku(SudokuPuzzleType puzzleType){
        SudokuPuzzle puzzle = new SudokuPuzzle(puzzleType.getRows(),puzzleType.getColumns(),
                puzzleType.getBoxWidth(),puzzleType.getBoxHeight(), puzzleType.getValidValues());

        Random randomGenerator = new Random();
        List<String> notUsedValidValues = new ArrayList<>(Arrays.asList(puzzle.getVALIDVALUES()));
        for (int r=0;r<puzzle.getNumROWS();r++){
            int randomValue = randomGenerator.nextInt(notUsedValidValues.size());
            puzzle.makeMove(r,0,notUsedValidValues.get(randomValue));
            notUsedValidValues.remove(randomValue);

        }


        return puzzle;
    }}
