package com.rumbest.controller;

import com.rumbest.listener.SnakeListener;
import com.rumbest.pojo.Food;
import com.rumbest.pojo.Ground;
import com.rumbest.pojo.Snake;
import com.rumbest.utils.SnakeUtils;
import com.rumbest.view.GamePanel;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameController extends KeyAdapter implements SnakeListener {

    private Food food;
    private Snake snake;
    private Ground ground;
    private GamePanel gamePanel;

    public GameController(Food food, Snake snake, Ground ground,GamePanel gamePanel) {
        this.food = food;
        this.snake = snake;
        this.ground = ground;
        this.gamePanel=gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                snake.changeDirection(SnakeUtils.UP);
                break;
            case KeyEvent.VK_DOWN:
                snake.changeDirection(SnakeUtils.DOWN);
                break;
            case KeyEvent.VK_LEFT:
                snake.changeDirection(SnakeUtils.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                snake.changeDirection(SnakeUtils.RIGHT);
                break;
        }
    }

    @Override
    public void listenerSnakeMove() {
        if (snake.isEatSelf(snake)){
            snake.life=false;
        }
        if (food.isEatFood(snake)){
            food.createdFood(ground.getPoint());
            snake.largen();
        }
        if (ground.isEatGround(snake)){
            snake.life=false;
        }
        gamePanel.display(snake,food,ground);
    }



    //开始游戏
    public void startGame(){
        food.createdFood(ground.getPoint());
        snake.start();
    }
}
