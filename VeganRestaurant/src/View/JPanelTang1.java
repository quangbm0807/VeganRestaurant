/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.DatBanDao;
import Model.Ban;
import Utils.Auth;
import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JPanelTang1 extends javax.swing.JPanel {

    DatBanDao dBDao = new DatBanDao();

    /**
     * Creates new form JPanelTang1
     */
    public JPanelTang1() {
        initComponents();
        TrangThaiBan();
        capNhatTrangThaiBan();

    }

    public void capNhatTrangThaiBan() {
        class TrangThaiBan extends Thread {

            @Override
            public void run() {
                while (true) {
                    TrangThaiBan();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

        // Tạo và khởi chạy một luồng TrangThaiBan
        TrangThaiBan thread = new TrangThaiBan();
        thread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnban7 = new javax.swing.JButton();
        btnban8 = new javax.swing.JButton();
        btnban9 = new javax.swing.JButton();
        btnban10 = new javax.swing.JButton();
        btnban11 = new javax.swing.JButton();
        btnban12 = new javax.swing.JButton();
        lbT1B01 = new javax.swing.JLabel();
        lbT1B02 = new javax.swing.JLabel();
        lbT1B03 = new javax.swing.JLabel();
        lbT1B04 = new javax.swing.JLabel();
        btnban2 = new javax.swing.JButton();
        lbT1B05 = new javax.swing.JLabel();
        btnban6 = new javax.swing.JButton();
        lbT1B06 = new javax.swing.JLabel();
        btnban4 = new javax.swing.JButton();
        lbT1B12 = new javax.swing.JLabel();
        btnban5 = new javax.swing.JButton();
        lbT1B07 = new javax.swing.JLabel();
        btnban1 = new javax.swing.JButton();
        lbT1B08 = new javax.swing.JLabel();
        lbT1B09 = new javax.swing.JLabel();
        lbT1B10 = new javax.swing.JLabel();
        lbT1B11 = new javax.swing.JLabel();
        btnban3 = new javax.swing.JButton();

        btnban7.setBackground(new java.awt.Color(51, 255, 0));
        btnban7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban7ActionPerformed(evt);
            }
        });

        btnban8.setBackground(new java.awt.Color(255, 0, 51));
        btnban8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban8ActionPerformed(evt);
            }
        });

        btnban9.setBackground(new java.awt.Color(255, 204, 204));
        btnban9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban9ActionPerformed(evt);
            }
        });

        btnban10.setBackground(new java.awt.Color(51, 51, 51));
        btnban10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban10ActionPerformed(evt);
            }
        });

        btnban11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban11ActionPerformed(evt);
            }
        });

        btnban12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban12ActionPerformed(evt);
            }
        });

        lbT1B01.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B01.setText("T1B01");

        lbT1B02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B02.setText("T1B02");

        lbT1B03.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B03.setText("T1B03");

        lbT1B04.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B04.setText("T1B04");

        btnban2.setBackground(new java.awt.Color(255, 0, 51));
        btnban2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban2ActionPerformed(evt);
            }
        });

        lbT1B05.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B05.setText("T1B05");

        btnban6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban6ActionPerformed(evt);
            }
        });

        lbT1B06.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B06.setText("T1B06");

        btnban4.setBackground(new java.awt.Color(51, 51, 51));
        btnban4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban4ActionPerformed(evt);
            }
        });

        lbT1B12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B12.setText("T1B12");

        btnban5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban5ActionPerformed(evt);
            }
        });

        lbT1B07.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B07.setText("T1B07");

        btnban1.setBackground(new java.awt.Color(51, 255, 0));
        btnban1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban1ActionPerformed(evt);
            }
        });

        lbT1B08.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B08.setText("T1B08");

        lbT1B09.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B09.setText("T1B09");

        lbT1B10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B10.setText("T1B10");

        lbT1B11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbT1B11.setText("T1B11");

        btnban3.setBackground(new java.awt.Color(255, 204, 204));
        btnban3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ban.png"))); // NOI18N
        btnban3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnban3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnban1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban2)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban3)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban4)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban5)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnban7)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban8)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban9)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban10)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban11)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnban12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lbT1B01, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lbT1B02, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(lbT1B03, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(lbT1B04, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lbT1B05, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lbT1B06, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbT1B07, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lbT1B08, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lbT1B09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(lbT1B10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lbT1B11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lbT1B12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnban6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbT1B01)
                    .addComponent(lbT1B02)
                    .addComponent(lbT1B03)
                    .addComponent(lbT1B04)
                    .addComponent(lbT1B05)
                    .addComponent(lbT1B06))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnban12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbT1B07)
                    .addComponent(lbT1B08)
                    .addComponent(lbT1B09)
                    .addComponent(lbT1B10)
                    .addComponent(lbT1B11)
                    .addComponent(lbT1B12))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnban9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban9ActionPerformed
        kiemTraTrangThaiBan(9);
    }//GEN-LAST:event_btnban9ActionPerformed

    private void btnban3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban3ActionPerformed
        kiemTraTrangThaiBan(3);

    }//GEN-LAST:event_btnban3ActionPerformed

    private void btnban6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban6ActionPerformed
        kiemTraTrangThaiBan(6);
    }//GEN-LAST:event_btnban6ActionPerformed

    private void btnban8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban8ActionPerformed
        kiemTraTrangThaiBan(8);
    }//GEN-LAST:event_btnban8ActionPerformed

    private void btnban7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban7ActionPerformed
        kiemTraTrangThaiBan(7);
    }//GEN-LAST:event_btnban7ActionPerformed

    private void btnban2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban2ActionPerformed
        kiemTraTrangThaiBan(2);
    }//GEN-LAST:event_btnban2ActionPerformed

    private void btnban1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban1ActionPerformed
        kiemTraTrangThaiBan(1);
    }//GEN-LAST:event_btnban1ActionPerformed

    private void btnban5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban5ActionPerformed
        kiemTraTrangThaiBan(5);
    }//GEN-LAST:event_btnban5ActionPerformed

    private void btnban12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban12ActionPerformed
        kiemTraTrangThaiBan(12);
    }//GEN-LAST:event_btnban12ActionPerformed

    private void btnban11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban11ActionPerformed
        kiemTraTrangThaiBan(11);
    }//GEN-LAST:event_btnban11ActionPerformed

    private void btnban4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban4ActionPerformed
        kiemTraTrangThaiBan(4);
    }//GEN-LAST:event_btnban4ActionPerformed

    private void btnban10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnban10ActionPerformed
        kiemTraTrangThaiBan(10);
    }//GEN-LAST:event_btnban10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnban1;
    private javax.swing.JButton btnban10;
    private javax.swing.JButton btnban11;
    private javax.swing.JButton btnban12;
    private javax.swing.JButton btnban2;
    private javax.swing.JButton btnban3;
    private javax.swing.JButton btnban4;
    private javax.swing.JButton btnban5;
    private javax.swing.JButton btnban6;
    private javax.swing.JButton btnban7;
    private javax.swing.JButton btnban8;
    private javax.swing.JButton btnban9;
    private javax.swing.JLabel lbT1B01;
    private javax.swing.JLabel lbT1B02;
    private javax.swing.JLabel lbT1B03;
    private javax.swing.JLabel lbT1B04;
    private javax.swing.JLabel lbT1B05;
    private javax.swing.JLabel lbT1B06;
    private javax.swing.JLabel lbT1B07;
    private javax.swing.JLabel lbT1B08;
    private javax.swing.JLabel lbT1B09;
    private javax.swing.JLabel lbT1B10;
    private javax.swing.JLabel lbT1B11;
    private javax.swing.JLabel lbT1B12;
    // End of variables declaration//GEN-END:variables

    public JButton timButtonByMaBan(int maBan) {
        switch (maBan) {
            case 1:
                return btnban1;
            case 2:
                return btnban2;
            case 3:
                return btnban3;
            case 4:
                return btnban4;
            case 5:
                return btnban5;
            case 6:
                return btnban6;
            case 7:
                return btnban7;
            case 8:
                return btnban8;
            case 9:
                return btnban9;
            case 10:
                return btnban10;
            case 11:
                return btnban11;
            case 12:
                return btnban12;
            default:
                return null;
        }
    }
   
    void TrangThaiBan() {
        List<Object[]> banList = dBDao.loadData();
        for (Object[] ban : banList) {
            int maBan = (int) ban[0];
            String trangThai = (String) ban[1];
            JButton button = timButtonByMaBan(maBan);
            if (button != null) {
                switch (trangThai) {
                    case DatBanDao.Trong:
                        button.setBackground(Color.PINK); // Đặt màu nền trắng cho bàn đang hoạt động
                        break;
                    case DatBanDao.DANG_PHUC_VU:
                        button.setBackground(Color.GREEN); // Đặt màu nền xanh cho bàn đang phục vụ
                        break;
                    case DatBanDao.DA_DAT:
                        button.setBackground(Color.red); // Đặt màu nền hồng cho bàn trống
                        break;
                    case DatBanDao.BAO_TRI:
                        button.setBackground(Color.BLACK); // Đặt màu nền đen cho bàn đang bảo trì
                        break;
                    default:
                        break;
                }
            }
        }
    }
     

    void showDiaLogTrangThaiDaDat(int maBan) {
        JDialogTrangThaiDatBan dialog = new JDialogTrangThaiDatBan(new javax.swing.JFrame(), true);
        dialog.setBan(maBan);
        dialog.setVisible(true);
    }

    void ShowDialogDatBan(int maBan) {
        JDiaLogDatBan dialog = new JDiaLogDatBan(new javax.swing.JFrame(), true);
        dialog.setBan(maBan);
        dialog.setVisible(true);

    }

    void showDiaLogBaoTri(int maBan) {
        JDialogBaoTriXong dialog = new JDialogBaoTriXong(new javax.swing.JFrame(), true);
        dialog.setBan(maBan);
        dialog.setVisible(true);

    }

    void showDiaLogDangPhucVu(int maBan) {
        JDiaLogDangPhucVu dialog = new JDiaLogDangPhucVu(new javax.swing.JFrame(), true);
        dialog.setBan(maBan);
        dialog.setVisible(true);
    }

    void kiemTraTrangThaiBan(int maBan) {
        List<Object[]> banList = dBDao.loadData();
        for (Object[] ban : banList) {
            int maBanDB = (int) ban[0];
            String trangThai = (String) ban[1];
            if ((maBan==maBanDB)) {
                switch (trangThai) {
                    case DatBanDao.Trong:
                        ShowDialogDatBan(maBan);
                        return;
                    case DatBanDao.DANG_PHUC_VU:
                        showDiaLogDangPhucVu(maBan);
                        break;
                    case DatBanDao.DA_DAT:
                        showDiaLogTrangThaiDaDat(maBan);
                        return;
                    case DatBanDao.BAO_TRI:
                        showDiaLogBaoTri(maBan);
                        break;
                    default:
                        break;
                }
            }
        }
    }

}
