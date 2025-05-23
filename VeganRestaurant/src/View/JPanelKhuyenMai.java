/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.KhuyenMaiDAO;
import LiLy.cell.TableActionCellRender;
import Model.KhuyenMai;
import Model.TableActionCellEditor;
import Model.TableActionEvent;
import Utils.MsgBox;
import Utils.XDate;
import Utils.XJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JPanelKhuyenMai extends javax.swing.JPanel {

    List<KhuyenMai> list = new ArrayList<>();
    KhuyenMaiDAO daoKM = new KhuyenMaiDAO() {
    };
    int row = -1;
    int current = 0; //dòng vị trí hiện hành    

    String username = "sa";
    String password = "Songlong123";
    String dburl = "jdbc:sqlserver://localhost:1433;databaseName=NhaHangChay_CohesiveStars";

    /**
     * Creates new form JPanelKhuyenMai
     */
    public JPanelKhuyenMai() {
        initComponents();
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onVoucher(int row) {
                System.out.println("Voucher row: " + row);

                String[] voucherIDs = {"KM01", "KM02", "KM03", "KM04", "KM05", "KM06", "KM07"};
                for (String voucherID : voucherIDs) {
                    try {
                        String soLuong = "UPDATE KhuyenMai SET SoLuong = SoLuong - 1 WHERE MaKhuyenMai = ?";
                        try (PreparedStatement pstmt = XJdbc.preparedStatement(soLuong)) {
                            pstmt.setString(1, voucherID);
                            pstmt.executeUpdate();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return;
                }
                refreshTableView();
            }

            public void onMail(int row) {
                System.out.println("Mail row: " + row);
                JDialog jdialog = new SendMail(new javax.swing.JFrame(), true);
                jdialog.setVisible(true);
            }

            public void onDelete(int row) {
                System.out.println("View row: " + row);
                DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
                model.removeRow(row);
            }
        };

        this.fillTable();
        this.updateStatus();

        String keyword = txtSearch.getText();
        load(keyword);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        pnlEdit = new javax.swing.JPanel();
        lblLearnerID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        lblBirth = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtPercent = new javax.swing.JTextField();
        txtStart = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEnd = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1139, 463));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("VEGAN'S VOUCHER");

        tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Voucher", "Mô tả", "Phần Trăm", "Số Lượng", "Ngày Bắt Đầu", "Ngày Kết Thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVoucher.setRowHeight(60);
        tblVoucher.setSelectionBackground(new java.awt.Color(255, 102, 204));
        tblVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVoucherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVoucher);

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("List", pnlList);

        lblLearnerID.setText("Mã Khuyến Mãi");

        lblName.setText("Mô Tả");

        lblBirth.setText("Số Lượng");

        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumberKeyReleased(evt);
            }
        });

        lblTelephone.setText("Phần Trăm");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtID.setEnabled(false);

        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        txtPercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPercentKeyReleased(evt);
            }
        });

        txtStart.setEnabled(false);

        jLabel6.setText("Ngày Bắt Đầu:");

        jLabel7.setText("Ngày Kết Thúc:");

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblLearnerID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMoTa)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNew)))
                .addGap(135, 190, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(228, 228, 228))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLearnerID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblTelephone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lblBirth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete)
                        .addComponent(btnNew))
                    .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabs.addTab("Tạo Mới", pnlEdit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jButton1.setText("SendMail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyReleased
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            txtNumber.setText("");
        }
    }//GEN-LAST:event_txtNumberKeyReleased

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        //        if (deleteVoucherExpiry()){
        //            delete();
        //        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        update();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //        insert();
        if (validateForm()) {
            insert();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void txtPercentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercentKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercentKeyReleased

    private void tblVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVoucherMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblVoucher.getSelectedRow();
            if (this.row >= 0) {
                this.edit();
            }
        }
    }//GEN-LAST:event_tblVoucherMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String keyword = txtSearch.getText();
        load(keyword);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           JDialog jdialog = new SendMail(new javax.swing.JFrame(), true);
        jdialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblLearnerID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblVoucher;
    private com.toedter.calendar.JDateChooser txtEnd;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPercent;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtStart;
    // End of variables declaration//GEN-END:variables
 void insert() {
        KhuyenMai km = getForm();
        try {
            daoKM.insert(km);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Insert successfully");
        } catch (Exception e) {
            MsgBox.alert(this, "Insert unsucessfully!");
            e.printStackTrace();
        }
    }

    void update() {
        KhuyenMai km = getForm();
        try {
            daoKM.update(km);
            this.fillTable();
            MsgBox.alert(this, "Update successfully");
        } catch (Exception e) {
            MsgBox.alert(this, "Update unsucessfully!");
            e.printStackTrace();
        }
    }

    void delete() {
//        if (!Auth.isManager()) {
//            MsgBox.alert(this, "You're not authorized to delete learner!");
//        } else {
        String manh = txtID.getText();
        if (MsgBox.confirm(this, "Bạn có muốn xóa mã này không?")) {
            try {
                daoKM.delete(manh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa không thành công!");
            }
        }
    }
//    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
        model.setRowCount(0);
        try {
            List<KhuyenMai> list = daoKM.selectAll();
            for (KhuyenMai km : list) {
                Object[] row = {
                    km.getMaKhuyenMai(),
                    km.getMoTa(),
                    km.getPhanTram(),
                    km.getSoLuong(),
                    XDate.toString(km.getNgayBatDau(), "dd-MM-yyyy"),
                    XDate.toString(km.getNgayKetThuc(), "dd-MM-yyyy"),};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void setForm(KhuyenMai km) {
        txtID.setText(km.getMaKhuyenMai() + "");
        txtMoTa.setText((String) km.getMoTa());
        txtPercent.setText(km.getPhanTram() + "");
        txtNumber.setText(km.getSoLuong() + "");
        txtStart.setDate(km.getNgayBatDau());
        txtEnd.setDate(km.getNgayKetThuc());
    }

    void clearForm() {
        int maKM = daoKM.getMaxKhuyenMaiId();
        txtID.setText((maKM + 1) + "");

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        txtStart.setDate(calendar.getTime());

        txtMoTa.setText("");
        txtPercent.setText("");
        txtNumber.setText("");
        txtEnd.setDate(null);
        this.row = -1;
        this.updateStatus();
    }

    KhuyenMai getForm() {
        KhuyenMai km = new KhuyenMai();
        km.setMaKhuyenMai(Integer.parseInt(txtID.getText()));
        km.setMoTa(txtMoTa.getText());
        km.setPhanTram(Integer.valueOf(txtPercent.getText()));
        km.setSoLuong(Integer.valueOf(txtNumber.getText()));

        java.util.Date startDateUtil = txtStart.getDate();
        java.sql.Date startDateSql = new java.sql.Date(startDateUtil.getTime());
        km.setNgayBatDau(startDateSql);

        java.util.Date endDateUtil = txtEnd.getDate();
        java.sql.Date endDateSql = new java.sql.Date(endDateUtil.getTime());
        km.setNgayKetThuc(endDateSql);

        return km;
    }

    void edit() {
        String makm = String.valueOf(tblVoucher.getValueAt(this.row, 0));
        KhuyenMai km = daoKM.selectById(makm);
        this.setForm(km);
        tabs.setSelectedIndex(1);
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblVoucher.getRowCount() - 1);
        //Form state
        txtID.setEditable(!edit);
        btnAdd.setEnabled(!edit);
        btnEdit.setEnabled(edit);
        btnDelete.setEnabled(edit);
        //Directional state
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void search() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        this.updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblVoucher.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblVoucher.getRowCount() - 1;
        this.edit();
    }

    void demSoLuong(String maKM) {
        KhuyenMaiDAO kmDao = new KhuyenMaiDAO() {
        };
        try {
            kmDao.soLuongVoucher(maKM);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void refreshTableView() {
        try {
            // Lấy dữ liệu mới từ cơ sở dữ liệu
            ResultSet resultSet = XJdbc.executeQuery("SELECT * FROM KHUYENMAI");

            // Tạo một mô hình dữ liệu mới với dữ liệu đã được cập nhật
            DefaultTableModel updatedModel = new DefaultTableModel();

            // Lấy số cột của ResultSet
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Thêm tên cột vào mô hình dữ liệu
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                updatedModel.addColumn(metaData.getColumnName(columnIndex));
            }

            // Thêm dữ liệu từ ResultSet vào mô hình dữ liệu
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    rowData[columnIndex - 1] = resultSet.getObject(columnIndex);
                }
                updatedModel.addRow(rowData);
            }

            // Cập nhật bảng hiển thị với mô hình dữ liệu mới
            tblVoucher.setModel(updatedModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void load(String keyword) {
        DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
        model.setRowCount(0);
        try {
            List<KhuyenMai> list = daoKM.selectByKeyword(keyword);
            if (list.isEmpty()) {
//            DialogHelper.alert(this, "Không tìm thấy kết quả nào!");
                return;
            }
            for (KhuyenMai km : list) {
                Object[] row = {
                    km.getMaKhuyenMai(),
                    km.getMoTa(),
                    km.getPhanTram(),
                    km.getSoLuong(),
                    XDate.toString(km.getNgayBatDau(), "dd-MM-yyyy"),
                    XDate.toString(km.getNgayKetThuc(), "dd-MM-yyyy")
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    public boolean validateForm() {
        if (txtID.getText().isEmpty()) {
            MsgBox.alert(this, "Mã khuyến mãi không được bỏ trống!");
            return false;
        }
        if (txtMoTa.getText().isEmpty()) {
            MsgBox.alert(this, "Mô tả khuyến mãi không được bỏ trống!");
            return false;
        }
        if (txtPercent.getText().isEmpty()) {
            MsgBox.alert(this, "Phần trăm giảm giá không được bỏ trống!");
            return false;
        }
        try {
            int percent = Integer.parseInt(txtPercent.getText());
            if (percent < 5 || percent > 50) {
                MsgBox.alert(this, "Phần trăm giảm giá phải nằm trong khoảng từ 5 đến 50!");
                return false;
            }
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "Phần trăm không được nhập chữ!");
            return false;
        }
        if (txtNumber.getText().isEmpty()) {
            MsgBox.alert(this, "Số lượng giảm giá không được bỏ trống!");
            return false;
        }
        try {
            int number = Integer.parseInt(txtNumber.getText());
            if (number > 500) {
                MsgBox.alert(this, "Số lượng giảm giá không được lớn hơn 500!");
                return false;
            }
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "Số lượng không được nhập chữ!");
            return false;
        }
        if (txtStart.getDate() == null) {
            MsgBox.alert(this, "Ngày bắt đầu không được bỏ trống!");
            return false;
        }
        if (txtEnd.getDate() == null) {
            MsgBox.alert(this, "Ngày kết thúc không được bỏ trống!");
            return false;
        }
        LocalDate startDate = txtStart.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = txtEnd.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (startDate.isAfter(endDate)) {
            MsgBox.alert(this, "Ngày bắt đầu không được lớn hơn hoặc bằng ngày kết thúc!");
            return false;
        }
        return true;
    }


}
