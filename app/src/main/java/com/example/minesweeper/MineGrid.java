package com.example.minesweeper;

import java.util.ArrayList;
import java.util.List;

public class MineGrid {
    private List<cell> cells;
    private int size ;

    public MineGrid(int size) {
        this.size = size;
        cells = new ArrayList<>();
        for (int i=0; i<size*size; i++)
        {
            cells.add(new cell(cell.BLANK));
        }
    }

    public  List<cell> getCells() {
        return cells;
    }

}
