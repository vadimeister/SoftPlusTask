public class Task1 {
    public static void main(String[] args) {
    }

    /**
     * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset
     * на количество позиций readLength. Новые цены округляем “вниз”,
     * до меньшего целого числа.
     * @param price - исходные цены, цена должна быть больше нуля
     * @param discount - % скидки, должен попадать в диапазон от 1 до 99
     * @param offset - номер позиции, с которой нужно применить скидку, должен быть больше или равен нулю
     * @param readLength - количество позиций, к которым нужно применить скидку, должно быть больше нуля
     * @return - массив новых цен.
     */
    public int[] decryptData(int[] price,
                                    int discount,
                                    int offset,
                                    int readLength) {
        for (int i : price) {
            if (i < 1)
                throw new IllegalArgumentException("Wrong data");
        }
        if (discount < 1 || discount > 99 || offset < 0 || readLength < 1)
            throw  new IllegalArgumentException("Wrong data");
        int end = readLength + offset;
        int[] result = new int[readLength];
        for (int i = offset; i < end && i < price.length; i++){
            result[i - offset] = (int) Math.floor(price[i] * (100 - discount) * 0.01);
        }
        return result;
    }
}



