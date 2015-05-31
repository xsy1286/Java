
import java.awt.*;
import javax.swing.*;


public class Drawing extends JFrame {
	public Drawing() {
		setLayout(null);

		int b=300;
		int i = 9;
		int div=i;
		int x = 10;
		int y = b-x;
		while(i>0) {
			C c1 = new C();
			c1.setSize(100,100);
			c1.setLocation(x, y);
			this.add(c1);
			System.out.println(x + ":" + y);
			x+=b/div;
			y=b-x;
			i--;
		}
		this.setSize(300,300);
	}

	public static void main(String[] args) {
		JFrame j = new Drawing();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}

class C extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(20, 20, 30, 30);
		//System.out.println(getWidth()+""+getHeight());
	}
}