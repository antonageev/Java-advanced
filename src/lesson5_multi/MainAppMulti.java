package lesson5_multi;

public class MainAppMulti {
    static final int SIZE = 10000000;
    static final int HALF = SIZE/2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        methodOneThread();
        methodMultiThread();
    }

    public static void methodOneThread(){

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.print("Однопоточный метод занял: ");
        System.out.print(System.currentTimeMillis()-a);
        System.out.print(" миллисекунд \n");
    }

    public static void methodMultiThread(){
        long a = System.currentTimeMillis();

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread t1 = new Thread(() -> {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            });

        Thread t2 = new Thread(() -> {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            });

        t1.start();
        t2.start();

        try{
        t1.join();
        t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        System.out.print("Двухпоточный метод занял: ");
        System.out.print(System.currentTimeMillis()-a);
        System.out.print(" миллисекунд \n");
    }
}
