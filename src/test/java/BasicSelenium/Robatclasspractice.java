package BasicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robatclasspractice 
{
	public static void main(String[] args) throws AWTException{

		Robot r =new Robot();
		//r.keyPress(KeyEvent.VK_CAPS_LOCK);//IT IS USED FOR CAP LETTER IN THE WRITING PROGRAM
		//After first letter cap next letter will print the small letter
		r.keyPress(KeyEvent.VK_SHIFT);//IT WILL CONTROL THE SHIFT BUTTON/KEY AND PRESS
		r.keyPress(KeyEvent.VK_H);
		System.out.println("HI1");
		r.keyRelease(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_SHIFT);//IT WILL RELEASE THE SHIFT
		
		r.keyRelease(KeyEvent.VK_E);
		System.out.println("HI2");
		r.keyRelease(KeyEvent.VK_E);//enter key word
		
		//r.keyRelease(KeyEvent.VK_L);op
		//System.out.println("HI3");
		r.keyRelease(KeyEvent.VK_L);
		
		r.keyRelease(KeyEvent.VK_L);
		System.out.println("HI4");
		r.keyRelease(KeyEvent.VK_L);
		
		r.keyRelease(KeyEvent.VK_O);
		System.out.println("HI5");
		r.keyRelease(KeyEvent.VK_O);
	} 
}

