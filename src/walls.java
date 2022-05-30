import java.awt.*;
public class walls {
	public static final int width = 30; 
	public static final int length = 30;
	int x, y;
	Client tc;
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	private static Image[] wallImags = null;
	static {
		wallImags = new Image[] { 
		tk.getImage(walls.class.getResource("Images/walls.gif")), };
	}
	public walls(int x, int y, Client tc) { 
		this.x = x;
		this.y = y;
		this.tc = tc; 
	}
	public void draw(Graphics g) {
		g.drawImage(wallImags[0], x, y, null);
	}
	public Rectangle getRect() {  
		return new Rectangle(x, y, width, length);
	}
}
