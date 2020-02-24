/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;
import Business.CustomerDirectory;
import Business.AirlineDirectory;
import Business.AirlinerDirectory;
import Business.FleetDirectory;
import Business.FlightDetailsDirectory;
import java.awt.CardLayout;

import javax.swing.JPanel;

/**
 *
 * @author Girija Dhawale
 */
public class ManageAirliner extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirliner
     */
   JPanel CardSequenceJPanel;
    private AirlineDirectory airDict;
    private CustomerDirectory custDict;
    private FleetDirectory fleetdirectory;
    private AirlinerDirectory airlinerDirectory;
    private FlightDetailsDirectory flightDetailsDirectory;
    public ManageAirliner(JPanel CardSequenceJPanel, CustomerDirectory custDirecr, AirlineDirectory airDirect, FleetDirectory fleetdirectory,AirlinerDirectory airlinerDirectory,FlightDetailsDirectory flightDetailsDirectory) {
          initComponents();
          this.CardSequenceJPanel=CardSequenceJPanel;
          this.custDict= custDirecr;
          this.airDict=airDirect;
          this.fleetdirectory=fleetdirectory;
          this.airlinerDirectory = airlinerDirectory;
          this.flightDetailsDirectory = flightDetailsDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageAirliner = new javax.swing.JButton();
        btnViewCustomer = new javax.swing.JButton();

        setBackground(new java.awt.Color(73, 0, 153));

        btnManageAirliner.setBackground(new java.awt.Color(255, 255, 255));
        btnManageAirliner.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageAirliner.setText("Manage Airline");
        btnManageAirliner.setBorder(null);
        btnManageAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinerActionPerformed(evt);
            }
        });

        btnViewCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnViewCustomer.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnViewCustomer.setText("View Customer");
        btnViewCustomer.setBorder(null);
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnManageAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnManageAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinerActionPerformed
        // TODO add your handling code here:
        AirlineWorkArea awa = new AirlineWorkArea(CardSequenceJPanel, airDict, airlinerDirectory);
        CardSequenceJPanel.add(awa);
         CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnManageAirlinerActionPerformed

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        // TODO add your handling code here:
        CustomerTADetails cdp = new CustomerTADetails(CardSequenceJPanel,custDict,flightDetailsDirectory);
        CardSequenceJPanel.add("customerdetailsJPanel",cdp);
        CardLayout layout=(CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnViewCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAirliner;
    private javax.swing.JButton btnViewCustomer;
    // End of variables declaration//GEN-END:variables
}
