/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rundown_v1;

import com.illposed.osc.OSCListener;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPortIn;
import java.net.SocketException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DeeptoTV
 */
public class NextLive_view extends javax.swing.JFrame {

    /**
     * Creates new form NextLive_view
     */
    public NextLive_view() throws java.net.SocketException{
        initComponents();
    }

    
    
    Connection conn_primary = null;
    Connection conn_secondary = null;
    CallableStatement stored_pro = null;
    Statement statement1 = null; 
    ResultSet rs = null;
    float nextLiveTime_primary = 0;
    float nextLiveTime_secondary = 0;
    float timer_primary1 = 0;
    float progressbar_total_time_primary = 0;
    float progressbar_total_time_secondary = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nextLive_primary = new javax.swing.JLabel();
        timer_primary = new javax.swing.JLabel();
        progressBar_primary = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nextLive_secondary = new javax.swing.JLabel();
        timer_secondary = new javax.swing.JLabel();
        progressBar_secondary = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Next Live");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Next Live Primary");

        nextLive_primary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nextLive_primary.setText("Program Name ");

        timer_primary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timer_primary.setText("00:00:00");

        progressBar_primary.setForeground(new java.awt.Color(255, 0, 51));
        progressBar_primary.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(timer_primary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(progressBar_primary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nextLive_primary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nextLive_primary, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timer_primary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressBar_primary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Next Live Secondary");

        nextLive_secondary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nextLive_secondary.setText("Program Name ");

        timer_secondary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timer_secondary.setText("00:00:00");

        progressBar_secondary.setForeground(new java.awt.Color(255, 0, 51));
        progressBar_secondary.setStringPainted(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextLive_secondary, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(timer_secondary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progressBar_secondary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nextLive_secondary, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timer_secondary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressBar_secondary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getPrimaryData(float nextLiveTime,float timer)
    {
        nextLiveTime_primary = nextLiveTime;
        timer_primary1 = timer;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                // TODO add your handling code here:
         /*       
        conn_primary = ConnectDB_primary.connectDb();
        conn_secondary = ConnectDB_secondary.connectDb();        
        //=====================================================================
        nextLiveTime_primary = 0;
        nextLiveTime_secondary = 0;
        
        
        try {
            // TODO add your handling code here:
            statement1 = conn_primary.createStatement();
            rs = statement1.executeQuery("SELECT timecode FROM playlist WHERE starttime < (SELECT starttime FROM playlist WHERE label LIKE  'LIVE_%' and state = 0 LIMIT 1 ) and state in(0,1)");

            while(rs.next())
            {
                String timecode = rs.getString("timecode");
                String[] words=timecode.split(":");//splits the string based on string
                //using java foreach loop to print elements of string array
                float hrToSec = Float.parseFloat(words[0])*60*60;
                float minToSec = Float.parseFloat(words[1])*60;
                float Sec = Float.parseFloat(words[2]);
                float frameToSec = Float.parseFloat(words[3])/25;
                float TotalSec = hrToSec + minToSec + Sec + frameToSec;
                nextLiveTime_primary = nextLiveTime_primary + TotalSec;

            }
        }catch(Exception e)
        {
        }finally{
            try {
                conn_primary.close();
            } catch (SQLException ex) {
                Logger.getLogger(RundownView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        progressbar_total_time_primary = nextLiveTime_primary;
        //================secondary=======
        try {
            // TODO add your handling code here:
            statement1 = conn_secondary.createStatement();
            rs = statement1.executeQuery("SELECT timecode FROM playlist WHERE starttime < (SELECT starttime FROM playlist WHERE label LIKE  'LIVE_%' and state = 0 LIMIT 1 ) and state in(0,1)");

            while(rs.next())
            {
                String timecode = rs.getString("timecode");
                String[] words=timecode.split(":");//splits the string based on string
                //using java foreach loop to print elements of string array
                float hrToSec = Float.parseFloat(words[0])*60*60;
                float minToSec = Float.parseFloat(words[1])*60;
                float Sec = Float.parseFloat(words[2]);
                float frameToSec = Float.parseFloat(words[3])/25;
                float TotalSec = hrToSec + minToSec + Sec + frameToSec;
                nextLiveTime_secondary = nextLiveTime_secondary + TotalSec;

            }
        }catch(Exception e)
        {
        }finally{
            try {
                conn_secondary.close();
            } catch (SQLException ex) {
                Logger.getLogger(RundownView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        progressbar_total_time_secondary = nextLiveTime_secondary;
        
        OSCListener getDuration_primary = new OSCListener() {
            float t = 0;
            
            public void acceptMessage(java.util.Date time, OSCMessage message) {
                String msg ="";
                String msg2 ="";
                float timer = 0, duration=0;
                int progress = 0;
                float seconds = 0;
              
                Object[] values = message.getArguments();

                msg = values[0].toString();
                
                timer = Float.parseFloat(msg);
                //nextLiveTime = nextLiveTime +t- timer;
               

                //====================seconds to HH:mm:ss convert===============//

                //=============================================================
               nextLiveTime_primary = nextLiveTime_primary +  t - timer;
                nextLive_primary.setText(String.valueOf(nextLiveTime_primary));
                //progress = (int) (100-((nextLiveTime_primary*100)/progressbar_total_time_primary));
                //progressBar_primary.setValue(progress);
                t = timer;

            }
        };

        OSCListener getDuration_secondary = new OSCListener() {
            public void acceptMessage(java.util.Date time, OSCMessage message) {
                String msg ="";
                String msg2 ="";
                float timer = 0, duration=0;
                int progress = 0;
                float seconds = 0;

                Object[] values = message.getArguments();

                msg = values[0].toString();
                
                timer = Float.parseFloat(msg);
                //nextLiveTime = nextLiveTime - timer;
               

                //====================seconds to HH:mm:ss convert===============//

                //=============================================================

                nextLive_secondary.setText(String.valueOf(nextLiveTime_secondary - timer));

            }
        };
        
        receiver_primary.addListener("/channel/1/stage/layer/10/file/time", getDuration_primary);
        receiver_secondary.addListener("/channel/1/stage/layer/10/file/time", getDuration_secondary);
        receiver_primary.startListening();
        receiver_secondary.startListening();
                */
         while(true)
         {
             nextLive_primary.setText(String.valueOf(timer_primary1));
         }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(NextLive_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NextLive_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NextLive_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NextLive_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NextLive_view().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(NextLive_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nextLive_primary;
    private javax.swing.JLabel nextLive_secondary;
    private javax.swing.JProgressBar progressBar_primary;
    private javax.swing.JProgressBar progressBar_secondary;
    private javax.swing.JLabel timer_primary;
    private javax.swing.JLabel timer_secondary;
    // End of variables declaration//GEN-END:variables
}
