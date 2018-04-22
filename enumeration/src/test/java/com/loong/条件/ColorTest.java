package com.loong.条件;



enum Color {

    RED,GREEN,BLACK
}
public class ColorTest{
    public static void color(Color color){
        switch (color) {
            case GREEN:
                System.out.println("绿色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
        }
    }
    public static void main(String[] args) {
        color(Color.RED);
    }

}
