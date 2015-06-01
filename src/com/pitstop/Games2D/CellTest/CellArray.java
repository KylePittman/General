//Kyle Pittman 5/28/2015.
package com.pitstop.Games2D.CellTest;

import com.pitstop.Games2D.CommonResources.GUI.Cell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CellArray extends JPanel {
    private ArrayList<Cell> cells;

    public CellArray(){
        cells = new ArrayList<Cell>();
    }

    /**
     * Adds a cell to the array
     * @param cell
     */
    public void addCell(Cell cell){
        cells.add(cell);
    }

    /**
     * Removes a cell from the array
     * @param index index to remove from
     */
    public void removeCell(int index){
        cells.remove(index);
    }

    /**
     * Returns a cell from the arrayList
     * @param index index of the cell to return
     * @return cell at index
     */
    public Cell getCell(int index){
        return cells.get(index);
    }

    /**
     * Sets the cell at index to cell
     * @param index index to be overwritten
     * @param cell cell to overwrite with
     */
    public void setCell(int index, Cell cell){
        cells.set(index, cell);
    }

    public void setCell(int x, int y, Cell cell){
        if (getCellIndex(x,y) != -1)
        cells.set(getCellIndex(x, y), cell);
    }

    /**
     * Searches the array for a cell matching the x and y coordinate given
     * @param x x coordinate of the cell
     * @param y y coordinate of the cell
     * @return the index of matching cell or -1 if the cell is not in the
     * array
     */
    public int getCellIndex(int x, int y){
        for (int i = 0; i < cells.size(); i++) {
            if(cells.get(i).getX() == x && cells.get(i).getY() == y)
                return i;
        }
        return - 1;
    }

    /**
     * Gets the size of the array
     * @return the size of the array
     */
    public int getArraySize(){
        return cells.size();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < cells.size(); i++) {
            cells.get(i).Draw((Graphics2D)g, this);
        }
    }
}
