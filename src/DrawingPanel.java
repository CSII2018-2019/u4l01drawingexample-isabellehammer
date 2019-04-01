import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public DrawingPanel() {
		setBackground(Color.WHITE);
		
	}
	
	private Color myPink = new Color(241, 169, 242);
	private Color myBlue = new Color(107, 158, 239);
	private Color myPurple = new Color(157, 131, 239);
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(myPurple);
		Font logoFont = new Font ("Karmatic Arcade", Font.BOLD, 20);
		g.setFont(logoFont);
		g.drawString("Eye", 143, 200);
		
		g.setColor(myPurple);
		Font logoFont2 = new Font ("Karmatic Arcade", Font.BOLD, 20);
		g.setFont(logoFont);
		g.drawString("Hammer", 143, 225);
		
		g.setColor(myPurple);
		Font logoFont3 = new Font ("Karmatic Arcade", Font.BOLD, 20);
		g.setFont(logoFont);
		g.drawString("Inc.", 143, 250);
		
		//make a box
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
}
