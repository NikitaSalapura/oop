package by.bntu.fitr.poisit.sleepwalkers.model.logic;

import by.bntu.fitr.poisit.sleepwalkers.model.entity.Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixWorkerFromNikitaTest {
    private Matrix matrix = new Matrix(new double[][]{
            {12.2, 23.2, 1},
            {2, 233, 100},
            {123, 3, -2}});

    @Test
    void testCheckRow() {
        assertFalse(MatrixWorkerFromNikita.checkRowForLessElements
                (matrix, 1, 0, -1));
        assertFalse(MatrixWorkerFromNikita.checkRowForLessElements
                (matrix, 1, 0, 0));
        assertFalse(MatrixWorkerFromNikita.checkRowForLessElements
                (matrix, 1, 0, 1));
    }

    @Test
    void testIsLocalMin() {
        assertFalse(MatrixWorkerFromNikita.IsLocalMin(matrix, 0, 0));
        assertFalse(MatrixWorkerFromNikita.IsLocalMin(matrix, 0, 1));
        assertTrue(MatrixWorkerFromNikita.IsLocalMin(matrix, 0, 2));
    }

    @Test
    void testGetAmountOfLocalMins() {
        int expected = 3;
        int result = MatrixWorkerFromNikita.getAmountOfLocalMins(matrix);
        assertEquals(expected, result);
    }
}