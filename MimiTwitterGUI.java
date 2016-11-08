import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTree;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MimiTwitterGUI {

	private JFrame frame;
	private JTextField txtUserId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MimiTwitterGUI window = new MimiTwitterGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MimiTwitterGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		tree.setBounds(553, 0, 162, 362);
		frame.getContentPane().add(tree);
		
		
		
		
		
		JLabel jlMssg = new JLabel("");
		jlMssg.setForeground(Color.RED);
		jlMssg.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlMssg.setBounds(10, 246, 406, 39);
		frame.getContentPane().add(jlMssg);
		
		
		
		
		
		
		
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//================================================================================================add user
				
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				DefaultMutableTreeNode newUser = new DefaultMutableTreeNode(txtUserId.getText());
				if (selectedNode != null){
					if (!txtUserId.getText().trim().equals("")){
						model.insertNodeInto(newUser, selectedNode, selectedNode.getChildCount());
					}
					else{
						jlMssg.setText("You must enter an ID");

					}
				}
				else{
					jlMssg.setText("You must chose a group to add the ID in");

				}	
				
			}
		});
		
		txtUserId = new JTextField();
		txtUserId.setBounds(115, 156, 139, 53);
		frame.getContentPane().add(txtUserId);
		txtUserId.setColumns(10);
		btnAddUser.setBounds(314, 156, 133, 53);
		frame.getContentPane().add(btnAddUser);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter a user or group ID you would like to add");
		lblPleaseEnterThe.setToolTipText("");
		lblPleaseEnterThe.setBounds(10, 11, 318, 39);
		frame.getContentPane().add(lblPleaseEnterThe);
		
		JLabel lblMakeSureTo = new JLabel("make sure to chose the groupe location before adding");
		lblMakeSureTo.setBounds(10, 44, 330, 74);
		frame.getContentPane().add(lblMakeSureTo);
		
		JButton btnOpenUserView = new JButton("Open user view");
		btnOpenUserView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//...................................................................
				
				
				DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				if (selectedNode != null){
					userView uv = new userView();
					uv.setVisible(true);
				}
				else{
					jlMssg.setText("You must chose a group or ID to view");

				}
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnOpenUserView.setBounds(20, 289, 214, 57);
		frame.getContentPane().add(btnOpenUserView);
		
		
	}
}
