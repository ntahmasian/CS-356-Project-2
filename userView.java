import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userView frame = new userView();
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
	public userView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter the ID you would like to fallow:");
		lblPleaseEnterThe.setBounds(282, 43, 228, 41);
		contentPane.add(lblPleaseEnterThe);
		
		textField = new JTextField();
		textField.setBounds(282, 95, 136, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnFallowUser = new JButton("Fallow User");
		btnFallowUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		/*		//================================================================================================add user
				
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				DefaultMutableTreeNode newUser = new DefaultMutableTreeNode(textField.getText());
				if (selectedNode != null){
					if (!textField.getText().trim().equals("")){
						model.insertNodeInto(newUser, selectedNode, selectedNode.getChildCount());
					}
					else{
						jlMssg.setText("You must enter an ID");

					}
				}
				else{
					jlMssg.setText("You must chose a group to add the ID in");

				}	
			*/	
			
			}
		});
		btnFallowUser.setBounds(441, 95, 136, 48);
		contentPane.add(btnFallowUser);
		
		JLabel lblWhatWouldYou = new JLabel("What would you like to tweet?");
		lblWhatWouldYou.setBounds(282, 223, 228, 41);
		contentPane.add(lblWhatWouldYou);
		
		textField_1 = new JTextField();
		textField_1.setBounds(282, 268, 136, 48);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTweet = new JButton("Tweet");
		btnTweet.setBounds(441, 268, 136, 48);
		contentPane.add(btnTweet);
		
		JLabel lblListViewcurrent = new JLabel("List view (current Following)");
		lblListViewcurrent.setBounds(10, 11, 189, 21);
		contentPane.add(lblListViewcurrent);
		
		JLabel lblListViewnews = new JLabel("List view (News Feed)");
		lblListViewnews.setBounds(610, 14, 189, 21);
		contentPane.add(lblListViewnews);
	}
}
