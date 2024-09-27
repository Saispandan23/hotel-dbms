import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import project.*;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;


public class Booking extends javax.swing.JFrame {
    private String room_ID;
    private String booking_ID;
    private int guest_ID;
    private String date;
    public static String Name;
    public Booking(String room_ID) {
        initComponents();
        this.room_ID = room_ID;
        this.booking_ID = generateBookingID();
        this.guest_ID=getguestid();
        jTextField3.setText(room_ID);
        jTextField2.setText(String.valueOf(guest_ID));
        jTextField1.setText(booking_ID);
        LocalDate currentDate = LocalDate.now();
        // Format the date as required (day-month-year)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjusted format
        String formattedDate = currentDate.format(formatter);
        // Set the formatted date to the text field
        jTextField4.setText(formattedDate);
    }
    private int getguestid()
    {
        try (ResultSet rs = Select.getData("Select GUEST_ID from guest where Name='" + Name + "';")) 
        {if (rs.next()) {
            return rs.getInt("GUEST_ID");
        }
        }
        catch (Exception e)
        {
        // Handle exception
        }
    return 0;
    }
    private String generateBookingID() {
        // Generate a unique room ID using UUID
        Random random = new Random();
        int bookingIdNumber = 10000 + random.nextInt(90000); // Generate a n-digit random number
        return String.valueOf(bookingIdNumber);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setText("Booking");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 235, 250, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 235, 251, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Booking ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 201, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Guest ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 201, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Room ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 201, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 235, 253, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 251, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("Check_In Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 302, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Check_Out Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 302, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 399, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 399, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 28, -1, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 270, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel8.setText("HOTEL DATABASE MANAGEMENT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Booking_id=jTextField1.getText();
        String Guest_id=jTextField2.getText();
        String Room_id=jTextField3.getText();
        String Check_in=jTextField4.getText();
        Date selectedDate = jDateChooser1.getDate();
        // Format the selected date as a text string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the format as needed
        String Check_out = dateFormat.format(selectedDate);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjusted format
        String formatted1 = currentDate.format(formatter);
        LocalDate endDate =jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String formatted2= endDate.format(formatter);
        // Calculate the difference in days
        long daysDifference = ChronoUnit.DAYS.between(LocalDate.parse(formatted1, formatter), LocalDate.parse(formatted2, formatter));
        if(Booking_id.equals("")||Guest_id.equals("")||Room_id.equals("")||Check_in.equals("")||Check_out.equals(""))
                JOptionPane.showMessageDialog(null, "Oops! \n It seems like some details are missing \n Please fill in all required fields before proceeding");
        else
        {
            try{
                Date checkInDate = dateFormat.parse(Check_in);
                Date checkOutDate = dateFormat.parse(Check_out);
                if(checkOutDate != null && checkInDate != null && checkOutDate.after(checkInDate)){
                    String Query;
                    Query="INSERT INTO BOOKING(BOOKING_ID,GUEST_ID,ROOM_ID,CHECKIN_DATE,CHECKOUT_DATE) VALUES ('"+Booking_id+"','"+Guest_id+"','"+Room_id+"','"+Check_in+"','"+Check_out+"');";
                    InsertDeleteUpdate.setData(Query, "Booking Successfully");
                    setVisible(false);
                    Payment.bookingid=Booking_id;
                    Payment.roomid=Room_id;
                    Payment.date=daysDifference;
                    new Payment().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Select a valid checkout date");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Room_id1=jTextField3.getText();
        Connection con=null;
        Statement st=null; 
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("DELETE FROM ROOM WHERE ROOM_ID='"+Room_id1+"'");
            JOptionPane.showMessageDialog(null, "Please ensure all details are filled in correctly from the beginning to proceed");
            setVisible(false);
            new Hotel().setVisible(true);
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            // If user selects "Yes" option
            String Room_id1=jTextField3.getText();
            Connection con=null;
            Statement st=null; 
            try
            {
                con=ConnectionProvider.getCon();
                st=con.createStatement();
                st.executeUpdate("DELETE FROM ROOM WHERE ROOM_ID='"+Room_id1+"'");
                setVisible(false); // Exit the program
            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        } 
        else {
            // If user selects "No" option, do nothing
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables


}
