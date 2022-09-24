/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Roshen Nair
 */
public class CustomerUpdateForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerModificationForm
     */
    public CustomerUpdateForm() {
	initComponents();
	Customer currentCustomer = ServiceCentre.getInstance().getCurrentCustomer();
	LocalDate birthday = currentCustomer.getBirthday();
	this.usernameField.setText(currentCustomer.getUsername());
	this.nameField.setText(currentCustomer.getName());
	this.dayField.getModel().setSelectedItem(birthday.getDayOfMonth());
	this.monthField.getModel().setSelectedItem(birthday.getMonthValue());
	this.yearField.getModel().setSelectedItem(birthday.getYear());
	this.phoneNumberField.setText(currentCustomer.getPhoneNumber().substring(3));
	this.emailField.setText(currentCustomer.getEmail());
	this.addressField.setText(currentCustomer.getAddress());
	this.bankCardField.setText(currentCustomer.getBankCard());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monthField = new javax.swing.JComboBox<>();
        emailField = new javax.swing.JTextField();
        yearField = new javax.swing.JComboBox<>();
        systemTitleLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        formTitleLabel = new javax.swing.JLabel();
        bankCardField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        bankCardLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        monthLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextArea();
        phoneNumberLabel = new javax.swing.JLabel();
        dayField = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        countryCodeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Modification Form");

        monthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthFieldItemStateChanged(evt);
            }
        });

        emailField.setName("username"); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        int minYear = 1900;
        int maxYear = 2022;
        String[] years = new String[maxYear - minYear + 1];
        for (int i = 0, j = minYear; j <= maxYear; i++, j++) {
            years[i] = String.valueOf(j);
        }
        yearField.setModel(new javax.swing.DefaultComboBoxModel<>(years));

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        systemTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemTitleLabel.setText("APU Hostel Home Appliances Service Centre");

        addressLabel.setText("House address");

        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        formTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        formTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitleLabel.setText("Customer Update Form");
        formTitleLabel.setPreferredSize(new java.awt.Dimension(551, 434));

        bankCardField.setName("username"); // NOI18N
        bankCardField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankCardFieldActionPerformed(evt);
            }
        });

        usernameLabel.setText("Username");

        bankCardLabel.setText("Bank card number");

        usernameField.setEditable(false);
        usernameField.setToolTipText("Cannot be edited");
        usernameField.setName("username"); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        dayLabel.setText("Day");

        nameField.setName("username"); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        monthLabel.setText("Month");

        birthdayLabel.setText("Birthday:");

        yearLabel.setText("Year");

        phoneNumberField.setName("username"); // NOI18N
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        addressField.setColumns(20);
        addressField.setRows(5);

        phoneNumberLabel.setText("Phone number");

        int dayCount = this.getDayCount();
        String[] days = new String[dayCount];
        for (int i = 0; i < dayCount; i++) {
            days[i] = String.valueOf(i + 1);
        }
        dayField.setModel(new javax.swing.DefaultComboBoxModel<>(days));

        emailLabel.setText("Email address");

        countryCodeLabel.setText("+60");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(systemTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(birthdayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(bankCardField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bankCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(countryCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(phoneNumberField))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(birthdayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(monthLabel)
                    .addComponent(yearLabel)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryCodeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bankCardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankCardField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        ServiceCentre.getInstance().setCurrentWindow(new CustomerMenu());
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void bankCardFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankCardFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankCardFieldActionPerformed

    private int getDayCount() {
	Object selectedMonth = this.monthField.getSelectedItem();
//	if (selectedMonth == null) {
//	    selectedMonth = 1;
//	}
	
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
    
    private void displayCustomerUpdateSuccessMessage() {
	JOptionPane.showMessageDialog(
		this,
		"The customer was successfully updated!",
		"Customer Update Success",
		JOptionPane.INFORMATION_MESSAGE
	);
    }
    
    private void displayCustomerUpdateErrorMessage(String message) {
	JOptionPane.showMessageDialog(
		this,
		message,
		"Customer Update Error",
		JOptionPane.ERROR_MESSAGE
	);
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String username = this.usernameField.getText().trim();
	String name = this.nameField.getText().trim();
	int year = Integer.valueOf(this.yearField.getSelectedItem().toString());
	int month = Integer.valueOf(this.monthField.getSelectedItem().toString());
	int day = Integer.valueOf(this.dayField.getSelectedItem().toString());
	LocalDate birthday = LocalDate.of(year, month, day);
	String phoneNumber = "+60" + this.phoneNumberField.getText().trim();
	String email = this.emailField.getText().trim();
	String address = this.addressField.getText().trim();
	String bankCard = this.bankCardField.getText().trim();

	if (!Customer.isValidPhoneNumber(phoneNumber)) {
	    this.displayCustomerUpdateErrorMessage("Phone numbers can only contain 8-10 digits after the +60 country code.");
	    return;
	} else if (!Customer.isValidEmail(email)) {
	    this.displayCustomerUpdateErrorMessage("Email addresses should be in the format username@domain, and can only contain letters, digits, underscores (_), dots (.), dashes (-), and 1 alias (@).");
	    return;
	} else if (!Customer.isValidBankCard(bankCard)) {
	    this.displayCustomerUpdateErrorMessage("Bank card numbers can only contain 8-19 digits.");
	    return;
	}
	
	Customer updatedCustomer = new Customer(username, name, birthday, phoneNumber, email, address, bankCard);
	
	if (Customer.update(updatedCustomer)) {
	    this.displayCustomerUpdateSuccessMessage();
	    ServiceCentre.getInstance().setCurrentWindow(new CustomerMenu());
	} else {
	    this.displayCustomerUpdateErrorMessage("Failed to update this customer's details.");
	}
    }//GEN-LAST:event_updateButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void monthFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthFieldItemStateChanged
        this.updateDayFieldDropdownValues();
    }//GEN-LAST:event_monthFieldItemStateChanged

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
	    java.util.logging.Logger.getLogger(CustomerUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(CustomerUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(CustomerUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(CustomerUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new CustomerUpdateForm().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField bankCardField;
    private javax.swing.JLabel bankCardLabel;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel countryCodeLabel;
    private javax.swing.JComboBox<String> dayField;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel formTitleLabel;
    private javax.swing.JComboBox<String> monthField;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel systemTitleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JComboBox<String> yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}