package lesson1;

public class Robot implements Actions{
    private String name;
    private int maxJumpHeight;
    private int maxRunDistance;

    public Robot(String _name, int _maxJumpHeight, int _maxRunDistance){
        this.name = _name;
        this.maxJumpHeight = _maxJumpHeight;
        this.maxRunDistance = _maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean Run(int distance) {
        if (this.maxRunDistance>distance){
            System.out.println("Робот " + this.getName() + " пробежал " + distance );
            return true;
        }
        else {
            System.out.println("Робот " + this.getName() + " не может пробежать " + distance );
            return false;
        }
    }

    @Override
    public boolean Jump(int height) {
        if (this.maxJumpHeight>height) {
            System.out.println("Робот " + this.getName() + " прыгнул на " + height);
            return true;
        }
        else {
            System.out.println("Робот " + this.getName() + " не может прыгнуть на высоту " + height);
            return false;
        }
    }

}
