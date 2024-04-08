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
import Controller.ThanhVienDAO;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

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
        resetCustomerId(getNewCustomerId());

        ImageIcon iconuser = new ImageIcon("Logos/plus.png");
        btnThem.setIcon(iconuser);
        ImageIcon iconuser1 = new ImageIcon("Logos/edit.png");
        btnCapNhat.setIcon(iconuser1);
        ImageIcon iconuser2 = new ImageIcon("Logos/find.png");
        btnTim.setIcon(iconuser2);
        ImageIcon iconuser3 = new ImageIcon("Logos/add-user.png");
        btnMoi.setIcon(iconuser3);
        

        btnThem.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCapNhat.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnTim.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnMoi.setHorizontalTextPosition(SwingConstants.RIGHT);
    }

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
        jLabel6 = new javax.swing.JLabel();
        cldNgaySinh = new com.toedter.calendar.JDateChooser();

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại", "Ngày sinh", "Ngày Đăng Ký", "Điểm Thưởng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        btnThem.setText("Thêm");
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(255, 102, 102));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        btnTim.setText("Tìm kiếm");
        btnTim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(255, 102, 102));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel6.setText("Ngày sinh:");

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat))
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTim)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkDangKy))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiemThuong)
                                    .addComponent(cldNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCapNhat, btnThem});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnTim});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkDangKy, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(cldNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDangKyActionPerformed
        // TODO add your handling code here:
        if (chkDangKy.isSelected()) {
            ngayDangKy = new Date(); // Lấy ngày hôm nay
        } else {
            ngayDangKy = null;
        }
    }//GEN-LAST:event_chkDangKyActionPerformed
    private void themKhachHang() {
        String tenKH = txtTenKH.getText().trim();
        String sdt = txtSDT.getText().trim();
        Date ngaySinh = cldNgaySinh.getDate();
        KhachHangDAO khDao = new KhachHangDAO();
        Model.KhachHang MavsTen = khDao.getCustomerByPhoneNumber(sdt);
        if (MavsTen != null) {
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại trong cơ sở dữ liệu của khách hàng: " + MavsTen.getTenKhachHang() + MavsTen.getMaKhachHang());
            return;
        }

        if (tenKH.isEmpty() || sdt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên và số điện thoại không được để trống!.");
            return;
        }

        Model.KhachHang khachHang = new Model.KhachHang();
        khachHang.setTenKhachHang(tenKH);
        khachHang.setSDT(sdt);
        khachHang.setNgaySinh(ngaySinh);

        KhachHangDAO kh = new KhachHangDAO();
        String maKhachHang = kh.addKhachHang(khachHang);

        if (chkDangKy.isSelected()) {
            themThanhVien(maKhachHang);
            JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
            return;
        }

        JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
    }

    private void themThanhVien(String maKhachHang) {

        Date ngayDkThanhVien = new Date();

        Model.ThanhVien thanhVien = new Model.ThanhVien();
        thanhVien.setNgayDkThanhVien(ngayDkThanhVien);
        thanhVien.setMaKhachHang(maKhachHang);

        ThanhVienDAO tv = new ThanhVienDAO();
        tv.addThanhVien(thanhVien);

    }

    private void capNhatThanhVien(String maKhachHang) {
        if (maKhachHang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng cần cập nhật.");
            return;
        }
        ThanhVienDAO tvDAO = new ThanhVienDAO();
        Model.ThanhVien thanhVien = tvDAO.getThanhVienByMaKhachHang(Integer.parseInt(maKhachHang) + "");
        if (thanhVien == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thành viên cho khách hàng này.");
            return;
        }
        Date ngayDkThanhVien = new Date();
        thanhVien.setNgayDkThanhVien(ngayDkThanhVien);

        tvDAO.updateThanhVien(thanhVien);

        JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành viên thành công!");
        displayKhachHangData();
    }

    private void capNhatKhachHang() {
        String maKhachHang = txtMaKH.getText().trim();
        String tenKH = txtTenKH.getText().trim();
        String sdt = txtSDT.getText().trim();
        Date ngaySinh = cldNgaySinh.getDate();

        if (maKhachHang.isEmpty() || tenKH.isEmpty() || sdt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng cần cập nhật.");
            return;
        }

        Model.KhachHang khachHang = new Model.KhachHang();
        khachHang.setMaKhachHang(Integer.parseInt(maKhachHang));
        khachHang.setTenKhachHang(tenKH);
        khachHang.setSDT(sdt);
        khachHang.setNgaySinh(ngaySinh);

        KhachHangDAO kh = new KhachHangDAO();
        kh.updateKhachHang(khachHang);

        if (chkDangKy.isSelected()) {
            ThanhVienDAO tvDAO = new ThanhVienDAO();
            Model.ThanhVien thanhVien = tvDAO.getThanhVienByMaKhachHang(Integer.parseInt(maKhachHang) + "");
            if (thanhVien == null) {
                themThanhVien(maKhachHang);
            } else {
                capNhatThanhVien(maKhachHang);
                return;
            }
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành viên thành công!");
            displayKhachHangData();
            return;
        }
        JOptionPane.showMessageDialog(this, "Cập nhật thông tin khách hàng thành công!");
        displayKhachHangData();
    }

    private void displayDetail() {
        txtMaKH.setEnabled(false);
        txtTenKH.setEnabled(false);
        int selectedRow = tblKhachHang.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
            String maKhachHang = model.getValueAt(selectedRow, 0).toString();
            String tenKhachHang = model.getValueAt(selectedRow, 1).toString();
            String sdt = model.getValueAt(selectedRow, 2).toString();
            Date ngaySinh = (Date) model.getValueAt(selectedRow, 3);

            String ngayDkString = model.getValueAt(selectedRow, 4).toString();
            float diemThuong = Float.parseFloat(model.getValueAt(selectedRow, 5).toString());

            txtMaKH.setText(maKhachHang);
            txtTenKH.setText(tenKhachHang);
            txtSDT.setText(sdt);
            cldNgaySinh.setDate(ngaySinh);
            txtDiemThuong.setText(Float.toString(diemThuong));

            if (!ngayDkString.equals("Chưa đăng ký!")) {
                chkDangKy.setSelected(true);
            } else {
                chkDangKy.setSelected(false);
            }
        }
    }


    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        displayDetail();
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        String keyword = JOptionPane.showInputDialog(this, "Nhập tên khách hàng hoặc số điện thoại:", "Tìm kiếm", JOptionPane.QUESTION_MESSAGE);
        if (keyword == null || keyword.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm.");
            return;
        }
        displayKhachHangData();
        clearTable();
        KhachHangDAO khachHangDAO = new KhachHangDAO(new XJdbc());
        List<Model.KhachHang> khachHangList = khachHangDAO.getAllKhachHang();

        List<Model.KhachHang> filteredList = new ArrayList<>();
        for (Model.KhachHang khachHang : khachHangList) {
            String tenKH = khachHang.getTenKhachHang();
            if (tenKH == null) {
                tenKH = "";
            }
            String SDT = khachHang.getSDT();
            if (SDT == null) {
                SDT = "";
            }
            if (tenKH.toLowerCase().contains(keyword.toLowerCase())
                    || SDT.contains(keyword)) {
                filteredList.add(khachHang);
            }
        }
        int size = filteredList.size();
        if (size == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
        } else {
            JOptionPane.showMessageDialog(this, "Tìm thấy " + size + " kết quả!");
        }
        fillTable(filteredList);
    }//GEN-LAST:event_btnTimActionPerformed

    private void txtTenKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKHKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTenKHKeyReleased

    private void txtSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSDTKeyReleased

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        int newCustomerId = getNewCustomerId() + 1;
        txtMaKH.setText(String.valueOf(newCustomerId));
        txtSDT.setEnabled(true);
        txtTenKH.setEnabled(true);
        txtTenKH.setText("");
        txtSDT.setText("");
        cldNgaySinh.setDate(null);
        chkDangKy.setSelected(false);
        displayKhachHangData();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        themKhachHang();
        displayKhachHangData();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        capNhatKhachHang();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void txtMaKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKHKeyReleased
        // TODO add your handling code here:
//        String maKH = txtMaKH.getText().trim();
//        String sdt = txtSDT.getText().trim();
//        KhachHangDAO kh = new KhachHangDAO();
//        List<Model.KhachHang> filteredList = kh.searchKhachHangByKeyword(sdt, maKH);
//        clearTable();
//        fillTable(filteredList);
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
                khachHang.getSDT(),
                khachHang.getNgaySinh(),
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

    private void resetCustomerId(int getNewCustomerId) {
        String sql = "DBCC CHECKIDENT ('KhachHang', RESEED, " + getNewCustomerId + ");";

        try {
            XJdbc.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getNewCustomerId() {
        String sql = "SELECT TOP 1 MaKhachHang FROM KhachHang ORDER BY MaKhachHang DESC;";
        int newCustomerId = 0;

        try ( ResultSet rs = XJdbc.executeQuery(sql)) {
            if (rs.next()) {
                newCustomerId = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return newCustomerId;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JCheckBox chkDangKy;
    private com.toedter.calendar.JDateChooser cldNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
