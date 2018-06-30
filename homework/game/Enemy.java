package test.test;

import java.util.Random;

public class Enemy implements Beings {
    private int enemyX;
    private int enemyY;

    public int getEnemyX() { return enemyX; }
    public int getEnemyY() { return enemyY; }

    public Enemy() {
        spawn();
    }

    @Override
    public void spawn() {
        do {
            enemyX = new Random().nextInt(GameField.DOT_AXIS_QUANTITY+1) * BEING_SIZE;
            enemyY = new Random().nextInt(GameField.DOT_AXIS_QUANTITY+1) * BEING_SIZE;
        } while (GameField.fieldStatement[enemyY/BEING_SIZE][enemyX/BEING_SIZE] == true);
        GameField.fieldStatement[enemyY/BEING_SIZE][enemyX/BEING_SIZE] = true;
    }

    @Override
    public void move() {
        int direction = new Random().nextInt(4);
        switch(direction) {
            case 0:
                if (enemyX >= 0+BEING_SIZE) {
                    if (GameField.fieldStatement[(enemyY)/BEING_SIZE][(enemyX-BEING_SIZE)/BEING_SIZE] == true) {
                        return;
                    }
                enemyX -= BEING_SIZE;
                GameField.fieldStatement[enemyY / BEING_SIZE][(enemyX + BEING_SIZE) / BEING_SIZE] = false;
                GameField.fieldStatement[enemyY / BEING_SIZE][enemyX / BEING_SIZE] = true;
            } break;

            case 1:
                if (enemyX <= (GameField.SIZE - BEING_SIZE)) {
                    if (GameField.fieldStatement[(enemyY)/BEING_SIZE][(enemyX+BEING_SIZE)/BEING_SIZE] == true) {
                        return;
                    }
                    enemyX += BEING_SIZE;
                    GameField.fieldStatement[enemyY / BEING_SIZE][(enemyX - BEING_SIZE) / BEING_SIZE] = false;
                    GameField.fieldStatement[enemyY / BEING_SIZE][enemyX / BEING_SIZE] = true;
                } break;

            case 2:
                if (enemyY >= (0+BEING_SIZE)) {
                    if (GameField.fieldStatement[(enemyY-BEING_SIZE)/BEING_SIZE][enemyX/BEING_SIZE] == true) {
                        return;
                    }
                    enemyY -= BEING_SIZE;
                    GameField.fieldStatement[(enemyY+BEING_SIZE) / BEING_SIZE][enemyX / BEING_SIZE] = false;
                    GameField.fieldStatement[enemyY / BEING_SIZE][enemyX / BEING_SIZE] = true;
                } break;

            case 3:
                if (enemyY <= (GameField.SIZE-BEING_SIZE)) {
                    if (GameField.fieldStatement[(enemyY+BEING_SIZE)/BEING_SIZE][enemyX/BEING_SIZE] == true) {
                        return;
                    }
                    enemyY += BEING_SIZE;
                    GameField.fieldStatement[(enemyY-BEING_SIZE) / BEING_SIZE][enemyX / BEING_SIZE] = false;
                    GameField.fieldStatement[enemyY / BEING_SIZE][enemyX / BEING_SIZE] = true;
                } break;
            }

        }

}

