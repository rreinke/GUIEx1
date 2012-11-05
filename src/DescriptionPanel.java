import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DescriptionPanel extends JPanel {
	private JTextField description;
	
	public DescriptionPanel()
	{
		JLabel label = new JLabel("Enter a description of yourself");
		add(label);
		description = new JTextField("You in a box");
		description.setFont(new Font("SansSerif", Font.BOLD, 50));
		add(description);
		setLayout(new GridLayout(2, 1));
		setBorder(new TitledBorder(new EtchedBorder(), "It's all about me!"));
	}
}
