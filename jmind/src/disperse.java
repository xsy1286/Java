import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Geometry
{
	int left;
	int top;
	int width;
	int height;

	public int getRight(){
		return left+width;
	}
	public int getButtom(){
		return top+height;
	}

	public int getX(){
		return left+width/2;
	}
	public int getY(){
		return top+height/2;
	}
}

public class Background extends Geometry
{
	int bgcolor;
}

public class Border extends Background
{
	int bwidth;
	int bcolor;
	boolean visible;//if visible=0 ,set width=0
}

public class Font extends Border
{
	int size;
	int fcolor;
	String font;
}

public class Mobject extends Font
{
	public Mobject parent;
    public List childs=new ArrayList();

	public Mobject(Mobject parent)
	{
		final int defaultFontSize=12;
		left=top=width=height=0;
		bgcolor=0xfffff;
		bwidth=1;bcolor=0x0;visible=true;
		size=defaultFontSize;fcolor=0x0;font=new String("");

		this.parent=parent;
		parent.childs.add(this);
	}

}