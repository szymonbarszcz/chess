package com.company.figures;

public enum FigureColour {
    BLACK("black"), WHITE("white");

    private final String colour;

    FigureColour(String colour){
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
