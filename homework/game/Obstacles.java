package test.test;

import java.util.Random;

public class Obstacles implements Beings{
    private int obstacleX;
    private int obstacleY;

    public int getObstacleX() {
        return obstacleX;
    }

    public int getObstacleY() {
        return obstacleY;
    }

    @Override
    public void move() { }

    @Override
    public void spawn() {
        do {
            obstacleX = new Random().nextInt(GameField.DOT_AXIS_QUANTITY+1) * BEING_SIZE;
            obstacleY = new Random().nextInt(GameField.DOT_AXIS_QUANTITY+1) * BEING_SIZE;
        } while (GameField.fieldStatement[obstacleY/BEING_SIZE][obstacleX/BEING_SIZE] == true);
        GameField.fieldStatement[obstacleY/BEING_SIZE][obstacleX/BEING_SIZE] = true;
    }

    public Obstacles() {
        spawn();
    }

}

