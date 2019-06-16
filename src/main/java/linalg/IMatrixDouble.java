package linalg;

public interface IMatrixDouble<E> {

    int numberOfColumns(E matrix );

    int numberOfRows( E matrix );

    E extractColumn( E matrix, int column );

    E extractRow( E matrix, int row );

    E transpose( E matrix );

    E setNegativeToZero( E matrix );





}
