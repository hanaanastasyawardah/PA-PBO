/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.JPelayanan;
/**
 *
 * @author LENOVO
 */
public class Tampilan_Staff_MenuPelayanan extends javax.swing.JFrame {

    /**
     * Creates new form Tampilan_staff_DataAntrian
     */
    public Tampilan_Staff_MenuPelayanan() {
        initComponents();
        setSize(950, 465);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpelayanan = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        waktu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JenisPelayanan = new javax.swing.JTextField();
        IDPelayanan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1072, 416));
        getContentPane().setLayout(null);

        update.setBackground(new java.awt.Color(153, 204, 255));
        update.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(660, 170, 90, 40);

        delete.setBackground(new java.awt.Color(153, 204, 255));
        delete.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(770, 170, 90, 40);

        keluar.setBackground(new java.awt.Color(153, 204, 255));
        keluar.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(880, 170, 90, 40);

        tabelpelayanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pelayanan", "Jenis Pelayanan", "Waktu Pelayanan", "Tanggal Pelayanan", "Status Pelayanan"
            }
        ));
        tabelpelayanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpelayananMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelpelayanan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 220, 1030, 205);

        tambah.setBackground(new java.awt.Color(153, 204, 255));
        tambah.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("ADD");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah);
        tambah.setBounds(550, 170, 90, 40);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel3.setText("Waktu Pelayanan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 160, 160, 19);
        getContentPane().add(waktu);
        waktu.setBounds(230, 160, 170, 22);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel2.setText("Jenis Pelayanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 140, 20);

        JenisPelayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisPelayananActionPerformed(evt);
            }
        });
        getContentPane().add(JenisPelayanan);
        JenisPelayanan.setBounds(230, 120, 170, 22);
        getContentPane().add(IDPelayanan);
        IDPelayanan.setBounds(230, 80, 170, 22);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel1.setText("ID Pelayanan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 80, 130, 20);

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel7.setText("Tanggal Pelayanan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 80, 140, 19);
        getContentPane().add(tanggal);
        tanggal.setBounds(720, 80, 170, 22);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Penuh", "Libur", " " }));
        getContentPane().add(status);
        status.setBounds(720, 120, 170, 22);

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel4.setText("Status Pelayanan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 120, 110, 19);

        jPanel2.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Pelayanan.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1030, 420);
        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 2, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1030, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadTableData() {
        try {
            // Ambil data dari database menggunakan method viewTampilanSemua()
            List<JPelayanan> daftarPelayanan = JPelayanan.viewTampilanSemua();

            // Ambil model tabel dari JTable
            DefaultTableModel tableModel = (DefaultTableModel) tabelpelayanan.getModel();

            // Kosongkan isi tabel sebelum menambahkan data baru
            tableModel.setRowCount(0);

            // Tambahkan data pelayanan ke tabel
            for (JPelayanan pelayanan : daftarPelayanan) {
                tableModel.addRow(new Object[]{
                    pelayanan.getId_plyn(),          // ID Pelayanan
                    pelayanan.getJenis_pelayanan(),  // Jenis Pelayanan
                    pelayanan.getWaktu_pelayanan(),  // Waktu Pelayanan
                    pelayanan.getTanggal_pelayanan(),// Tanggal Pelayanan
                    pelayanan.getStatus_pelayanan()  // Status Pelayanan
                });
            }
        } catch (SQLException e) {
            // Tampilkan pesan error jika terjadi masalah saat memuat data
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    private void tabelpelayananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpelayananMouseClicked
        int selectedRow = tabelpelayanan.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabelpelayanan.getModel();

        IDPelayanan.setText(model.getValueAt(selectedRow, 0).toString());
        JenisPelayanan.setText(model.getValueAt(selectedRow, 1).toString());
        waktu.setText(model.getValueAt(selectedRow, 2).toString());
        tanggal.setText(model.getValueAt(selectedRow, 3).toString());
        status.setSelectedItem(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_tabelpelayananMouseClicked

    private void JenisPelayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisPelayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JenisPelayananActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        try {
            JPelayanan pelayanan = new JPelayanan(
                IDPelayanan.getText(),
                JenisPelayanan.getText(),
                waktu.getText(),
                tanggal.getText(),
                status.getSelectedItem().toString()
            );
            pelayanan.simpanPelayanan();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
            loadTableData(); // Memuat ulang data ke tabel
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            JPelayanan pelayanan = new JPelayanan(
                IDPelayanan.getText(),
                JenisPelayanan.getText(),
                waktu.getText(),
                tanggal.getText(),
                status.getSelectedItem().toString()
            );
            pelayanan.perbaruiStatusPelayanan();
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
            loadTableData(); // Memuat ulang data ke tabel
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memperbarui data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                JPelayanan pelayanan = new JPelayanan(IDPelayanan.getText(), null, null, null, null);
                pelayanan.hapusPelayanan();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                loadTableData(); // Memuat ulang data ke tabel
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        this.dispose();
        new Tampilan_Menu_Staff().setVisible(true);
    }//GEN-LAST:event_keluarActionPerformed

        
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
            java.util.logging.Logger.getLogger(Tampilan_Staff_MenuPelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Staff_MenuPelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Staff_MenuPelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Staff_MenuPelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan_Staff_MenuPelayanan().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDPelayanan;
    private javax.swing.JTextField JenisPelayanan;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelpelayanan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tanggal;
    private javax.swing.JButton update;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
