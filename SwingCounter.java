import javax.swing.*;
import java.awt.*;

public class SwingCounter extends JFrame
{
	private JLabel jlbl;
	private JTextField jtf;
	private JButton jbtn;

	public SwingCounter()
	{
		super("Swing Counter");

		jlbl = new JLabel("Counter");
		jtf = new JTextField(10);
		jbtn = new JButton("Count");

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		c.add(jlbl);
		c.add(jtf);
		c.add(jbtn);
	}

}