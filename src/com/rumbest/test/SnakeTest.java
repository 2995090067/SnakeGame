package com.rumbest.test;

import com.rumbest.controller.GameController;
import com.rumbest.pojo.Food;
import com.rumbest.pojo.Ground;
import com.rumbest.pojo.Snake;
import com.rumbest.view.GamePanel;

import javax.swing.*;

public class SnakeTest {
    public static void main(String[] args) {
        Snake snake = new Snake();
        Food food = new Food();
        Ground ground = new Ground();
        GamePanel gamePanel = new GamePanel();
        GameController gameController = new GameController(food, snake, ground, gamePanel);
        snake.addController(gameController);
        gamePanel.addKeyListener(gameController);

        JFrame jFrame=new JFrame("贪吃蛇");
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel.setFocusable(true);
        jFrame.add(gamePanel);
        gameController.startGame();
        jFrame.setVisible(true);
    }
}
