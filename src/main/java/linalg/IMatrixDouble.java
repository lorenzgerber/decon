package linalg;

public interface IMatrixDouble<E> {

    int numberOfColumns(E matrix );

    int numberOfRows( E matrix );

    E extractColumn( E matrix, int column );

    E extractRow( E matrix, int row );

    E insertColumn( E matrix, E column, int columnId );

    E insertRow( E matrix, E row, int rowId );

    E transpose( E matrix );

    double elementSum( E matrix );

    E divide( E dividend, E divisor );

    E divide( E dividend, double divisor );

    Double elementSumOfSquares( E matrix );

    E setNegativeToZero( E matrix );


    boolean isNaN( E matrix );





}
