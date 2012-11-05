
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LikesPanel extends JPanel {
	private JCheckBox water, soda, tea, energyDrink, gatorade, basketball, videoGames, skiing, hiking, running, couchPotato;
	private JPanel one;
	FeedbackPanel fp = new FeedbackPanel();
	
	public LikesPanel(FeedbackPanel fp)
	{
		this.fp = fp;
		one = new JPanel();
		add(one);
		JLabel label1 = new JLabel("Select your preferred beverages:");
		JLabel label2 = new JLabel("Select your favorite activities:");
		one.add(label1);
		water = new JCheckBox("Water");
		water.addActionListener(new JCheckBoxListener());
		soda = new JCheckBox("Soda");
		soda.addActionListener(new JCheckBoxListener());
		tea = new JCheckBox("Tea");
		tea.addActionListener(new JCheckBoxListener());
		energyDrink = new JCheckBox("Energy Drink");
		energyDrink.addActionListener(new JCheckBoxListener());
		gatorade = new JCheckBox("Gatorade");
		gatorade.addActionListener(new JCheckBoxListener());
		basketball = new JCheckBox("Basketball");
		basketball.addActionListener(new JCheckBoxListener());
		videoGames = new JCheckBox("Video Games");
		videoGames.addActionListener(new JCheckBoxListener());
		skiing = new JCheckBox("Skiing");
		skiing.addActionListener(new JCheckBoxListener());
		hiking = new JCheckBox("Hiking");
		hiking.addActionListener(new JCheckBoxListener());
		running = new JCheckBox("Running");
		running.addActionListener(new JCheckBoxListener());
		couchPotato = new JCheckBox("Couch Potato");
		couchPotato.addActionListener(new JCheckBoxListener());
		one.add(water);
		one.add(soda);
		one.add(tea);
		one.add(energyDrink);
		one.add(gatorade);
		one.add(label2);
		one.add(basketball);
		one.add(videoGames);
		one.add(skiing);
		one.add(hiking);
		one.add(running);
		one.add(couchPotato);
	}
	
	private class JCheckBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == water) 
			{
				fp.setWater("Good choice");
			} else if(e.getSource() == soda)
			{
				fp.setSoda("Enter a burp contest");
			} else if(e.getSource() == tea)
			{
				fp.setTea("Would you like some crumpets?");
			} else if(e.getSource() == energyDrink)
			{
				fp.setEnergyDrink("Can you see noises?");
			} else if(e.getSource() == gatorade)
			{
				fp.setGatorade("You're famous!");
			} else if(e.getSource() == basketball)
			{
				fp.setBasketball("He shoots...he scores!!");
			} else if(e.getSource() == videoGames)
			{
				fp.setVideoGames("You should click couch potato!");
			} else if(e.getSource() == skiing)
			{
				fp.setSkiing("Brrr...");
			} else if(e.getSource() == tea)
			{
				fp.setTea("Would you like some crumpets?");
			} else if(e.getSource() == hiking)
			{
				fp.setHiking("Watch out for bears!");
			} else if(e.getSource() == running)
			{
				fp.setRunning("Flash Gordon!");
			} else if(e.getSource() == couchPotato)
			{
				fp.setCouchPotato("Get up lazy bones!");
			}
		}
	}
}
