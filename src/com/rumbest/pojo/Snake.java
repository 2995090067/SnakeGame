package com.rumbest.pojo;

import com.rumbest.controller.GameController;
import com.rumbest.draw.Draw;
import com.rumbest.utils.SnakeUtils;

import java.awt.*;
import java.util.LinkedList;

public class Snake implements Draw {
    private int oldDirection= SnakeUtils.RIGHT;
    private int newDirection= SnakeUtils.RIGHT;
    private Point tail;
    private Integer speed=300;
    private LinkedList<Point> body=new LinkedList();
    public boolean life=true;

    private GameController gameController;
    public Snake(){
        int x=SnakeUtils.WIDTH/2;
        int y=SnakeUtils.HEIGHT/2;
        for (int i=0;i<3;i++){
            body.add(new Point(x-i,y));
        }
    }
    public Point getHead(){
        return body.getFirst();
    }
    public void largen(){
        body.addLast(tail);
        if (speed>=150)
        speed-=5;
    }

    private void move(){
        System.out.println("蛇正在移动");
        tail=body.removeLast();
        int x=body.getFirst().x;
        int y=body.getFirst().y;
        if (oldDirection+newDirection!=0)
            oldDirection=newDirection;
        switch (oldDirection){
            case SnakeUtils.UP:
                y--;
                break;
            case SnakeUtils.DOWN:
                y++;
                break;
            case SnakeUtils.LEFT:
                x--;
                break;
            case SnakeUtils.RIGHT:
                x++;
                break;
        }
        body.addFirst(new Point(x,y));
    }

    @Override
    public void DrawMe(Graphics g) {
        for (Point point : body) {
            g.setColor(Color.blue);
            g.fill3DRect(point.x*SnakeUtils.GRID_SIZS,point.y*SnakeUtils.GRID_SIZS,SnakeUtils.GRID_SIZS,SnakeUtils.GRID_SIZS,false);
        }
        System.out.println("蛇画出了自己");
    }
    //判断蛇是否吃到自己
    public boolean isEatSelf(Snake snake){
        Point head = snake.getHead();
        for (int i=1;i<body.size();i++){
            if (head.x==body.get(i).x&&head.y==body.get(i).y){
                return true;
            }
        }
        return false;
    }

    //改变蛇的方向
    public void changeDirection(int direction){
        System.out.println("蛇已经改变了方向" );
        this.newDirection=direction;
    }

    public void addController(GameController gameController){
        this.gameController=gameController;
    }

    //开始游戏
    public void start(){
        new SnakeDriver().start();
    }

    class SnakeDriver extends Thread{
        @Override
        public void run() {
            while (life){
                move();
                gameController.listenerSnakeMove();
                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
