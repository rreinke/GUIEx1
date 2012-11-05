
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.*;


public class MoviesPanel extends JPanel {
	private JTextField firstMovie, secondMovie, thirdMovie;
	private JLabel first, second, third;
	private JPanel a, b;
	
	public MoviesPanel()
	{
		a = new JPanel();
		b = new JPanel();
		add(a);
		add(b);
		JLabel label = new JLabel("Enter your top three favorite movies:");
		first = new JLabel("1.");
		second = new JLabel("2.");
		third = new JLabel("3.");
		a.add(label);
		b.setLayout(new GridLayout(3, 2));
		firstMovie = new JTextField();
		secondMovie = new JTextField();
		thirdMovie = new JTextField();
		b.add(first);
		b.add(firstMovie);
		b.add(second);
		b.add(secondMovie);
		b.add(third);
		b.add(thirdMovie);
		setLayout(new GridLayout(2, 1));
		setBorder(new TitledBorder(new EtchedBorder(), "Movies"));
	}
}
