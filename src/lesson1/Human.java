package lesson1;

public class Human implements Actions{
    private String name;
    private int maxJumpHeight;
    private int maxRunDistance;

    public Human(String _name, int _maxJumpHeight, int _maxRunDistance){
        this.name = _name;
        this.maxJumpHeight = _maxJumpHeight;
        this.maxRunDistance = _maxRunDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean Run(int distance) {
        if (this.maxRunDistance>distance){
            System.out.println("Человек " + this.getName() + " пробежал " + distance );
            return true;
        }
        else {
            System.out.println("Человек " + this.getName() + " не может пробежать " + distance );
            return false;
        }
    }

    @Override
    public boolean Jump(int height) {
        if (this.maxJumpHeight>height) {
            System.out.println("Человек " + this.getName() + " прыгнул на " + height);
            return true;
        }
        else {
            System.out.println("Человек " + this.getName() + " не может прыгнуть на высоту " + height);
            return false;
        }
    }
}
