import javax.swing.JFrame;

public abstract class BaseFrame extends JFrame {

	public BaseFrame() {
		createComponents();
		createLayout();
		addComponents();
		addListeners();
		display();
	}

	public abstract void createComponents();

	public abstract void addComponents();

	public abstract void createLayout();

	public abstract void addListeners();

	private void display() {
		setSize(1200, 100);
		setVisible(true);

	}

}