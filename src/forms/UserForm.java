package forms;

import controllers.Admin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import models.Tweet;
import models.User;
import pattern.Observer;

public class UserForm extends javax.swing.JFrame implements Observer{
    
    private Admin admin = Admin.getInstance();
    private User currentUser = null;
    private DefaultListModel followingListModel = new DefaultListModel();
    private DefaultListModel tweetsListModel = new DefaultListModel();

    public UserForm() {
        initComponents();

    }
    
    public void setUser(User user) {
        this.currentUser = user;
                
        setFollowingData();
        setTweets();

    }
    
    private void setFollowingData() {
        //set following list
        for (int i = 0 ; i < currentUser.getFollowing().size() ; i++) {
            followingListModel.addElement(currentUser.getFollowing().get(i));
        }
        
       
    }
    
    private void setTweets() {
        ArrayList<Tweet> tweets = new ArrayList<>();
        
        tweets.addAll(currentUser.getTweets());
        
        for (int i = 0 ; i < currentUser.getFollowing().size() ; i++ ) {
            tweets.addAll(currentUser.getFollowing().get(i).getTweets());
            currentUser.getFollowing().get(i).addObserver(this);
        }
        
        Collections.sort(tweets);
        
        for(int i = 0 ; i < tweets.size(); i++) {
            tweetsListModel.addElement(tweets.get(i));
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFollowUser = new javax.swing.JTextField();
        btnFollowUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFollowing = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTweet = new javax.swing.JTextArea();
        btnTweet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTweets = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFollowUser.setText("Follow User");
        btnFollowUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFollowUserActionPerformed(evt);
            }
        });

        listFollowing.setModel(followingListModel);
        jScrollPane1.setViewportView(listFollowing);

        txtTweet.setColumns(20);
        txtTweet.setRows(5);
        jScrollPane2.setViewportView(txtTweet);

        btnTweet.setText("Tweet");
        btnTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTweetActionPerformed(evt);
            }
        });

        listTweets.setModel(tweetsListModel);
        jScrollPane3.setViewportView(listTweets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTweet, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFollowUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnFollowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFollowUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFollowUser))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFollowUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFollowUserActionPerformed
        String userToFollowName = txtFollowUser.getText();
        User userToFollow = admin.getUser(userToFollowName);
        if (userToFollow == null) {
            JOptionPane.showMessageDialog(null, "User does not exist");
            return;
        } else if (userToFollowName.equals(currentUser.getUserName())) {
            JOptionPane.showMessageDialog(null, "you cannot follow yourself");
            return;
        }
        
        currentUser.addFollowing(userToFollow);
        userToFollow.addFollower(currentUser);
        userToFollow.addObserver(this);
        
        followingListModel.addElement(userToFollow);
        txtFollowUser.setText("");
        
    }//GEN-LAST:event_btnFollowUserActionPerformed

    private void btnTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTweetActionPerformed
        Tweet newTweet = currentUser.addTweet(txtTweet.getText());
        this.tweetsListModel.add(0, newTweet);
    }//GEN-LAST:event_btnTweetActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFollowUser;
    private javax.swing.JButton btnTweet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listFollowing;
    private javax.swing.JList<String> listTweets;
    private javax.swing.JTextField txtFollowUser;
    private javax.swing.JTextArea txtTweet;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Object arg) {
        tweetsListModel.add(0,(Tweet) arg);
    }
}
