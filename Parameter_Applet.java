import java.applet.*;
import java.awt.*;
import java.io.*;
/*<applet code="ParameterPro" width=300 height=300>
<param name="name" value="Luqman">
<param name="year" value="First year">
<param name="branch" value="CSE">
<param name="college" value="RVR & JC">
<param name="details" value="Student Details">
<param name="fee" value="70000">
</applet>*/
public class ParameterPro extends Applet{
	public void paint(Graphics g){
		g.drawString(getParameter("details"),150,20);
		g.drawString("Name: "+getParameter("name"),50,50);
		g.drawString("Branch: "+getParameter("branch"),50,70);
		g.drawString("Year: "+getParameter("year"),50,90);
		g.drawString("College: "+getParameter("college"),50,110);
		int d=Integer.parseInt(getParameter("fee"));
		g.drawString("Fee: "+d,50,130);
	}
}
