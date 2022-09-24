/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author arvin
 */
public class ReportGenerationForm extends javax.swing.JFrame {

    /**
     * Creates new form ReportGenerationForm1
     */
    public ReportGenerationForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemTitleLabel = new javax.swing.JLabel();
        formTitleLabel = new javax.swing.JLabel();
        appointmentIdLabel = new javax.swing.JLabel();
        customerUsernameLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        appointmentDateLabel = new javax.swing.JLabel();
        appointmentApplianceLabel = new javax.swing.JLabel();
        appointmentTechnicianUsernameLabel = new javax.swing.JLabel();
        customerPaidLabel = new javax.swing.JLabel();
        customerFeedbackLabel = new javax.swing.JLabel();
        customerBirthdayLabel = new javax.swing.JLabel();
        customerPhoneLabel = new javax.swing.JLabel();
        customerEmailLabel = new javax.swing.JLabel();
        customerAddressLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        appointmentPriceLabel = new javax.swing.JLabel();
        appointmentTimeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Generation Form");

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        systemTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemTitleLabel.setText("APU Hostel Home Appliances Service Centre");

        formTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        formTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitleLabel.setText("Report Generation");

        Appointment currentAppointment = ServiceCentre.getInstance().getCurrentAppointment();
        Customer currentCustomer = currentAppointment.getCustomer();
        appointmentIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appointmentIdLabel.setText("Appointment ID: " + currentAppointment.getId());

        customerUsernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerUsernameLabel.setText("Customer username: " + currentCustomer.getUsername()
        );

        customerNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerNameLabel.setText("Customer name: " + currentCustomer.getName());

        appointmentDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LocalDateTime dateTime = currentAppointment.getDateTime();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateTime.format(formatDate);
        appointmentDateLabel.setText("Appointment date: " + formattedDate);

        appointmentApplianceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        appointmentApplianceLabel.setText("Appliance serviced: " + currentAppointment.getAppliance());

        appointmentTechnicianUsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appointmentTechnicianUsernameLabel.setText("Technician username: " + currentAppointment.getTechnician().getUsername());

        customerPaidLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        String paidOrNot = Boolean.toString(currentAppointment.isPaid());

        if(paidOrNot.equals("true")) {
            paidOrNot = "Paid";
        } else {
            paidOrNot = "Not paid";
        }
        customerPaidLabel.setText("Paid status: " + paidOrNot);

        String feedback = currentAppointment.getFeedback();

        if(feedback.isBlank()) {
            feedback = "Not provided yet";
        }
        customerFeedbackLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerFeedbackLabel.setText("Customer feedback: " + feedback);

        customerBirthdayLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LocalDate birthday = currentCustomer.getBirthday();
        DateTimeFormatter formatBirthDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedBirthDate = birthday.format(formatBirthDate);
        customerBirthdayLabel.setText("Customer DOB: " + formattedBirthDate
        );

        customerPhoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerPhoneLabel.setText("Customer Phone Number: " + currentCustomer.getPhoneNumber());

        customerEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerEmailLabel.setText("Customer Email: " + currentCustomer.getEmail()
        );

        customerAddressLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerAddressLabel.setText("Customer Address: " + currentCustomer.getAddress()
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        appointmentPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appointmentPriceLabel.setText("Total Price: RM 50");

        appointmentTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = dateTime.format(formatTime);
        appointmentTimeLabel.setText("Appointment date: " + formattedTime);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentApplianceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentTechnicianUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(customerUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerPaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointmentTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(customerPhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerBirthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(appointmentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerBirthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointmentTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appointmentApplianceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentTechnicianUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerPaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerFeedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        ServiceCentre.getInstance().setCurrentWindow(new AppointmentMenu());
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportGenerationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportGenerationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportGenerationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportGenerationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportGenerationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentApplianceLabel;
    private javax.swing.JLabel appointmentDateLabel;
    private javax.swing.JLabel appointmentIdLabel;
    private javax.swing.JLabel appointmentPriceLabel;
    private javax.swing.JLabel appointmentTechnicianUsernameLabel;
    private javax.swing.JLabel appointmentTimeLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel customerAddressLabel;
    private javax.swing.JLabel customerBirthdayLabel;
    private javax.swing.JLabel customerEmailLabel;
    private javax.swing.JLabel customerFeedbackLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerPaidLabel;
    private javax.swing.JLabel customerPhoneLabel;
    private javax.swing.JLabel customerUsernameLabel;
    private javax.swing.JLabel formTitleLabel;
    private javax.swing.JLabel systemTitleLabel;
    // End of variables declaration//GEN-END:variables
}