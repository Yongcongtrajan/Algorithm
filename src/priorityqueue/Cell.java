package priorityqueue;

import java.util.Comparator;

public class Cell {
    public int row;
    public int col;
    public int value;

    public Cell(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }
}

class MyComparator implements Comparator<Cell> {
    @Override
    public int compare(Cell c1, Cell c2) {
        if ( c1.value == c2.value) {
            return 0;

        }
        return c1.value < c2.value ? 1 : -1;
    }

}
