package com.company;


import com.company.figures.Figure;
import com.company.figures.FigureColour;
import com.company.figures.Pawn;
import com.company.utils.Coordinates;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private static final int SIZE = 8;
    private static final Map<Coordinates<Integer, Integer>, Figure> startingPositions = new HashMap<>();

    public Board() {
        populateBoard();
    }

    private void populateBoard() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                Coordinates<Integer, Integer> generatedCoordinates = new Coordinates<>(x, y);
                if (x == 1) {
                    startingPositions.put(generatedCoordinates, new Pawn(FigureColour.BLACK, generatedCoordinates));
                }
                if (x == 6) {
                    startingPositions.put(generatedCoordinates, new Pawn(FigureColour.WHITE, generatedCoordinates));
                }
            }
        }
    }

    public void showBoard(){
        System.out.println();
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                Coordinates<Integer, Integer> generatedCoordinates = new Coordinates<>(x, y);
                if(startingPositions.containsKey(generatedCoordinates)){
                    System.out.print("P");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(startingPositions);
        }
    }
}
