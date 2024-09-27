
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;
import project.ConnectionProvider;
import project.InsertDeleteUpdate;
import project.*;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class Payment extends javax.swing.JFrame {
    
    public static long date;
    public static String bookingid;
    public static String roomid;
    public static String Price1;
    public static String paymentid;
    private String Amount1;
    public Payment() {
        initComponents();
        this.date=date;
        this.Price1=Price1;
        this.paymentid=generatePaymentID();
        this.bookingid=bookingid;
        this.Amount1=amount(date,Price1);
        jTextField1.setText(paymentid);
        jTextField2.setText(bookingid);
        LocalDate currentDate = LocalDate.now();
        // Format the date as required (day-month-year)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjusted format
        String formattedDate = currentDate.format(formatter);
        // Set the formatted date to the text field
        jTextField4.setText(formattedDate);
        jTextField5.setText(Amount1);
        
    }
    private String amount(long date,String Price1) {
        // Parse the date as long
    long longDate = date;
    // Parse the price as double (assuming Price represents a monetary value)
    double doublePrice = Double.parseDouble(Price1);
    // Multiply the numerical values
    double result = longDate * doublePrice;
    // Convert the result to a string
    Amount1 = Double.toString(result);
    return Amount1;
    }
    private String generatePaymentID() {
        // Generate a unique room ID using UUID
        Random random = new Random();
        int paymentIdNumber = 200000 + random.nextInt(900000); // Generate a n-digit random number
        return String.valueOf(paymentIdNumber);
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
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setText("Payment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 251, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Payment ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 201, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Booking ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 201, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Payment Method");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 201, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 336, 251, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("Payment Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 302, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Total Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 302, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 336, 251, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Pay and Confirm Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("Cancel Booking");
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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPI", "CASH" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 250, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setText("HOTEL DATABASE MANAGEMENT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Payment_id=jTextField1.getText();
        String Booking_id=jTextField2.getText();
        String Payment_method=(String) jComboBox2.getSelectedItem();
        String Payment_date=jTextField4.getText();
        String Amount=jTextField5.getText();
        if(Payment_id.equals("")||Booking_id.equals("")||Payment_method.equals("")||Payment_date.equals("")||Amount.equals(""))
                JOptionPane.showMessageDialog(null, "Oops! \n It seems like some details are missing \n Please fill in all required fields before proceeding");
        else{
            String Query;
            Query="INSERT INTO PAYMENT(PAYMENT_ID,BOOKING_ID,PAYMENT_METHOD,PAYMENT_DATE,AMOUNT) VALUES ('"+Payment_id+"','"+Booking_id+"','"+Payment_method+"','"+Payment_date+"','"+Amount+"');";
            InsertDeleteUpdate.setData(Query, "Payment Successfully");
            setVisible(false);
            try {
                Connection con=null;
                String filePath = "C:\\Users\\Manoj B\\OneDrive\\Documents\\NetBeansProjects\\HotelDatabase\\output.pdf";
                con=ConnectionProvider.getCon();
                // Fetch data from multiple tables using SQL query
                String sql = "SELECT G.GUEST_ID,G.NAME,G.EMAIL,G.PHONENUMBER,G.ADDRESS,H.HOTEL_ID,H.HOTEL_NAME,H.EMAIL,H.STAR_RATING,"
                    + "H.PHONE_NUMBER,H.ADDRESS,R.ROOM_ID,R.ROOM_TYPE,R.BED,R.PRICE,B.BOOKING_ID,B.CHECKIN_DATE,"
                    + "B.CHECKOUT_DATE,P.PAYMENT_ID,P.PAYMENT_METHOD,P.PAYMENT_DATE,P.AMOUNT FROM GUEST G,HOTELS H,ROOM R,BOOKING B,PAYMENT P "
                    + "WHERE G.GUEST_ID=B.GUEST_ID AND H.HOTEL_ID=R.HOTEL_ID AND B.BOOKING_ID=P.BOOKING_ID AND R.ROOM_ID=B.ROOM_ID AND"
                    + " PAYMENT_ID='"+Payment_id+"'";
                // You need to replace table1, table2 with your table names
                PreparedStatement statement = con.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
                // Create PDF document
                Document document = new Document();
                try {
                    PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));
                }
                catch (FileNotFoundException ex) {
                    Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
                }
                document.open();
                // Add data to PDF document
                while (resultSet.next()) {
                    // Assuming you have some columns like 'column1', 'column2' in your tables
                    String data =
                        "***************************************************BILL******************************************************"+ "\n"+
                        "***********************************************Guest Details************************************************"+ "\n"+
                        "ID:  "+resultSet.getString("GUEST_ID") + "\n"+
                        "Name:  " + resultSet.getString("NAME")+ "\n"+
                        "Email:  " + resultSet.getString("EMAIL")+ "\n"+
                        "Phone Number:  " + resultSet.getString("PHONENUMBER")+ "\n"+
                        "Address:  " + resultSet.getString("ADDRESS")+ "\n"+
                        "***********************************************Hotel Details*************************************************"+ "\n"+
                        "ID:  " + resultSet.getString("HOTEL_ID")+ "\n"+
                        "Name:  "+ resultSet.getString("HOTEL_NAME")+ "\n"+
                        "Star Rating:  " + resultSet.getString("STAR_RATING")+ "\n"+
                        "Email:  " + resultSet.getString("H.EMAIL")+ "\n"+
                        "Phone Number:  " + resultSet.getString("Phone_Number")+ "\n"+
                        "Address:  " + resultSet.getString("Address")+ "\n"+
                        "**********************************************Room Details*************************************************"+ "\n"+
                        "ID:  " + resultSet.getString("ROOM_ID")+ "\n"+
                        "Room Type:  " + resultSet.getString("ROOM_TYPE")+"\n"+
                        "Bed Type:  " + resultSet.getString("BED")+  "\n"+
                        "Price per Day:  " + resultSet.getString("PRICE")+ "\n"+
                        "**********************************************Booking Details************************************************"+ "\n"+
                        "ID:  " + resultSet.getString("BOOKING_ID")+"\n"+
                        "Checkin Date:  " + resultSet.getString("CHECKIN_DATE")+ "\n"+
                        "Checkout Date:  " + resultSet.getString("CHECKOUT_DATE")+"\n"+
                        "No of days booked:  " +date+"\n"+
                        "*********************************************Payment Details************************************************"+"\n"+
                        "Payment ID:  " + resultSet.getString("PAYMENT_ID")+"\n"+
                        "Payment Method:  " + resultSet.getString("PAYMENT_METHOD")+"\n"+
                        "Payment Date:  " + resultSet.getString("PAYMENT_DATE")+"\n"+
                        "Total Amount:  " + resultSet.getString("AMOUNT")+"\n"+
                        "*************************************THANK YOU VISIT AGAIN******************************************";
                    document.add(new Paragraph(data));
                }
                // Close document and database connection
                document.close();
                con.close();
                try {
                    // Open the PDF file using the default application associated with PDFs
                    File pdfFile = new File(filePath);
                    JOptionPane.showMessageDialog(null, "Bill generated successfully\n Click OK to open the Bill");
                    Desktop.getDesktop().open(pdfFile);
                } 
                catch (IOException e) {
                     System.out.println("Error opening PDF file: " + e.getMessage());
                }
            } 
            catch (SQLException | DocumentException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            // If user selects "Yes" option
            String Booking_id1 = jTextField2.getText();
            String roomid1 = roomid;
            Connection con=null;
            Statement st=null; 
            try
            {
                con=ConnectionProvider.getCon();
                st=con.createStatement();
                st.executeUpdate("DELETE FROM BOOKING WHERE BOOKING_ID='" + Booking_id1 + "'");
                st.executeUpdate("DELETE FROM ROOM WHERE ROOM_ID='"+roomid1+"'");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Booking_id1 = jTextField2.getText();
    String roomid1 = roomid;
    Connection con = null;
    Statement st = null;
    try {
        con = ConnectionProvider.getCon();
        st = con.createStatement();
        
        // Execute the first DELETE statement
        st.executeUpdate("DELETE FROM BOOKING WHERE BOOKING_ID='" + Booking_id1 + "'");
        // Execute the second DELETE statement
        st.executeUpdate("DELETE FROM ROOM WHERE ROOM_ID='" + roomid1 + "'");
        
        JOptionPane.showMessageDialog(null, "Please ensure all details are filled in correctly from the beginning to proceed");
        setVisible(false);
        new Hotel().setVisible(true);
    } 
    catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    finally {
        // Close the Statement and Connection objects
        try {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
