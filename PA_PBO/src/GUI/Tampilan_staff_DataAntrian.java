/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.sun.jdi.connect.spi.Connection;
import model.KoneksiDatabase;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Antrian;
/**
 *
 * @author LENOVO
 */
public class Tampilan_staff_DataAntrian extends javax.swing.JFrame {

    /**
     * Creates new form Tampilan_staff_DataAntrian
     */
    public Tampilan_staff_DataAntrian() {
        initComponents();
        setSize(950, 465);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        loadComboBoxIdPasien();
        loadComboBoxIdPelayanan();
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

        IDantrian = new javax.swing.JTextField();
        waktumasukantrian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelantrian = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        statusantrian = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1072, 416));
        getContentPane().setLayout(null);
        getContentPane().add(IDantrian);
        IDantrian.setBounds(290, 70, 170, 22);

        waktumasukantrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktumasukantrianActionPerformed(evt);
            }
        });
        getContentPane().add(waktumasukantrian);
        waktumasukantrian.setBounds(290, 110, 170, 22);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel2.setText("Waktu Masuk Antrian");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 110, 140, 16);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel3.setText("Status Antrian");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 160, 100, 19);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel1.setText("ID Antrian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 80, 70, 16);

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel4.setText("ID Pelayanan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 80, 90, 19);

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel5.setText("ID Pasien");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 120, 70, 16);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(660, 80, 180, 22);

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

        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(660, 120, 180, 22);

        tabelantrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Antrian", "Waktu Masuk Antrian", "Status Antrian", "ID Pelayanan", "ID Pasien"
            }
        ));
        tabelantrian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelantrianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelantrian);

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

        statusantrian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menunggu", "Dalam Antrian", "Selesai" }));
        getContentPane().add(statusantrian);
        statusantrian.setBounds(290, 150, 170, 22);

        jPanel2.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Data Antrian.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1030, 420);
        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 2, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1030, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelantrianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelantrianMouseClicked
        int selectedRow = tabelantrian.getSelectedRow(); 
        DefaultTableModel tableModel = (DefaultTableModel) tabelantrian.getModel();

        IDantrian.setText(tableModel.getValueAt(selectedRow, 0).toString());
        waktumasukantrian.setText(tableModel.getValueAt(selectedRow, 1).toString());
        statusantrian.setSelectedItem(tableModel.getValueAt(selectedRow, 2).toString());
        jComboBox2.setSelectedItem(tableModel.getValueAt(selectedRow, 3).toString());
        jComboBox3.setSelectedItem(tableModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_tabelantrianMouseClicked

    private void waktumasukantrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktumasukantrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktumasukantrianActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        try (java.sql.Connection conn = KoneksiDatabase.getKoneksi()) {
            String sql = "INSERT INTO antrian (id_antrian, waktu_masuk_antrian, status_antrian, j_pelayanan_id_plyn, data_pasien_id_pasien) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, IDantrian.getText());
            stmt.setString(2, waktumasukantrian.getText());
            stmt.setString(3, (String) statusantrian.getSelectedItem());
            stmt.setString(4, (String) jComboBox2.getSelectedItem());
            stmt.setString(5, (String) jComboBox3.getSelectedItem());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan.");
            loadTableData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try (java.sql.Connection conn = KoneksiDatabase.getKoneksi()) {
            String sql = "UPDATE antrian SET waktu_masuk_antrian = ?, status_antrian = ?, j_pelayanan_id_plyn = ?, data_pasien_id_pasien = ? WHERE id_antrian = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set parameter dari inputan pengguna
            stmt.setString(1, waktumasukantrian.getText());
            stmt.setString(2, (String) statusantrian.getSelectedItem());
            stmt.setString(3, (String) jComboBox2.getSelectedItem());
            stmt.setString(4, (String) jComboBox3.getSelectedItem());
            stmt.setString(5, IDantrian.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
            loadTableData(); // Perbarui data di tabel
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memperbarui data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try (java.sql.Connection conn = KoneksiDatabase.getKoneksi()) {
            String sql = "DELETE FROM antrian WHERE id_antrian = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set parameter dari inputan pengguna
            stmt.setString(1, IDantrian.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            loadTableData(); // Perbarui data di tabel
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        this.dispose();
        new Tampilan_Menu_Staff().setVisible(true);
    }//GEN-LAST:event_keluarActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void loadComboBoxIdPasien() {
        try (java.sql.Connection conn = KoneksiDatabase.getKoneksi()) {
            String sql = "SELECT id_pasien FROM data_pasien";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            jComboBox3.removeAllItems(); // Kosongkan combobox sebelum mengisi ulang
            while (rs.next()) {
                jComboBox3.addItem(rs.getString("id_pasien")); // Tambahkan ID pasien
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data ID Pasien: " + e.getMessage());
        }
    }
    private void loadComboBoxIdPelayanan() {
        try (java.sql.Connection conn = KoneksiDatabase.getKoneksi()) {
            String sql = "SELECT id_plyn FROM j_pelayanan";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            jComboBox2.removeAllItems(); // Kosongkan ComboBox sebelum mengisi ulang
            while (rs.next()) {
                jComboBox2.addItem(rs.getString("id_plyn")); // Tambahkan ID Pelayanan
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data ID Pelayanan: " + e.getMessage());
        }
    }

    private void loadTableData() {
        try {
            List<Antrian> daftarAntrian = Antrian.viewTampilanSemua();

            // Ambil model tabel dari JTable yang digunakan untuk menampilkan data
            DefaultTableModel tableModel = (DefaultTableModel) tabelantrian.getModel();

            // Kosongkan tabel sebelum menambahkan data baru
            tableModel.setRowCount(0);

            // Loop untuk menambahkan data ke dalam tabel
            for (Antrian antrian : daftarAntrian) {
                tableModel.addRow(new Object[]{
                    antrian.getIdAntrian(),
                    antrian.getWaktuMasuk(),
                    antrian.getStatus(),
                    antrian.getIdPelayanan(),
                    antrian.getIdPasien()
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data antrian: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Tampilan_staff_DataAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_staff_DataAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_staff_DataAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_staff_DataAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan_staff_DataAntrian().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDantrian;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> statusantrian;
    private javax.swing.JTable tabelantrian;
    private javax.swing.JButton tambah;
    private javax.swing.JButton update;
    private javax.swing.JTextField waktumasukantrian;
    // End of variables declaration//GEN-END:variables
}
