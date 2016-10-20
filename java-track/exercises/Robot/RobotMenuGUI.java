package Robot;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Robot.Robot;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RobotMenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RobotMenuGUI frame = new RobotMenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RobotMenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6, "COMPUTE");
		panel_6.setLayout(null);
		
		JLabel lblComputeDistanceBetween = new JLabel("Compute distance between Robots");
		lblComputeDistanceBetween.setBounds(10, 11, 185, 14);
		panel_6.add(lblComputeDistanceBetween);
		
		JList list_3 = new JList();
		list_3.setBounds(20, 36, 303, 204);
		panel_6.add(list_3);
		
		JLabel lblRobot = new JLabel("Robot 1:");
		lblRobot.setBounds(328, 37, 64, 14);
		panel_6.add(lblRobot);
		
		textField_2 = new JTextField();
		textField_2.setBounds(328, 53, 86, 20);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRobot_1 = new JLabel("Robot 2:");
		lblRobot_1.setBounds(328, 77, 46, 14);
		panel_6.add(lblRobot_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(328, 93, 86, 20);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(328, 220, 86, 20);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCompute = new JButton("Compute!");
		btnCompute.setBounds(325, 190, 89, 23);
		panel_6.add(btnCompute);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, "MOVE");
		panel_5.setLayout(null);
		
		JLabel lblMoveARobot = new JLabel("Move a Robot");
		lblMoveARobot.setBounds(10, 11, 100, 14);
		panel_5.add(lblMoveARobot);
		
		JList list_2 = new JList();
		list_2.setBounds(20, 36, 286, 204);
		panel_5.add(list_2);
		
		JLabel lblNewXCoordinate = new JLabel("New X Coordinate:");
		lblNewXCoordinate.setBounds(316, 37, 98, 14);
		panel_5.add(lblNewXCoordinate);
		
		textField = new JTextField();
		textField.setBounds(315, 53, 86, 20);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewYCoordinate = new JLabel("New Y Coordinate:");
		lblNewYCoordinate.setBounds(316, 84, 98, 14);
		panel_5.add(lblNewYCoordinate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(315, 101, 86, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnMoveRobot = new JButton("Move Robot!");
		btnMoveRobot.setBounds(312, 131, 102, 23);
		panel_5.add(btnMoveRobot);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, "ROTATE");
		panel_4.setLayout(null);
		
		JLabel lblRotateARobot = new JLabel("Rotate a Robot");
		lblRotateARobot.setBounds(10, 11, 125, 14);
		panel_4.add(lblRotateARobot);
		
		JList list_1 = new JList();
		list_1.setBounds(20, 36, 299, 204);
		panel_4.add(list_1);
		
		JButton btnRotateRight = new JButton("Rotate Right");
		btnRotateRight.setBounds(325, 116, 89, 23);
		panel_4.add(btnRotateRight);
		
		JButton btnRotateLeft = new JButton("Rotate Left");
		btnRotateLeft.setBounds(325, 150, 89, 23);
		panel_4.add(btnRotateLeft);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "LIST");
		panel_3.setLayout(null);
		
		JLabel lblViewAList = new JLabel("View a List of Robots");
		lblViewAList.setBounds(10, 11, 151, 14);
		panel_3.add(lblViewAList);
		
		JButton btnMainMenue = new JButton("Main Menu");
		btnMainMenue.setBounds(335, 217, 89, 23);
		panel_3.add(btnMainMenue);
		
		JList list = new JList();
		list.setBounds(27, 37, 298, 203);
		panel_3.add(list);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "CREATE");
		panel_2.setLayout(null);
		
		JLabel lblCreateARobot = new JLabel("Create a Robot");
		lblCreateARobot.setBounds(10, 11, 120, 14);
		panel_2.add(lblCreateARobot);
		
		JLabel lblWhatIsYour = new JLabel("To create a Robot, we need the following:");
		lblWhatIsYour.setBounds(10, 36, 233, 14);
		panel_2.add(lblWhatIsYour);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(93, 58, 46, 14);
		panel_2.add(lblName);
		
		JLabel lblStartingXCoordinate = new JLabel("Starting X coordinate:");
		lblStartingXCoordinate.setBounds(20, 83, 133, 14);
		panel_2.add(lblStartingXCoordinate);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(124, 58, 80, 14);
		panel_2.add(textPane);
		String name = textPane.getText();
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(124, 83, 80, 14);
		panel_2.add(textPane_1);
		String x = textPane_1.getText();
		int xCo = Integer.parseInt(x);
		
		
		JLabel lblStartingYCoordinate = new JLabel("Starting Y coordinate:");
		lblStartingYCoordinate.setBounds(19, 108, 120, 14);
		panel_2.add(lblStartingYCoordinate);
		
		JLabel lblSpeed = new JLabel("Speed:");
		lblSpeed.setBounds(93, 134, 54, 14);
		panel_2.add(lblSpeed);
		
		JLabel lblOrientation = new JLabel("Orientation:");
		lblOrientation.setBounds(69, 159, 65, 14);
		panel_2.add(lblOrientation);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(124, 108, 80, 14);
		panel_2.add(textPane_2);
		String y = textPane_2.getText();
		int yCo = Integer.parseInt(y);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(124, 133, 80, 14);
		panel_2.add(textPane_3);
		String speed = textPane_3.getText();
		int speed2 = Integer.parseInt(speed);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(124, 159, 80, 14);
		panel_2.add(textPane_4);
		String direct = textPane_4.getText();
		
		JButton btnCreateRobot = new JButton("Create Robot!");
		btnCreateRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Robot r =  new Robot(name, xCo, yCo, speed2, direct);
			}
		});
		btnCreateRobot.setBounds(84, 188, 120, 23);
		panel_2.add(btnCreateRobot);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "MAIN");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-10013, -10036, 424, 251);
		panel.add(panel_1);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Robot Start Menu!");
		lblWelcomeToThe.setBounds(10, 20, 176, 14);
		panel.add(lblWelcomeToThe);
		
		JLabel lblWhatWouldYou = new JLabel("What would you like to do?");
		lblWhatWouldYou.setBounds(10, 45, 161, 14);
		panel.add(lblWhatWouldYou);
		
		JRadioButton rdbtnCreateARobot = new JRadioButton("Create a Robot");
		rdbtnCreateARobot.setBounds(10, 66, 109, 23);
		panel.add(rdbtnCreateARobot);
		
		JRadioButton rdbtnViewAList = new JRadioButton("View a list of Robots");
		rdbtnViewAList.setBounds(10, 92, 176, 23);
		panel.add(rdbtnViewAList);
		
		JRadioButton rdbtnRotateARobot = new JRadioButton("Rotate a Robot");
		rdbtnRotateARobot.setBounds(10, 118, 109, 23);
		panel.add(rdbtnRotateARobot);
		
		JRadioButton rdbtnMoveARobot = new JRadioButton("Move a Robot");
		rdbtnMoveARobot.setBounds(10, 144, 109, 23);
		panel.add(rdbtnMoveARobot);
		
		JRadioButton rdbtnComputeDistanceBetween = new JRadioButton("Compute distance between Robots");
		rdbtnComputeDistanceBetween.setBounds(10, 170, 214, 23);
		panel.add(rdbtnComputeDistanceBetween);
		
		JButton btnGo = new JButton("GO!");
		btnGo.setBounds(30, 200, 89, 23);
		panel.add(btnGo);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnCreateARobot);
		group.add(rdbtnViewAList);
		group.add(rdbtnRotateARobot);
		group.add(rdbtnMoveARobot);
		group.add(rdbtnComputeDistanceBetween);
	}
}
