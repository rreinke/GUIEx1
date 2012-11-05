import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class FeedbackPanel extends JPanel {
	private JTextArea feedback;
	private String heightShort, heightAverage, tall, thin, weightAverage, hefty, smokes, noSmokes, water, soda, tea, energyDrink, gatorade, basketball, videoGames, skiing, hiking, running, couchPotato;

	public FeedbackPanel()
	{
		JLabel label = new JLabel("Feedback");
		feedback = new JTextArea("");
		add(label);
		add(feedback);
		setLayout(new GridLayout(2, 1));
	}

	public void setHeightShort(String heightShort) {
		this.heightShort = heightShort;
		feedback.setText(heightShort);
	}

	public void setHeightAverage(String heightAverage) {
		this.heightAverage = heightAverage;
		feedback.setText(heightAverage);
	}

	public void setTall(String tall) {
		this.tall = tall;
		feedback.setText(tall);
	}

	public void setThin(String thin) {
		this.thin = thin;
		feedback.setText(thin);
	}

	public void setWeightAverage(String weightAverage) {
		this.weightAverage = weightAverage;
		feedback.setText(weightAverage);
	}

	public void setHefty(String hefty) {
		this.hefty = hefty;
		feedback.setText(hefty);
	}
	
	public void setSmokes(String smokes) {
		this.smokes = smokes;
		feedback.setText(smokes);
	}

	public void setNoSmokes(String noSmokes) {
		this.noSmokes = noSmokes;
		feedback.setText(noSmokes);
	}

	public void setWater(String water) {
		this.water = water;
		feedback.setText(water);
	}

	public void setSoda(String soda) {
		this.soda = soda;
		feedback.setText(soda);
	}

	public void setTea(String tea) {
		this.tea = tea;
		feedback.setText(tea);
	}

	public void setEnergyDrink(String energyDrink) {
		this.energyDrink = energyDrink;
		feedback.setText(energyDrink);
	}

	public void setGatorade(String gatorade) {
		this.gatorade = gatorade;
		feedback.setText(gatorade);
	}

	public void setBasketball(String basketball) {
		this.basketball = basketball;
		feedback.setText(basketball);
	}

	public void setVideoGames(String videoGames) {
		this.videoGames = videoGames;
		feedback.setText(videoGames);
	}

	public void setSkiing(String skiing) {
		this.skiing = skiing;
		feedback.setText(skiing);
	}

	public void setHiking(String hiking) {
		this.hiking = hiking;
		feedback.setText(hiking);
	}

	public void setRunning(String running) {
		this.running = running;
		feedback.setText(running);
	}

	public void setCouchPotato(String couchPotato) {
		this.couchPotato = couchPotato;
		feedback.setText(couchPotato);
	}
}
