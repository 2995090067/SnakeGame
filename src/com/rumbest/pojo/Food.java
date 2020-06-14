package com.rumbest.pojo;

import com.rumbest.draw.Draw;
import com.rumbest.utils.SnakeUtils;

import java.awt.*;

public class Food extends Point implements Draw {
    @Override
    public void DrawMe(Graphics g) {
        System.out.println("食物画出了自己");
        g.setColor(Color.RED);
        g.fill3DRect(x* SnakeUtils.GRID_SIZS,y* SnakeUtils.GRID_SIZS,SnakeUtils.GRID_SIZS,SnakeUtils.GRID_SIZS,false);
    }

    public boolean isEatFood(Snake snake){
        Point head = snake.getHead();
        if(this.equals(head)){
            return true;
        }
        return false;
    }
    //创建食物
    public void createdFood(Point point){
        this.x=point.x;
        this.y=point.y;
    }



}
