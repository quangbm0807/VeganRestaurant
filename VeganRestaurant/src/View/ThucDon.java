/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author buimi
 */
import Controller.ThucDonDAO;
import Model.MonAn;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThucDon extends javax.swing.JPanel {

    /**
     * Creates new form ThucDon1
     */
    private ThucDonDAO thucDonDAO;

    public ThucDon() {
        initComponents();
        thucDonDAO = new ThucDonDAO();
//        loadDanhSachMonAn();
        initCombobox();
    }

    private void loadDanhSachMonAn() {
        List<MonAn> danhSachMonAn = thucDonDAO.layDanhSachThucDon();
        loadDanhSachMonLenTable(danhSachMonAn);
    }

    public void loadDanhSachMonLenTable(List<MonAn> danhSachMonAn) {
        DefaultTableModel model = (DefaultTableModel) tblThucDon.getModel();
        model.setRowCount(0);
//        String ngayPhucVu;

        for (MonAn monAn : danhSachMonAn) {
//            String maThucDon = monAn.getNgayPhucVu();
//
//            if ("1".equals(maThucDon)) {
//                ngayPhucVu = "Thứ 2, 4, 6, CN";
//            } else if ("2".equals(maThucDon)) {
//                ngayPhucVu = "Thứ 3, 5, 7";
//            } else {
//                ngayPhucVu = null;
//            }

            Object[] rowData = {monAn.getTenMonAn(), monAn.getLoaiMonAn(), monAn.getNgayPhucVu(), monAn.getHinhAnh()};
            model.addRow(rowData);
        }
    }

    private void initCombobox() {
//        List<String> danhSachThucDon = thucDonDAO.layDanhSachTenThucDon();
//        for (String tenThucDon : danhSachThucDon) {
//            cbbThucDon.addItem(tenThucDon);
//        }
        cbbThucDon.addItem("Tất cả");
        cbbThucDon.addItem("Thứ 2, 4, 6, CN");
        cbbThucDon.addItem("Thứ 3, 5, 7");

//        List<String> danhSachLoaiMon = thucDonDAO.layDanhSachLoaiMon();
//        for (String loaiMon : danhSachLoaiMon) {
//            cbbLoaiMon.addItem(loaiMon);
//        }
        cbbLoaiMon.addItem("Tất cả");
        cbbLoaiMon.addItem("Bún");
        cbbLoaiMon.addItem("Cơm");
        cbbLoaiMon.addItem("Khai vị");
        cbbLoaiMon.addItem("Khác");

    }

    private void clearTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblThucDon.getModel();
        dtm.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbThucDon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTenMon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbLoaiMon = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        chk246 = new javax.swing.JCheckBox();
        chk357 = new javax.swing.JCheckBox();
        btnLuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThucDon = new javax.swing.JTable();
        btnMoi = new javax.swing.JButton();
        lblHinh = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý thực đơn");

        jLabel2.setText("Thực Đơn");

        cbbThucDon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThucDonItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tên món:");

        txtTenMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenMonKeyReleased(evt);
            }
        });

        jLabel5.setText("Loại món");

        cbbLoaiMon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLoaiMonItemStateChanged(evt);
            }
        });

        jLabel6.setText("Ngày phục vụ:");

        buttonGroup1.add(chk246);
        chk246.setText("2,4,6,CN");
        chk246.setToolTipText("TD246");
        chk246.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk246ActionPerformed(evt);
            }
        });

        buttonGroup1.add(chk357);
        chk357.setText("3,5,7");
        chk357.setToolTipText("TD357");

        btnLuu.setBackground(new java.awt.Color(255, 51, 102));
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        tblThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "Loại món", "Ngày phục vụ", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThucDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThucDon);

        btnMoi.setBackground(new java.awt.Color(255, 51, 102));
        btnMoi.setText("Làm mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLuu)
                            .addComponent(cbbLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMoi)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk246)))
                                .addGap(18, 18, 18)
                                .addComponent(chk357)))
                        .addGap(199, 199, 199))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbbThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbbLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(chk246)
                            .addComponent(chk357))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLuu)
                            .addComponent(btnMoi)))
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbThucDonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThucDonItemStateChanged
//        List<MonAn> listAll = thucDonDAO.layDanhSachTatCaMonAn();
//        List<MonAn> listChan = thucDonDAO.layDanhSachMonAnTheoMaThucDon(1);
//        List<MonAn> listLe = thucDonDAO.layDanhSachMonAnTheoMaThucDon(2);
//
//        if (cbbThucDon.getSelectedIndex() == 0) {
//            loadDanhSachMonLenTable(listAll);
//        } else if (cbbThucDon.getSelectedIndex() == 1) {
//            loadDanhSachMonLenTable(listChan);
//        } else {
//            loadDanhSachMonLenTable(listLe);
//        }
        int thucDon = cbbThucDon.getSelectedIndex();
        int loaiMon = cbbLoaiMon.getSelectedIndex();

        if (thucDon == 0) {
            if (loaiMon == 0) {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachAllMonAnTheoLoaiMon());
            } else {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(loaiMon));
            }
        } else {
            if (loaiMon == 0) {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoMaThucDon(thucDon));
            } else {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoThucDonLoaiMon(loaiMon, thucDon));
            }
        }
    }//GEN-LAST:event_cbbThucDonItemStateChanged

    private void chk246ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk246ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk246ActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String tenMon = txtTenMon.getText();
        int maThucDon246 = 1;
        int maThucDon357 = 2;

        if (chk246.isSelected()) {
            thucDonDAO.xoaMonAnKhoiThucDon(maThucDon246, tenMon);
            thucDonDAO.xoaMonAnKhoiThucDon(maThucDon357, tenMon);
            thucDonDAO.themMonAnVaoThucDon(maThucDon246, tenMon);
        } else if (chk357.isSelected()) {
            thucDonDAO.xoaMonAnKhoiThucDon(maThucDon246, tenMon);
            thucDonDAO.xoaMonAnKhoiThucDon(maThucDon357, tenMon);
            thucDonDAO.themMonAnVaoThucDon(maThucDon357, tenMon);
        }

//        loadDanhSachMonAn();
//        loadDanhSachMonLenTable(thucDonDAO.layDanhSachAllMonAnTheoLoaiMon());
        cbbThucDon.setSelectedIndex(0);
        cbbLoaiMon.setSelectedIndex(0);
        txtTenMon.setText("");
        buttonGroup1.clearSelection();
        loadDanhSachMonLenTable(thucDonDAO.layDanhSachAllMonAnTheoLoaiMon());
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tblThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThucDonMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblThucDon.getSelectedRow();
//        System.out.println(selectedRow);

        try {
            if (selectedRow >= 0) {
//                System.out.println(tblThucDon.getValueAt(selectedRow, 0));
//                System.out.println(tblThucDon.getValueAt(selectedRow, 2));
                txtTenMon.setText(tblThucDon.getValueAt(selectedRow, 0).toString());

//                String tenMonAn = tblThucDon.getValueAt(selectedRow, 0).toString();
//                String loaiMonAn = tblThucDon.getValueAt(selectedRow, 1).toString();/
//                System.out.println("a");
//                System.out.println(selectedRow);
//                System.out.println(hinh);
//            cbbThucDon.setSelectedItem(ngayPhucVu);
//            cbbLoaiMon.setSelectedItem(loaiMonAn);
                if (tblThucDon.getValueAt(selectedRow, 2) == null) {
                    buttonGroup1.clearSelection();
                } else {
                    String ngayPhucVu = tblThucDon.getValueAt(selectedRow, 2).toString();

                    chk246.setSelected(ngayPhucVu.equals("2-4-6-CN"));
                    chk357.setSelected(ngayPhucVu.equals("3-5-7"));
                }

                if (tblThucDon.getValueAt(selectedRow, 3) == null) {
                    lblHinh.setIcon(null);
                } else {
                    String hinh = (String) tblThucDon.getValueAt(selectedRow, 3);

                    String imagePath = "/Image/menu/" + hinh;
                    InputStream inputStream = getClass().getResourceAsStream(imagePath);
//                System.out.println(imagePath);
                    if (inputStream != null) {
                        try {
                            BufferedImage originalImage = ImageIO.read(inputStream);

                            int scaledWidth = 150;
                            int scaledHeight = (int) (((double) scaledWidth / originalImage.getWidth()) * originalImage.getHeight());

                            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                            ImageIcon scaledIcon = new ImageIcon(scaledImage);
                            if (scaledIcon != null) {
                                lblHinh.setIcon(scaledIcon);
                            } else {
                                lblHinh.setIcon(null);
                            }
//                        System.out.println(scaledIcon);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        System.err.println("Không thể tìm thấy hình ảnh: " + imagePath);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tblThucDonMouseClicked

    private void cbbLoaiMonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLoaiMonItemStateChanged
        int thucDon = cbbThucDon.getSelectedIndex();
        int loaiMon = cbbLoaiMon.getSelectedIndex();

        if (thucDon == 0) {
            if (loaiMon == 0) {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachAllMonAnTheoLoaiMon());
            } else {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(loaiMon));
            }
//            } else if (cbbLoaiMon.getSelectedIndex() == 1) {
//                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(cbbLoaiMon.getSelectedIndex()));
//            } else if (cbbLoaiMon.getSelectedIndex() == 2) {
//                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(cbbLoaiMon.getSelectedIndex()));
//            } else if (cbbLoaiMon.getSelectedIndex() == 3) {
//                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(cbbLoaiMon.getSelectedIndex()));
//            } else {
//                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(cbbLoaiMon.getSelectedIndex()));
//            }
        } else {
            if (loaiMon == 0) {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoMaThucDon(thucDon));
            } else {
                loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoThucDonLoaiMon(loaiMon, thucDon));
            }
        }
//        } else if (thucDon == 2) {
//            loadDanhSachMonLenTable(thucDonDAO.layDanhSachMonAnTheoLoaiMon(loaiMon, thucDon));
//        }
    }//GEN-LAST:event_cbbLoaiMonItemStateChanged

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
//        loadDanhSachMonAn();
        cbbThucDon.setSelectedIndex(0);
        cbbLoaiMon.setSelectedIndex(0);
        txtTenMon.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void txtTenMonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenMonKeyReleased
        cbbThucDon.setSelectedIndex(0);
        cbbLoaiMon.setSelectedIndex(0);
        loadDanhSachMonLenTable(thucDonDAO.timMonAn(txtTenMon.getText()));
    }//GEN-LAST:event_txtTenMonKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnMoi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLoaiMon;
    private javax.swing.JComboBox<String> cbbThucDon;
    private javax.swing.JCheckBox chk246;
    private javax.swing.JCheckBox chk357;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTable tblThucDon;
    private javax.swing.JTextField txtTenMon;
    // End of variables declaration//GEN-END:variables
}
