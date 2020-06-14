package com.rumbest.view;

import com.rumbest.pojo.Food;
import com.rumbest.pojo.Ground;
import com.rumbest.pojo.Snake;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Snake snake;
    private Food food;
    private Ground ground;

    public void display(Snake snake,Food food,Ground ground){
        this.snake=snake;
        this.food=food;
        this.ground=ground;
        repaint();//重绘
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.DrawMe(g);
        food.DrawMe(g);
        ground.DrawMe(g);
    }
}
