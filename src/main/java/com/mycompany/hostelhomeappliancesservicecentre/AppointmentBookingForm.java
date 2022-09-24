/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Roshen Nair
 */
public class AppointmentBookingForm extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentBookingForm
     */
    public AppointmentBookingForm() {
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
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        applianceLabel = new javax.swing.JLabel();
        applianceField = new javax.swing.JTextField();
        technicianLabel = new javax.swing.JLabel();
        technicianField = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        timeField = new javax.swing.JComboBox<>();
        yearField = new javax.swing.JComboBox<>();
        yearLabel = new javax.swing.JLabel();
        monthField = new javax.swing.JComboBox<>();
        monthLabel = new javax.swing.JLabel();
        dayField = new javax.swing.JComboBox<>();
        dayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appointment Booking Form");

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        systemTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemTitleLabel.setText("APU Hostel Home Appliances Service Centre");

        formTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        formTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitleLabel.setText("Appointment Booking Form");
        formTitleLabel.setPreferredSize(new java.awt.Dimension(551, 434));

        dateLabel.setText("Date:");

        timeLabel.setText("Time");

        applianceLabel.setText("Appliance");

        applianceField.setName("username"); // NOI18N
        applianceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applianceFieldActionPerformed(evt);
            }
        });

        technicianLabel.setText("Technician");

        ArrayList<Technician> technicians = Technician.getAll();
        String[] technicianUsernames = new String[technicians.size()];
        for (int i = 0; i < technicians.size(); i++) {
            technicianUsernames[i] = technicians.get(i).getUsername();
        }
        technicianField.setModel(new javax.swing.DefaultComboBoxModel<>(technicianUsernames));
        technicianField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicianFieldActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        bookButton.setText("Book");
        bookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        timeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00" }));
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });

        int minYear = 2022;
        int maxYear = 2025;
        String[] years = new String[maxYear - minYear + 1];
        for (int i = 0, j = minYear; j <= maxYear; i++, j++) {
            years[i] = String.valueOf(j);
        }
        yearField.setModel(new javax.swing.DefaultComboBoxModel<>(years));
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        yearLabel.setText("Year");

        monthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthFieldItemStateChanged(evt);
            }
        });

        monthLabel.setText("Month");

        int dayCount = this.getDayCount();
        String[] days = new String[dayCount];
        for (int i = 0; i < dayCount; i++) {
            days[i] = String.valueOf(i + 1);
        }
        dayField.setModel(new javax.swing.DefaultComboBoxModel<>(days));
        dayField.setModel(new javax.swing.DefaultComboBoxModel<>(days));

        dayLabel.setText("Day");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(applianceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(applianceField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(technicianLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(technicianField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(monthLabel)
                    .addComponent(yearLabel)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(timeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applianceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applianceField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(technicianLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(technicianField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applianceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applianceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applianceFieldActionPerformed

    private void technicianFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technicianFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_technicianFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        ServiceCentre.getInstance().setCurrentWindow(new CustomerMenu());
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void displayAppointmentBookingSuccessMessage() {
	JOptionPane.showMessageDialog(
		this,
		"The appointment was successfully booked!",
		"Appointment Booking Success",
		JOptionPane.INFORMATION_MESSAGE
	);
    }
    
    private void displayAppointmentBookingErrorMessage() {
	JOptionPane.showMessageDialog(
		this,
		"This appointment slot has already been taken.",
		"Appointment Booking Error",
		JOptionPane.ERROR_MESSAGE
	);
    }
    
    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
	Customer customer = ServiceCentre.getInstance().getCurrentCustomer();
	int year = Integer.valueOf(this.yearField.getSelectedItem().toString());
        int month = Integer.valueOf(this.monthField.getSelectedItem().toString());
        int day = Integer.valueOf(this.dayField.getSelectedItem().toString());
	int hours = Integer.valueOf(this.timeField.getSelectedItem().toString().substring(0, 2));
	int minutes = 0;
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hours, minutes);
        String appliance = this.applianceField.getText().trim();
	String technicianUsername = this.technicianField.getSelectedItem().toString();
	Technician technician = Technician.get(technicianUsername);
	
	Appointment newAppointment = new Appointment(customer, dateTime, appliance, technician);

        if (Appointment.book(newAppointment)) {
            this.displayAppointmentBookingSuccessMessage();
            ServiceCentre.getInstance().setCurrentWindow(new CustomerMenu());
        } else {
            this.displayAppointmentBookingErrorMessage();
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFieldActionPerformed

    private int getDayCount() {
	Object selectedMonth = this.monthField.getSelectedItem();
	if (selectedMonth == null) {
	    selectedMonth = 1;
	}
	
	int month = Integer.valueOf(selectedMonth.toString());
		
	int dayCount;
	
	switch (month) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
		dayCount = 31;
		break;
	    case 2:
		dayCount = 28;
		break;
	    default:
		dayCount = 30;
	}
	
	return dayCount;
    }
    
    private void updateDayFieldDropdownValues() {
	int dayCount = this.getDayCount();
	String[] days = new String[dayCount];
	for (int i = 0; i < dayCount; i++) {
	    days[i] = String.valueOf(i + 1);
	}
	dayField.setModel(new javax.swing.DefaultComboBoxModel<>(days));
    }
    
    private void monthFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthFieldItemStateChanged
        this.updateDayFieldDropdownValues();
    }//GEN-LAST:event_monthFieldItemStateChanged

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

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
	    java.util.logging.Logger.getLogger(AppointmentBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(AppointmentBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(AppointmentBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(AppointmentBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new AppointmentBookingForm().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField applianceField;
    private javax.swing.JLabel applianceLabel;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dayField;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JLabel formTitleLabel;
    private javax.swing.JComboBox<String> monthField;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JLabel systemTitleLabel;
    private javax.swing.JComboBox<String> technicianField;
    private javax.swing.JLabel technicianLabel;
    private javax.swing.JComboBox<String> timeField;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JComboBox<String> yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
