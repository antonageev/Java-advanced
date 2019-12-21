package lesson2_Exceptions;

public class MainApp {
    public static void main(String[] args) {
        //Для проверки размерности массива 4 на 4 нужно удалить хотя бы одно значение из инициализации ниже (например, "8")
        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"},{"9", "10", "11", "12"}, {"13", "14D", "15", "16"}};
        try {
            arrayExecution(array);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            System.out.println("Ошибка формата данных в ячейке с координатами: i["+e.getI()+"] j["+e.getJ()+"]");
            printArray(array);
        }
    }

    private static void arrayExecution (String[][] inArr) throws MyArraySizeException, MyArrayDataException{
        if (!check44(inArr)) throw new MyArraySizeException();

        int resultSum = 0;
        for (int i = 0; i<inArr.length; i++){
            for (int j = 0; j<inArr[i].length; j++){
                try {
                    resultSum += Integer.parseInt(inArr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма массива: " + resultSum);
    }

    private static boolean check44(String[][] checkArr) {
        boolean result = true;
        if (checkArr.length != 4) {
            result = false;
        } else {
            for (int i = 0; i < checkArr.length; i++) {
                if (checkArr[i].length != 4) result = false;
            }
        }
        return result;
    }

    private static void printArray(String[][] checkArr) {
        for (int i = 0; i<checkArr.length; i++){
            for (int j = 0; j<checkArr[i].length; j++){
                System.out.print(checkArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
