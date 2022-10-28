// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        for(int a = 0; a <= 70; a ++){
            g.drawLine(x1, y1, x2, y2);
            x1 += 14;
            y2 -= 9;
        }
        int x3 = 990;
        int y3 = 640;
        int x4 = 10;
        int y4 = 640;
        for(int a = 0; a <= 70; a ++) {
            g.drawLine(x3, y3, x4, y4);
            x3 -= 14;
            y4 -= 9;
        }
        int x5 = 10;
        int y5 = 10;
        int x6 = 990;
        int y6 = 10;
        for(int a = 0; a <= 70; a ++) {
            g.drawLine(x5, y5, x6, y6);
            x5 += 14;
            y6 += 9;
        }
        int x7 = 990;
        int y7 = 10;
        int x8 = 10;
        int y8 = 10;
        for(int a = 0; a <= 70; a ++) {
            g.drawLine(x7, y7, x8, y8);
            x7 -= 14;
            y8 += 9;
        }
        int width2 = 490;
        int height2 = 320;
        g.drawRect(255,165,width2,height2);
        int x9 = 255;
        int y9 = 485;
        int x10 = 745;
        int y10 = 485;
        for(int a = 0; a <= 35; a ++){
            g.drawLine(x9, y9, x10, y10);
            x9 += 14;
            y10 -= 9;
        }
        int x11 = 745;
        int y11= 485;
        int x12 = 255;
        int y12 = 485;
        for(int a = 0; a <= 35; a ++) {
            g.drawLine(x11, y11, x12, y12);
            x11 -= 14;
            y12 -= 9;
        }
        int x13 = 255;
        int y13 = 165;
        int x14 = 745;
        int y14 = 165;
        for(int a = 0; a <= 35; a ++) {
            g.drawLine(x13, y13, x14, y14);
            x13 += 14;
            y14 += 9;
        }
        int x15 = 745;
        int y15 = 165;
        int x16 = 255;
        int y16 = 165;
        for(int a = 0; a <= 35; a ++) {
            g.drawLine(x15, y15, x16, y16);
            x15 -= 14;
            y16 += 9;
        }
    }
}
