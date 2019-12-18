package lesson1;

public class MainApp {
    public static void main(String[] args) {
        Object[] teamArray = new Object[]{
                new Human("Василий", 3, 800),
                new Cat("Мурзик", 1, 150),
                new Robot("Эдуард", 15, 10000)
        };
        Object[] obstArray = new Object[]{
                new Runner(100),
                new Wall(1),
                new Runner(250),
                new Wall(2),
                new Runner(1500),
                new Wall(12),
        };
        //System.out.println(obstArray[0] instanceof Wall);

        /*for (int i=0; i<teamArray.length; i++){
            if (obstArray[i] instanceof Runner){
                System.out.println(((Runner)obstArray[i]).getRunnerDistance());
            }*/
        for (Object teamMember : teamArray){
            int cumulativeDistnce = 0;
            for (Object obst : obstArray){
                if (teamMember instanceof Human) {
                    if (obst instanceof Runner) {
                        cumulativeDistnce += ((Runner) obst).getRunnerDistance();
                        if (!((Human)teamMember).Run(cumulativeDistnce)) break;
                    }
                    if (obst instanceof Wall) {
                        if (!((Human)teamMember).Jump(((Wall) obst).getWallHeight())) break;
                    }
                }

                if (teamMember instanceof Cat) {
                    if (obst instanceof Runner) {
                        cumulativeDistnce += ((Runner) obst).getRunnerDistance();
                        if (!((Cat)teamMember).Run(cumulativeDistnce)) break;
                    }
                    if (obst instanceof Wall) {
                        if (!((Cat)teamMember).Jump(((Wall) obst).getWallHeight())) break;
                    }
                }

                if (teamMember instanceof Robot) {
                    if (obst instanceof Runner) {
                        cumulativeDistnce += ((Runner) obst).getRunnerDistance();
                        if (!((Robot)teamMember).Run(cumulativeDistnce)) break;
                    }
                    if (obst instanceof Wall) {
                        if (!((Robot)teamMember).Jump(((Wall) obst).getWallHeight())) break;
                    }
                }

            }
        }



    }
}
