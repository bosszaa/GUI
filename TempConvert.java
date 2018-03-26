import javax.swing.*;
import java.awt.*;

public class TempConvert extends JFrame
{
	private JLabel jlbl,jlbl1;
	private JTextField jtf,jtf1;
	private JButton jbtn;

	public TempConvert()
	{
		super("Temperature Converter");

		jlbl = new JLabel("Celsius:");
		jlbl1 = new JLabel("Fahrenheit:");
		jtf = new JTextField(10);
		jtf1 = new JTextField(10);
		//jbtn = new JButton("Count");

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		c.add(jlbl);
		c.add(jlbl1);
		c.add(jtf);
		c.add(jtf1);
	}

}