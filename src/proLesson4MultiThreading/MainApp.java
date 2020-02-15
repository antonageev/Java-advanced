package proLesson4MultiThreading;

public class MainApp {
    static Object mon = new Object();
    static volatile char letter = 'A';

    public static void main(String[] args) {
        new Thread(()-> methodA()).start();
        new Thread(()-> methodB()).start();
        new Thread(()-> methodC()).start();
    }

    public static void methodA(){
        for (int i = 0; i < 5; i++) {
            synchronized (mon){
                while (letter!='A'){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                letter = 'B';
                mon.notifyAll();
            }
        }
    }

    public static void methodB(){
        for (int i = 0; i < 5; i++) {
            synchronized (mon) {
                while (letter != 'B') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                letter = 'C';
                mon.notifyAll();
            }
        }
    }

    public static void methodC(){
        for (int i = 0; i < 5; i++) {
            synchronized (mon) {
                while (letter != 'C') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                letter = 'A';
                mon.notifyAll();
            }
        }
    }

}