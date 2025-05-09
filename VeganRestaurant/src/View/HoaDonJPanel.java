/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author hoang
 */
import Controller.HoaDonDAO;
import Model.HoaDon;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class HoaDonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HoaDonJPanel
     */
    HoaDonDAO hdDAO = new HoaDonDAO();
    DecimalFormat giaFomat = new DecimalFormat("###,###");
    int row = -1;

    public HoaDonJPanel() {
        initComponents();
        this.themVaoTableHD();
//        this.themVaoCbo();
        ImageIcon iconuser1 = new ImageIcon("Logos/view.png");
        btnXemHD.setIcon(iconuser1);
        ImageIcon iconuser2 = new ImageIcon("Logos/binoculars.png");
        btnXemDG.setIcon(iconuser2);
        formatTable();
    }

    void formatTable() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Tạo renderer cho tiêu đề của các cột
        JTableHeader header = tblHoaDon.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Lặp qua tất cả các cột và thiết lập renderer cho nội dung và tiêu đề của mỗi cột
        TableColumnModel columnModel = tblHoaDon.getColumnModel();
        for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
            columnModel.getColumn(columnIndex).setCellRenderer(centerRenderer);
            columnModel.getColumn(columnIndex).setHeaderRenderer(headerRenderer);
        }
    }

    //fill vào hóa đơn
    void themVaoTableHD() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            List<HoaDon> list = hdDAO.selectHD();
            for (HoaDon hd : list) {
                Object[] row = {
                    "HD" + hd.getMaHoaDon(),
                    hd.getNgayLap(),
                    giaFomat.format(hd.getTienMonAn()),
                    giaFomat.format(hd.getTienGiamDiemThuong()),
                    giaFomat.format(hd.getTienGiamKhuyenMai()),
                    giaFomat.format(hd.getTongTien()),
                    hd.getPhuongThuc() ? "Tiền Mặt" : "Chuyển Khoản",
                    "PDB" + hd.getMaPhieuDatBan(),
                    "KM" + hd.getMaKhuyenMai(),
                    "NV" + hd.getMaNhanVien(),
                    "KH" + hd.getMaKhachHang(),};

                model.addRow(row);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    String timKiem() {
        String input = txtTimID.getText();
        return input;
    }

    void timTheoMaKH() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);

        List<HoaDon> list = hdDAO.selectByMuti(timKiem());
        for (HoaDon hd : list) {
            model.addRow(new Object[]{
                "HD" + hd.getMaHoaDon(),
                hd.getNgayLap(),
                giaFomat.format(hd.getTienMonAn()),
                giaFomat.format(hd.getTienGiamDiemThuong()),
                giaFomat.format(hd.getTienGiamKhuyenMai()),
                giaFomat.format(hd.getTongTien()),
                hd.getPhuongThuc() ? "Tiền Mặt" : "Chuyển Khoản",
                "PDB" + hd.getMaPhieuDatBan(),
                "KM" + hd.getMaKhuyenMai(),
                "NV" + hd.getMaNhanVien(),
                "KH" + hd.getMaKhachHang()
            });
        }
    }

//    void thietLapForm(HoaDon hd) {
//        txtMaHoaDon.setText("HD" + hd.getMaHoaDon());
//        txtMaKH.setText("KH" + hd.getMaKhachHang());
//        txtBan.setText("PDB" + String.valueOf(hd.getMaPhieuDatBan()));
//        txtNhanVien.setText("NV" + String.valueOf(hd.getMaNhanVien()));
//        txtNgayLap.setDate(hd.getNgayLap());
//        txtMaGiamGia.setText("KM" + String.valueOf(hd.getMaKhuyenMai()));
//        txtTienMon.setText(String.valueOf(Double.sum(hd.getTienMonAn(), 0)));
//        txtTienGiam.setText(String.valueOf(hd.getTienGiamKhuyenMai()));
//        txtDiemThuong.setText(hd.getTienGiamDiemThuong() + "");
//        cboPhuongThuc.setSelectedItem(hd.getPhuongThuc() ? "Thanh Toán" : "Chưa Thanh Toán" + "");
//        txtTongTien.setText(hd.getTongTien() + "");
//    }
//    void thietLapTableCT(Integer hd) {
//        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
//        model.setRowCount(0);
//
//        List<Object[]> list = hdDAO.getChiTiet(hd);
//        for (Object[] row : list) {
//            model.addRow(new Object[]{
//                row[0], row[1], row[2], row[3]
//            });
//        }
//    }
//    HoaDon layForm() {
//        HoaDon hd = new HoaDon();
//
//        hd.setMaHoaDon(Integer.valueOf(txtMaHoaDon.getText().substring(2)));
//        hd.setMaPhieuDatBan(Integer.valueOf(txtBan.getText().substring(3)));
//        hd.setMaNhanVien(Integer.valueOf(txtNhanVien.getText().substring(2)));
//        hd.setNgayLap(txtNgayLap.getDate());
//        hd.setMaKhuyenMai(Integer.valueOf(txtMaGiamGia.getText().substring(2)));
//        hd.setTienMonAn(Double.parseDouble(txtTienMon.getText()));
//        hd.setTienGiamKhuyenMai(Double.parseDouble(txtTienGiam.getText()));
//        boolean pt;
//        pt = cboPhuongThuc.getSelectedItem().equals("Thanh Toán");
//        hd.setPhuongThuc(pt);
//        hd.setTongTien(Double.parseDouble(txtTongTien.getText()));
//
//        return hd;
//    }
//    void chinhSuaForm() {
//        String maHD = (String) tblHoaDon.getValueAt(this.row, 0);
//
//        System.out.println(maHD);
//
//        HoaDon hd = hdDAO.selectById(Integer.valueOf(maHD.substring(2)));
//
//        this.thietLapForm(hd);
//        this.thietLapTableCT(Integer.valueOf(maHD.substring(2)));
//        tpane.setSelectedIndex(0);
//    }
//    void themHD() {
//        HoaDon hd = layForm();
//        try {
//            hdDAO.update(hd);
//            this.themVaoTableHD();
//
//            MsgBox.alert(this, "Lưu Hóa Đơn Thành Công!");
//        } catch (Exception e) {
//            MsgBox.alert(this, "Lưu Hóa Đơn Thất Bại");
//        }
//    }
//    File luuFile() {
//        JFileChooser ch = new JFileChooser();
//        int luaChon = ch.showSaveDialog(this);
//        if (luaChon == JFileChooser.APPROVE_OPTION) {
//            return ch.getSelectedFile();
//        } else {
//            return null;
//        }
//    }
//    void themVaoCbo(){
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPhuongThuc.getModel();
//        model.removeAllElements();
//        List<HoaDon> list = hdDAO.selectHD();
//        for (HoaDon pt : list) {
//            if(pt.getPhuongThuc() == true){
//                cboPhuongThuc.addItem("Thanh Toán");
//            }else{
//                cboPhuongThuc.addItem("Chưa Thanh Toán");
//            }
//        }
//    }
//    void themVaoCbo() {
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPhuongThuc.getModel();
//        model.removeAllElements();
//        List<Boolean> list = hdDAO.selectPT();
//        for (Boolean pt : list) {
//            if (pt == true) {
//                cboPhuongThuc.addItem("Thanh Toán");
//            } else {
//                cboPhuongThuc.addItem("Chưa Thanh Toán");
//            }
//        }
//    }
    //in hoa đơn theo mẫu
//    void inHoaDon() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=NhaHangChay_CohesiveStars;encrypt = false", "sa", "Songlong123")) {
//                String reportPath = "src\\View\\HoaDonIn.jrxml";
//
//                String maHD = (String) tblHoaDon.getValueAt(this.row, 0);
//
//                Map<String, Object> parameters = new HashMap<>();
//                parameters.put("P_MaHD", maHD);
//
//                JasperReport jcomp = JasperCompileManager.compileReport(reportPath);
//                JasperPrint jprint = JasperFillManager.fillReport(jcomp, parameters, con);
//                JasperViewer.viewReport(jprint, false);
//                JasperPrintManager.printReport(jprint, true);
//            }
//        } catch (ClassNotFoundException | SQLException | JRException ex) {
//        }
//    }
    void xemHoaDon(int mahd) {
        ThanhToanJDialog jdialog = new ThanhToanJDialog(new javax.swing.JFrame(), true);
        jdialog.layMaHoaDon(mahd);
        jdialog.setVisible(true);
    }

    void xemDanhGia(int mahd) {
        DanhGiaJDialog jdialog = new DanhGiaJDialog(new javax.swing.JFrame(), true);
        jdialog.layMaHoaDon(mahd);
        jdialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTimID = new javax.swing.JTextField();
        btnXemHD = new javax.swing.JButton();
        btnXemDG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Quản lý hóa đơn");

        jLabel1.setText("Tìm kiếm:");

        txtTimID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimIDKeyReleased(evt);
            }
        });

        btnXemHD.setText("Xem Hóa Đơn");
        btnXemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemHDActionPerformed(evt);
            }
        });

        btnXemDG.setText("Xem Đánh Giá");
        btnXemDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDGActionPerformed(evt);
            }
        });

        tblHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Lập", "Tiền Món Ăn", "Điểm Thưởng", "Khuyến Mãi", "Tổng tiền", "Phương Thức", "Phiếu Bàn", "Mã Khuyến Mãi", "Mã Nhân Viên", "Mã Khách Hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setRowHeight(30);
        jScrollPane1.setViewportView(tblHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimID, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXemHD)
                                .addGap(18, 18, 18)
                                .addComponent(btnXemDG)))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnXemHD)
                    .addComponent(btnXemDG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemHDActionPerformed
        // TODO add your handling code here:
        this.row = tblHoaDon.getSelectedRow();
        if (this.row >= 0) {
            String mahd = String.valueOf(tblHoaDon.getValueAt(row, 0));

            xemHoaDon(Integer.parseInt(mahd.substring(2)));

        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn hóa đơn", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXemHDActionPerformed

    private void btnXemDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDGActionPerformed
        // TODO add your handling code here:
        this.row = tblHoaDon.getSelectedRow();
        if (this.row >= 0) {

            String mahd = String.valueOf(tblHoaDon.getValueAt(row, 0));

            xemDanhGia(Integer.parseInt(mahd.substring(2)));

        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn hóa đơn", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXemDGActionPerformed

    private void txtTimIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimIDKeyPressed

    }//GEN-LAST:event_txtTimIDKeyPressed

    private void txtTimIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimIDKeyReleased
        // TODO add your handling code here:
        timTheoMaKH();
    }//GEN-LAST:event_txtTimIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXemDG;
    private javax.swing.JButton btnXemHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtTimID;
    // End of variables declaration//GEN-END:variables
}
