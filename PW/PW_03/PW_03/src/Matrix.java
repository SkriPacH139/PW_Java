public class Matrix {
    private int count;
    private UniqueID id = new UniqueID(3, "circle: ",count);

    private int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
        count++;
    }

    // Сложение матриц
    public Matrix add(Matrix other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры.");
        }

        int rows = data.length;
        int cols = data[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(result);
    }

    // Умножение матриц
    public Matrix multiply(Matrix other) {
        if (data[0].length != other.data.length) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }

        int rows1 = data.length;
        int cols1 = data[0].length;
        int cols2 = other.data[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    // Перегруженный метод умножения для скалярного умножения
    public Matrix multiply(int scalar) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = data[i][j] * scalar;
            }
        }

        return new Matrix(result);
    }

    public String printArr(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
