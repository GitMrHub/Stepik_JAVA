public static void moveRobot(Robot robot, int toX, int toY) {
    if( toX > robot.getX()){

            while(!robot.getDirection().equals(Direction.RIGHT)){
                robot.turnLeft();
            }

            while(robot.getX() != toX){
                robot.stepForward();
            }
        }

        else{

            while(!robot.getDirection().equals(Direction.LEFT)){
                robot.turnLeft();
            }

            while(robot.getX() != toX){
                robot.stepForward();
            }
        }

        if( toY > robot.getY()){

            while(!robot.getDirection().equals(Direction.UP)){
                robot.turnLeft();
            }

            while(robot.getY() != toY){
                robot.stepForward();
            }
        }

        else {

            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
}
