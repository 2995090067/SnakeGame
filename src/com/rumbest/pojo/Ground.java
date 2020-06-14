package com.rumbest.pojo;

import com.rumbest.draw.Draw;
import com.rumbest.utils.SnakeUtils;

import java.awt.*;
import java.util.Random;

public class Ground implements Draw {

    private int [][]rock=new int[SnakeUtils.WIDTH][SnakeUtils.HEIGHT];

    public Ground(){
        for (int x=0;x<SnakeUtils.WIDTH;x++){
            for (int y=0;y<SnakeUtils.HEIGHT;y++){
                if (x==0||x==SnakeUtils.WIDTH-1 ||y==0||y==SnakeUtils.HEIGHT-1){
                    rock[x][y]=1;
                }
            }
        }
    }

    @Override
    public void DrawMe(Graphics g) {
        for (int x=0;x<SnakeUtils.WIDTH;x++){
            for (int y=0;y<SnakeUtils.HEIGHT;y++){
                if (rock[x][y]==1){
                    g.setColor(Color.YELLOW);
                    g.fill3DRect(x* SnakeUtils.GRID_SIZS,y* SnakeUtils.GRID_SIZS,SnakeUtils.GRID_SIZS,SnakeUtils.GRID_SIZS,false);
                }
            }
        }
        System.out.println("障碍物画出了自己");
    }

    public boolean isEatGround(Snake snake){
        Point head = snake.getHead();
        for (int x=0;x<SnakeUtils.WIDTH;x++){
            for (int y=0;y<SnakeUtils.HEIGHT;y++){
                if (head.x==x&&head.y==y&&rock[x][y]==1){
                    return true;
                }
            }
        }
        return false;
    }

    //随机食物的位置

    public Point getPoint(){
        int x,y;
        do{
             x=new Random().nextInt(SnakeUtils.WIDTH);
             y=new Random().nextInt(SnakeUtils.HEIGHT);
        }while (rock[x][y]==1);
        return new Point(x,y);
    }
}
