

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Full_screen{ 
	/*메인함수*/ 
	public static void main(String[] args){  
		try{
			Robot robot = new Robot();
			robot.mouseMove(500, 400);
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
		
		}catch(Exception exception) {
			System.out.println("실패");
		}
	}
}