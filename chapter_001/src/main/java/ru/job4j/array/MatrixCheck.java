package ru.job4j.array;

/**
 * Class MatrixCheck.
 * 1. Необходимо создать класс MatrixCheck.
 * 2. В классе MatrixCheck написать метод public boolean mono(boolean[][] data).
 */
public class MatrixCheck {
    /**
     * Метод должен проверить, что все элементы по диагоналям равны true или false.
     *
     * @param data Входящий массив.
     * @return Результат.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[0][data.length - 1] != data[i][data.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
