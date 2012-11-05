import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.*;


public class HealthPanel extends JPanel {
	private JRadioButton heightShort, heightAverage, tall, thin, weightAverage, hefty, smokes, noSmokes;
	ButtonGroup one = new ButtonGroup();
	ButtonGroup two = new ButtonGroup();
	ButtonGroup three = new ButtonGroup();
	FeedbackPanel fp;
	JRadioListener listener = new JRadioListener();

	public HealthPanel(FeedbackPanel fp)
	{
		setLayout(new GridLayout(3, 1));
		this.fp = fp;

		JPanel first = new JPanel();
		add(first);
		heightShort = new JRadioButton("Short");
		heightAverage = new JRadioButton("Average");
		tall = new JRadioButton("Tall");
		one.add(heightShort);
		heightShort.addActionListener(listener);
		one.add(heightAverage);
		heightAverage.addActionListener(listener);
		one.add(tall);
		tall.addActionListener(listener);
		first.add(heightShort);
		first.add(heightAverage);
		first.add(tall);
		heightAverage.setSelected(true);
		first.setBorder(new TitledBorder(new EtchedBorder(), "Height"));

		JPanel second = new JPanel();
		add(second);
		thin = new JRadioButton("Thin");
		weightAverage = new JRadioButton("Average");
		hefty = new JRadioButton("Hefty");
		two.add(thin);
		two.add(weightAverage);
		two.add(hefty);
		weightAverage.setSelected(true);
		second.add(thin);
		thin.addActionListener(listener);
		second.add(weightAverage);
		weightAverage.addActionListener(listener);
		second.add(hefty);
		hefty.addActionListener(listener);
		second.setBorder(new TitledBorder(new EtchedBorder(), "Weight"));

		JPanel third = new JPanel();
		add(third);
		smokes = new JRadioButton("Smokes");
		smokes.addActionListener(listener);
		noSmokes = new JRadioButton("noSmokes");
		noSmokes.addActionListener(listener);
		three.add(smokes);
		three.add(noSmokes);
		noSmokes.setSelected(true);
		third.add(smokes);
		third.add(noSmokes);
		third.setBorder(new TitledBorder(new EtchedBorder(), "Smokes"));
	}

	private class JRadioListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(heightShort.isSelected())
			{
				fp.setHeightShort("You're not short, you're fun-sized!");
			} else if(heightAverage.isSelected())
			{
				fp.setHeightAverage("No NBA for you.");
			} else if(tall.isSelected())
			{
				fp.setTall("How is the weather up there?");
			} else if(thin.isSelected())
			{
				fp.setThin("Ever heard of ice cream?");
			} else if(weightAverage.isSelected())
			{
				fp.setWeightAverage("Just right!");
			} else if(hefty.isSelected())
			{
				fp.setHefty("More of you to love!");
			} else if(smokes.isSelected())
			{
				fp.setSmokes("Why?!?!");
			} else if(noSmokes.isSelected())
			{
				fp.setNoSmokes("Well done young grasshopper");
			}
		}
	}

}
