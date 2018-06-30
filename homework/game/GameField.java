/* для правильного отображения картинок необходимо поменять их путь на свой в методе loadImages()
 */

package test.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    public static final int DOT_SIZE = 32;
    public static final int SIZE = 640;
    public static final int DOT_AXIS_QUANTITY = SIZE/DOT_SIZE;  //20
    public static final int DOT_OVERALL_QUANTITY = DOT_AXIS_QUANTITY*DOT_AXIS_QUANTITY;
    private Image playerImage;
    private Image playerImage2;
    private Image obstacleImage;
    private Image enemyImage;
    private Image background;
    private boolean inGame = true;
    private Timer timer;
    private boolean up;
    private boolean down;
    private boolean right;
    private boolean left;
    private boolean playerDirection = false;
    private int obstaclesQuantity = 20;
    private int enemiesQuantity = 4;
    public Player player;
    public static boolean[][] fieldStatement = new boolean[SIZE+DOT_SIZE/DOT_SIZE][SIZE+DOT_SIZE/DOT_SIZE];  //21*21
    ArrayList<Obstacles> list = new ArrayList<Obstacles>();
    ArrayList<Enemy> list2 = new ArrayList<Enemy>();


    public void printField() {
        for (int i = 0; i < (SIZE+DOT_SIZE)/DOT_SIZE; i++) {
            for (int j = 0; j < (SIZE+DOT_SIZE)/DOT_SIZE; j++) {
                System.out.printf("%7b", fieldStatement[i][j]);
            }
            System.out.println();
        }
    }



    public GameField () {
        setBackground(Color.white);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    private void initGame() {
        if (inGame) {
            timer = new Timer(100, this);
            timer.start();
            player = new Player();

            for (int i = 0; i < obstaclesQuantity; i++) {
                list.add(new Obstacles());
            }

            for (int i = 0; i < enemiesQuantity; i++) {
                list2.add(new Enemy());
            }
            player.printCoordinates();
            printField();

        }
    }


    public void scanMatrix() {
        for (int i = 0; i < (DOT_SIZE+SIZE)/DOT_SIZE; i++) {
            for (int j = 0; j < (DOT_SIZE+SIZE)/DOT_SIZE; j++) {
                if (fieldStatement[i][j] == true) {
                    System.out.println("field[" + i + "][" + j + "] = true");
                }
            }
        }
    }

    private void loadImages() {
        ImageIcon iia = new ImageIcon("C:\\Users\\jegbs\\IdeaProjects\\first\\player.png");
        playerImage = iia.getImage();
        ImageIcon iib = new ImageIcon("C:\\Users\\jegbs\\IdeaProjects\\first\\dot.png");
        obstacleImage = iib.getImage();
        ImageIcon iic = new ImageIcon("C:\\Users\\jegbs\\IdeaProjects\\first\\enemy.png");
        enemyImage = iic.getImage();
        ImageIcon iid = new ImageIcon("C:\\Users\\jegbs\\IdeaProjects\\first\\player2.png");
        playerImage2 = iid.getImage();
        ImageIcon iie = new ImageIcon("C:\\Users\\jegbs\\IdeaProjects\\first\\background.png");
        background = iie.getImage();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            player.move();
            for (Enemy enm : list2) {
                enm.move();
            }
        }
        repaint();
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            g.drawImage(background, 0, 0, this);
            if (playerDirection == false) {
                g.drawImage(playerImage2, player.playerX, player.playerY, this);
            } else if (playerDirection == true) {
                g.drawImage(playerImage, player.playerX, player.playerY, this);
            }

            for (Obstacles obs : list) {
                g.drawImage(obstacleImage, obs.getObstacleX(), obs.getObstacleY(), this);
            }
            for (Enemy enm : list2) {
                g.drawImage(enemyImage, enm.getEnemyX(), enm.getEnemyY(), this);
            }
        }
    }


    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                playerDirection = false;
                right = false;
                up = false;
                down = false;
                left = true;
            }
            if (key == KeyEvent.VK_RIGHT) {
                playerDirection = true;
                left = false;
                up = false;
                down = false;
                right = true;
            }
            if (key == KeyEvent.VK_UP) {
                down = false;
                left = false;
                right = false;
                up = true;
            }
            if (key == KeyEvent.VK_DOWN) {
                up = false;
                left = false;
                right = false;
                down = true;
            }
        }
    }




    public class Player implements Beings {
        private int playerX;
        private int playerY;

        public int getPlayerX() {
            return playerX;
        }

        public int getPlayerY() {
            return playerY;
        }

        public Player() {
            spawn();
        }

        @Override
        public void spawn() {
            playerX = new Random().nextInt(DOT_AXIS_QUANTITY+1) * BEING_SIZE;
            playerY = new Random().nextInt(DOT_AXIS_QUANTITY+1) * BEING_SIZE;
            fieldStatement[playerY/BEING_SIZE][playerX/BEING_SIZE] = true;
        }

//        @Override
//        public boolean equals(Object obj) {
//            if (obj instanceof Obstacles) {
//                if ((((Obstacles) obj).getObstacleY() == playerY) && (((Obstacles) obj).getObstacleX() == playerX)) {
//                    return true;
//                }
//            }
//            return false;
//        }



        public void printCoordinates() {
            System.out.println("-----------------------------------");
            System.out.println("$x_position: " + getPlayerX() + " # y_position: " + getPlayerY());
        }

        @Override
        public void move() {
            if (left && (playerX >= 0+BEING_SIZE) && !right) {

                if (fieldStatement[(playerY)/BEING_SIZE][(playerX-BEING_SIZE)/BEING_SIZE] == true) {    //check for collisions
                    int indexOfObstacle = 0;
                    for (Obstacles obs : list) {
                        if (playerY == obs.getObstacleY() && (playerX-BEING_SIZE) == obs.getObstacleX()) {
                            indexOfObstacle = list.indexOf(obs);
                        }
                    }
                    list.remove(indexOfObstacle);
                }

                playerX -= BEING_SIZE;
                left = false;
                fieldStatement[playerY/BEING_SIZE][(playerX+BEING_SIZE)/BEING_SIZE] = false;
                fieldStatement[playerY/BEING_SIZE][playerX/BEING_SIZE] = true;

                printCoordinates();
                scanMatrix();
            }
            if (right && (playerX <= SIZE-BEING_SIZE) && !left) {
                if (fieldStatement[(playerY)/BEING_SIZE][(playerX+BEING_SIZE)/BEING_SIZE] == true) {    //check for collisions
                    int indexOfObstacle = 0;
                    for (Obstacles obs : list) {
                        if (playerY == obs.getObstacleY() && (playerX+BEING_SIZE) == obs.getObstacleX()) {
                            indexOfObstacle = list.indexOf(obs);
                        }
                    }
                    list.remove(indexOfObstacle);
                }

                playerX += BEING_SIZE;
                right = false;
                fieldStatement[playerY/BEING_SIZE][(playerX-BEING_SIZE)/DOT_SIZE] = false;
                fieldStatement[playerY/BEING_SIZE][playerX/BEING_SIZE] = true;
                printCoordinates();
                scanMatrix();
            }
            if (up && (playerY >= 0+BEING_SIZE) && !down) {
                if (fieldStatement[(playerY-BEING_SIZE)/BEING_SIZE][playerX/BEING_SIZE] == true) {    //check for collisions
                    int indexOfObstacle = 0;
                    for (Obstacles obs : list) {
                        if ((playerY-BEING_SIZE) == obs.getObstacleY() && (playerX) == obs.getObstacleX()) {
                            indexOfObstacle = list.indexOf(obs);
                        }
                    }
                    list.remove(indexOfObstacle);
                }

                playerY -= BEING_SIZE;
                up = false;
                fieldStatement[(playerY+BEING_SIZE)/BEING_SIZE][(playerX)/BEING_SIZE] = false;
                fieldStatement[playerY/BEING_SIZE][playerX/BEING_SIZE] = true;
                printCoordinates();
                scanMatrix();
            }
            if (down && (playerY <= SIZE-BEING_SIZE) && !up) {
                if (fieldStatement[(playerY+BEING_SIZE)/BEING_SIZE][playerX/BEING_SIZE] == true) {    //check for collisions
                    int indexOfObstacle = 0;
                    for (Obstacles obs : list) {
                        if ((playerY+BEING_SIZE) == obs.getObstacleY() && (playerX) == obs.getObstacleX()) {
                            indexOfObstacle = list.indexOf(obs);
                        }
                    }
                    list.remove(indexOfObstacle);
                }

                playerY += BEING_SIZE;
                down = false;
                fieldStatement[(playerY-BEING_SIZE)/BEING_SIZE][(playerX)/BEING_SIZE] = false;
                fieldStatement[playerY/BEING_SIZE][playerX/BEING_SIZE] = true;
                printCoordinates();
                scanMatrix();
            }
        }
    }
}
