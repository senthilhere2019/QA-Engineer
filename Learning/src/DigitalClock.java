import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;


public class DigitalClock extends Applet{

	
	Font theFont = new Font("TimesRoman",Font.BOLD,24);
	Date theDate;
	
	public void start(){
		while(true){
			theDate = new Date();
			repaint();
			try{ Thread.sleep(1000); }
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		g.setFont(theFont);
		g.drawString(theDate.toString(),10,50);
	}
	
	
}
