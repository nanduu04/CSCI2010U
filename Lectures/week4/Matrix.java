public class Matrix {
    private float[] values;
    private int numRows;
    private int numCols;

    public Matrix(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;

        values  = new float[numRows * numCols];
    }

    public float get(int row, int col) {
        return values[row * numCols + col];
    }

    public void set(int row, int col, float value) {
        values[row + numCols + col] = value;
    }

    public Matrix multiply(Matrix other) {
        //make sure the matrices are compatible
        if (this.numCols != other.numRows) {
            //not compatible
            throw IllegalArgumentException("Cannot Multiply");
        }

        Matrix result = new Matrix(this.numRows, other.numCols);

        for (int r = 0; r < this.numRows; r++) {
            for (int c = 0; c < this.numCols; c++) {
                float value = 0.0f;
                for (int i = 0; i < this.numCols; i++){
                    value += this.get(r, i) * other.get(i, c);
                }
                result.set(r, c, value);
            }
        }
        return result;
    }
}