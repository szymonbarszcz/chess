package com.company.figures;

import com.company.utils.Coordinates;

public class Figure {
    private FigureColour colour;
    private Coordinates<Integer, Integer> coordinates;

    public Figure(FigureColour colour, Coordinates<Integer, Integer> coordinates ){
        this.colour = colour;
        this.coordinates = coordinates;
    }


}
