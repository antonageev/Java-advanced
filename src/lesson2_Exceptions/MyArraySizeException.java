package lesson2_Exceptions;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(){
        System.out.println("Размер массива не соответствует 4х4");
    }
}
