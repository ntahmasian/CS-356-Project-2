package forms;

import controllers.Admin;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import models.Group;
import models.User;


public class AdminForm extends javax.swing.JFrame {
    private Admin admin = Admin.getInstance();
    private TreeNode rootNode = new DefaultMutableTreeNode(admin.getGroup("Root"));
    private TreeModel userTreeModel = new DefaultTreeModel(rootNode, true);
    
    public AdminForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTreeView = new javax.swing.JTree();
        txtUserName = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        btnAddGroup = new javax.swing.JButton();
        txtGroupName = new javax.swing.JTextField();
        btnViewUser = new javax.swing.JButton();
        btnTotalUser = new javax.swing.JButton();
        btnTotalGroup = new javax.swing.JButton();
        btnTotalMssg = new javax.swing.JButton();
        btnShowPositivP = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usersTreeView.setModel(userTreeModel);
        jScrollPane1.setViewportView(usersTreeView);

        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnAddGroup.setText("Add Group");
        btnAddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGroupActionPerformed(evt);
            }
        });

        txtGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroupNameActionPerformed(evt);
            }
        });

        btnViewUser.setText("View User");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        btnTotalUser.setText("Total Users");
        btnTotalUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalUserActionPerformed(evt);
            }
        });

        btnTotalGroup.setText("Total Grpups");
        btnTotalGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalGroupActionPerformed(evt);
            }
        });

        btnTotalMssg.setText("Total Massages");
        btnTotalMssg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalMssgActionPerformed(evt);
            }
        });

        btnShowPositivP.setText("Show Positive %");
        btnShowPositivP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPositivPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTotalMssg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShowPositivP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTotalUser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTotalGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddGroup, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTotalUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotalGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTotalMssg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowPositivP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
         if (txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a user name");
            return;
        }
        // TODO add your handling code here:
        DefaultTreeModel model = (DefaultTreeModel) usersTreeView.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) usersTreeView.getLastSelectedPathComponent();
        if (selectedNode == null || selectedNode.getAllowsChildren() == false) {  
            JOptionPane.showMessageDialog(null, "you should select a group");
        } else {
            Group group = (Group) selectedNode.getUserObject();
            User newUser = admin.addUser(txtUserName.getText(), group);
            if (newUser!= null) {
                selectedNode.add(new DefaultMutableTreeNode(newUser, false));
                model.reload();
                txtUserName.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null, "User name already exists");
            }
            
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnAddGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGroupActionPerformed
        if (txtGroupName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a group name");
            return;
        }
        DefaultTreeModel model = (DefaultTreeModel) usersTreeView.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) usersTreeView.getLastSelectedPathComponent();
        if (selectedNode == null || selectedNode.getAllowsChildren() == false) {
            
            JOptionPane.showMessageDialog(null, "you should select a group");
        } else {
            Group group = (Group) selectedNode.getUserObject();
            Group newGroup = admin.addGroup(txtGroupName.getText(), group);
            
            if (newGroup != null) {
                selectedNode.add(new DefaultMutableTreeNode(newGroup, true));
                model.reload();
                txtGroupName.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Group name already exists");

            }
            
        }
    }//GEN-LAST:event_btnAddGroupActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        // TODO add your handling code here:
        
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) usersTreeView.getLastSelectedPathComponent();
        if (selectedNode == null || selectedNode.getAllowsChildren() == true) {
            JOptionPane.showMessageDialog(null, "Please select a user to view");
            return;
        }
        UserForm form = new UserForm();
        form.setUser((User) selectedNode.getUserObject());
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnTotalUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalUserActionPerformed
        JOptionPane.showMessageDialog(null, "Total Users are " + admin.getUserCount());
    }//GEN-LAST:event_btnTotalUserActionPerformed

    private void btnTotalGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalGroupActionPerformed
        JOptionPane.showMessageDialog(null, "Total Groups are " + admin.getGroupCount());
    }//GEN-LAST:event_btnTotalGroupActionPerformed

    private void txtGroupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroupNameActionPerformed
    }//GEN-LAST:event_txtGroupNameActionPerformed

    private void btnTotalMssgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalMssgActionPerformed
        int count = admin.getTotalTweets();
        JOptionPane.showMessageDialog(null, "Total massages are " + count);
    }//GEN-LAST:event_btnTotalMssgActionPerformed

    private void btnShowPositivPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPositivPActionPerformed
        double count = admin.getPositiveTweetsPercentage();
        JOptionPane.showMessageDialog(null, "Positive Percentage is %" + count);
    }//GEN-LAST:event_btnShowPositivPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGroup;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnShowPositivP;
    private javax.swing.JButton btnTotalGroup;
    private javax.swing.JButton btnTotalMssg;
    private javax.swing.JButton btnTotalUser;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtGroupName;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTree usersTreeView;
    // End of variables declaration//GEN-END:variables
}
