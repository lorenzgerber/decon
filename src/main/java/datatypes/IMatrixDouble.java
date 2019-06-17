package datatypes;

/**
 * @param <E> Matrix for linear algebra
 *           operations
 */
public interface IMatrixDouble<E> {

    int numberOfColumns( );

    int numberOfRows( );

    E extractColumn( int column );

    E extractRow( int row );

    E insertColumn( E column, int columnId );

    E insertRow( E row, int rowId );

    E transpose();

    double elementSum( );

    IMatrixDouble<E> divide( IMatrixDouble<E> divisor );

    IMatrixDouble<E> divide( double divisor );

    IMatrixDouble<E> multiplication( IMatrixDouble<E> matrix );

    IMatrixBoolean<E> multiplication( double d );

    Double elementSumOfSquares( );

    IMatrixBoolean<E> elementLessThan( double d );

    IMatrixDouble<E> setNegativeToZero( );

    IMatrixDouble<E> innerProduct(IMatrixDouble<E> matrix );

    IMatrixDouble<E> pseudoInverse( );

    boolean isNaN( );
    
}
