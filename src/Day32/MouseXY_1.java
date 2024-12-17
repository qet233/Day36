package Day32;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseXY_1 {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        while (true) {
            Color color = robot.getPixelColor(500,500);
            if (color.getRed()==48&color.getGreen()==145&color.getBlue()==186) {
                System.out.println("检测到蓝色");
                while (true) {
                    Color color1 = robot.getPixelColor(500,500);
                    if(color1.getRed()==4&color1.getGreen()==196&color1.getBlue()==60){
                        System.out.println("检测到绿色");
                        Point point = MouseInfo.getPointerInfo().getLocation();
                        robot.mouseMove(point.x, point.y);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
    //                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                        System.out.println("成功点击");
                        break;
                    }
                }
            }
        }
    }
}
