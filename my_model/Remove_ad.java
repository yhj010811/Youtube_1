

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Remove_ad{ 
	/*메인함수*/ 
	public static void main(String[] args){  
		try{
			Robot robot = new Robot();
			robot.mouseMove(500, 400);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//좌클릭 다운
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);//좌클릭 업
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//좌클릭 다운
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);//좌클릭 업
		}catch(Exception exception) {
			System.out.println("실패");
		}
	}
}