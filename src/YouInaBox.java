import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class YouInaBox extends JFrame {

	public YouInaBox()
	{
		setTitle("You in a box!");
		setSize(1250, 400);
		FeedbackPanel fp = new FeedbackPanel();
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		menu.add(createFileMenu());
		HealthPanel hp = new HealthPanel(fp);
		add(hp, BorderLayout.EAST);
		LikesPanel lp = new LikesPanel(fp);
		add(lp, BorderLayout.NORTH);
		MoviesPanel mp = new MoviesPanel();
		add(mp, BorderLayout.WEST);
		DescriptionPanel dp = new DescriptionPanel();
		add(dp, BorderLayout.CENTER);
		add(fp, BorderLayout.SOUTH);
	}
	
	private JMenu createFileMenu() {
		JMenu menu = new JMenu("File");
		menu.add(createFileExitItem());
		return menu;
	}

	private JMenuItem createFileExitItem() {
		JMenuItem exitItem = new JMenuItem("Exit");
		
		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		}
		
		exitItem.addActionListener(new MenuItemListener());
		return exitItem;
	}

	public static void main(String[] args) {
		YouInaBox me = new YouInaBox();
		me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		me.setVisible(true);
	}

}
