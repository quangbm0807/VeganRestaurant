/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.KhachHangDAO;
import Utils.XJdbc;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author buimi
 */
public class KhachHang extends javax.swing.JPanel {

    /**
     * Creates new form KhachHang
     */
    private JFrame frame;
    private List<Model.KhachHang> khachHangList;
    private Date ngayDangKy;

    public KhachHang() {
        initComponents();
        displayKhachHangData();
        frame = new JFrame();
        khachHangList = new ArrayList<>();
    }

    // ... các phương thức và khai báo khác
    public JFrame getFrame() {
        return frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        txtDiemThuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        chkDangKy = new javax.swing.JCheckBox();
        btnTim = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();

        jLabel1.setText("Mã khách hàng:");

        jLabel2.setText("Số điện thoại:");

        jLabel3.setText("Tên khách hàng:");

        jLabel4.setText("Đăng ký thành viên:");

        jLabel5.setText("Điểm thưởng:");

        txtTenKH.setEnabled(false);
        txtTenKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKHKeyReleased(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSDTKeyReleased(evt);
            }
        });

        txtMaKH.setEnabled(false);
        txtMaKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKHKeyReleased(evt);
            }
        });

        txtDiemThuong.setEnabled(false);

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Số điện thoại", "Ngày Đăng ký", "Điểm thưởng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        btnThem.setBackground(new java.awt.Color(255, 102, 102));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 0, 0));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(255, 102, 102));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(0, 0, 0));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        chkDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDangKyActionPerformed(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(255, 102, 102));
        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setForeground(new java.awt.Color(0, 0, 0));
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(255, 102, 102));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(0, 0, 0));
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkDangKy))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnCapNhat)
                                .addGap(18, 18, 18)
                                .addComponent(btnTim)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoi))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCapNhat, btnThem});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnTim});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkDangKy, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat)
                    .addComponent(btnTim)
                    .addComponent(btnMoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCapNhat, btnThem});

    }// </editor-fold>//GEN-END:initComponents

    private void chkDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDangKyActionPerformed
        // TODO add your handling code here:
        if (chkDangKy.isSelected()) {
            ngayDangKy = new Date(); // Lấy ngày hôm nay
        } else {
            ngayDangKy = null; // Checkbox không được tích, truyền null
        }
    }//GEN-LAST:event_chkDangKyActionPerformed
    private void themKhachHang() {
        String maKH = txtMaKH.getText();
        String tenKH = txtTenKH.getText();
        String sdt = txtSDT.getText();
        System.out.println(maKH + tenKH + sdt);

        if (maKH.isEmpty() || tenKH.isEmpty() || sdt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin khách hàng.");
            return;
        }

        Model.KhachHang khachHang = new Model.KhachHang();
        khachHang.setMaKhachHang(maKH);
        khachHang.setSdt(sdt);
        khachHang.setNgayDkThanhVien(ngayDangKy);
        khachHang.setTenKhachHang(tenKH);
        KhachHangDAO kh = new KhachHangDAO();
        // Thực hiện thêm khách hàng
        kh.addKhachHang(khachHang);

        JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");

        displayKhachHangData();
    }

    private void capNhatKhachHang() {
        String maKH = txtMaKH.getText().trim();
        String sdt = txtSDT.getText().trim();

        if (maKH.isEmpty() || sdt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin cần cập nhật.");
            return;
        }

        Model.KhachHang khachHang = new Model.KhachHang();
        khachHang.setMaKhachHang(maKH);
        khachHang.setSdt(sdt);
        khachHang.setNgayDkThanhVien(ngayDangKy);

        KhachHangDAO kh = new KhachHangDAO();
        kh.updateKhachHang(khachHang);

        JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công!");

        displayKhachHangData();
    }
    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        txtMaKH.setEnabled(false);
        txtTenKH.setEnabled(false);
        int selectedRow = tblKhachHang.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();

            // Retrieve data from the selected row
            String maKhachHang = model.getValueAt(selectedRow, 0).toString();
            String tenKhachHang = model.getValueAt(selectedRow, 1).toString();
            String sdt = model.getValueAt(selectedRow, 2).toString();
            String ngayDkString = model.getValueAt(selectedRow, 3).toString();
            Float diemThuong = Float.parseFloat(model.getValueAt(selectedRow, 4).toString());

            // Populate the text fields with the selected data
            txtMaKH.setText(maKhachHang);
            txtTenKH.setText(tenKhachHang);
            txtSDT.setText(sdt);
            txtDiemThuong.setText(diemThuong.toString());

            // Check if there is a registration date and update the checkbox
            if (!ngayDkString.equals("Chưa đăng ký!")) {
                chkDangKy.setSelected(true);
            } else {
                chkDangKy.setSelected(false);
            }
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        int soLuong = tblKhachHang.getRowCount();
        JOptionPane.showMessageDialog(this, "Tìm thấy " + soLuong + " kết quả!");
    }//GEN-LAST:event_btnTimActionPerformed

    private void txtTenKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKHKeyReleased
        // TODO add your handling code here:
//        String sdt = txtSDT.getText().trim();
//        String tenKhachHang = txtTenKH.getText().trim();
//        KhachHangDAO kh = new KhachHangDAO();
//        List<Model.KhachHang> filteredList = kh.searchKhachHangByKeyword(tenKhachHang, sdt);
//        clearTable();
//        fillTable(filteredList);
    }//GEN-LAST:event_txtTenKHKeyReleased

    private void txtSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyReleased
        // TODO add your handling code here:
        String maKH = txtMaKH.getText().trim();
        String sdt = txtSDT.getText().trim();
        KhachHangDAO kh = new KhachHangDAO();
        List<Model.KhachHang> filteredList = kh.searchKhachHangByKeyword(sdt, maKH);
        clearTable();
        fillTable(filteredList);
    }//GEN-LAST:event_txtSDTKeyReleased

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        txtMaKH.setEnabled(true);
        txtSDT.setEnabled(true);
        txtTenKH.setEnabled(true);
        txtTenKH.setText("");
        txtSDT.setText("");
        txtMaKH.setText("");

        chkDangKy.setSelected(false);
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        themKhachHang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        capNhatKhachHang();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void txtMaKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKHKeyReleased
        // TODO add your handling code here:
        String maKH = txtMaKH.getText().trim();
        String sdt = txtSDT.getText().trim();
        KhachHangDAO kh = new KhachHangDAO();
        List<Model.KhachHang> filteredList = kh.searchKhachHangByKeyword(sdt, maKH);
        clearTable();
        fillTable(filteredList);
    }//GEN-LAST:event_txtMaKHKeyReleased
    private void displayKhachHangData() {
        clearTable();
        KhachHangDAO khachHangDAO = new KhachHangDAO(new XJdbc());
        List<Model.KhachHang> khachHangList = khachHangDAO.getAllKhachHang();
        fillTable(khachHangList);
    }

    private void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
    }

    private void fillTable(List<Model.KhachHang> khachHangList) {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();

        for (Model.KhachHang khachHang : khachHangList) {
            Object[] row = {
                khachHang.getMaKhachHang(),
                khachHang.getTenKhachHang(),
                khachHang.getSdt(),
                formatDate(khachHang.getNgayDkThanhVien()),
                khachHang.getDiemThuong()
            };

            model.addRow(row);
        }
    }

    private String formatDate(Date date) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(date);
        } else {
            return "Chưa đăng ký!";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JCheckBox chkDangKy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}