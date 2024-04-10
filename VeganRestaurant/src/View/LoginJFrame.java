/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Controller.ChamCongDAO;
//import Controller.ChamCongDAO;
import Controller.TaiKhoanDAO;
//import Model.ChamCong;
import Model.TaiKhoan;
import Model.NhanVIen;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XJdbc;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
//import org.opencv.core.Core;

/**
 *
 * @author Admin
 */
public class LoginJFrame extends javax.swing.JFrame {

    public static final String CONFIG_FILE_PATH = "D:\\VEGAN\\config.properties";
    TaiKhoanDAO dao = new TaiKhoanDAO();
//    ChamCongDAO dao1 = new ChamCongDAO();

    public static Date ThoiGianVao;

    public LoginJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadLoginInfo();
        ImageIcon iconuser = new ImageIcon("Logos/nhanvien.png");
        lblUsername.setIcon(iconuser);
        ImageIcon iconuser1 = new ImageIcon("Logos/pass.png");
        lblPass.setIcon(iconuser1);
//        ImageIcon iconuser2 = new ImageIcon("Logos/face-id.png");
//        lblFaceid.setIcon(iconuser2);
        ImageIcon iconuser3 = new ImageIcon("Logos/qr-scan.png");
        lblQRCode.setIcon(iconuser3);
        ImageIcon lblPhaiIcon = new ImageIcon("Logos/fruit salad-cuate.png");
        lblPhai.setIcon(lblPhaiIcon);
        ImageIcon lblTraiIcon = new ImageIcon("Logos/giphy.gif");
        lblBenTrai.setIcon(lblTraiIcon);

    }

//    public String getTenNhanVienByTaiKhoan(String tenTaiKhoan) {
//        NhanVIen nv = dao1.getNhanVienByTaiKhoan(tenTaiKhoan);
//        if (nv != null) {
//            return nv.getTenNhanVIen();
//        } else {
//            return "";
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblQuenMatKhau = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblQRCode = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkSave = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        lblBenTrai = new javax.swing.JLabel();
        lblPhai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 80));
        jPanel2.setForeground(new java.awt.Color(45, 28, 2));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("XIN CHÀO");

        lblUsername.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("User name:");

        txtUsername.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtUsername.setText("tungvt");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Password: ");

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPassword.setText("123");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 0, 255));
        btnLogin.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnLogin.setText("Đăng Nhập");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 51));
        btnCancel.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnCancel.setText("Thoát");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblQuenMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        lblQuenMatKhau.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        lblQuenMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblQuenMatKhau.setText("Quên mật khẩu ");
        lblQuenMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setText("Liên hệ chúng tôi: 0909090909");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HÃY ĐĂNG NHẬP TÀI KHOẢN CỦA BẠN");

        lblQRCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQRCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQRCodeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setText("Lưu mật khẩu");

        chkSave.setBackground(new java.awt.Color(153, 153, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chkSave, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPass)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 145, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 95, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuenMatKhau)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSave, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(lblQuenMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 360, 460));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel8.setText("QUẢN LÝ NHÀ HÀNG");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 350, -1));
        getContentPane().add(lblBenTrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));
        getContentPane().add(lblPhai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -6, 890, 520));

        setSize(new java.awt.Dimension(1049, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String UserName = txtUsername.getText();
            String Pass = (new String(txtPassword.getPassword()));
            if (chkValidate()) {
                Login(UserName, Pass);
            }
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String UserName = txtUsername.getText();
            String Pass = (new String(txtPassword.getPassword()));
            if (chkValidate()) {
                Login(UserName, Pass);
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String tenTaiKhoan = txtUsername.getText();
        String matKhau = new String(txtPassword.getPassword());

        if (chkValidate()) {
            login();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
        openQuenMatKhau();
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    private void lblQRCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQRCodeMouseClicked
        openQRCodeDialog();
    }//GEN-LAST:event_lblQRCodeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBenTrai;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPhai;
    private javax.swing.JLabel lblQRCode;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    private void openQRCodeDialog() {
        QRCode qrCodeDialog = new QRCode(this, true);
        qrCodeDialog.setParentLoginDialog(this);
        qrCodeDialog.setVisible(true);
    }

    public boolean chkValidate() {
        if (txtUsername.getText().equals("")) {
            MsgBox.alert(this, "Tên tài khoản không được bỏ trống");
            return false;
        }
        if (new String(txtPassword.getPassword()).length() == 0) {
            MsgBox.alert(this, "Mật khẩu không được bỏ trống");
            return false;
        }
        return true;
    }

    void login() {
        String UserName = txtUsername.getText();
        String Pass = (new String(txtPassword.getPassword()));
        if (chkValidate()) {
            Login(UserName, Pass);
        }
    }

    public void fillLoginInfo(String username, String token) {
        txtUsername.setText(username);
        txtPassword.setText(token);
    }

    public void Login(String tentk, String pass) {
        TaiKhoan tk = dao.selectById(tentk);
        if (tk.getTrangThai().equalsIgnoreCase("Nghỉ")) {
            MsgBox.alert(this, "Nhân viên đã nghỉ!");
            return;
        }
        if (tk == null) {
            MsgBox.alert(this, "Tài khoản không tồn tại!");
            return;
        }
        if (!tk.getMatKhau().equalsIgnoreCase(pass)) {
            MsgBox.alert(this, "Mật khẩu sai!");
            return;
        }
        if (tk != null) {
            Auth.user = tk;
            MsgBox.alert(this, "Bạn đã nhập thành công vai trò: " + (Auth.user.isVaiTro() ? "Quản lý" : "Nhân viên"));

            dispose();
            Main m = new Main();
            m.callMain();
          
            if (chkSave.isSelected()) {
                saveLoginInfo(tentk, pass, true);
            } else {
                saveLoginInfo("", "", false);
            }
        }
    }

    public void saveLoginInfo(String username, String password, boolean remenberMe) {
        try {
            File configFile = new File(CONFIG_FILE_PATH);
            if (!configFile.exists()) {
                configFile.getParentFile().mkdirs();
                configFile.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(CONFIG_FILE_PATH)) {
                Properties properties = new Properties();
                properties.setProperty("username", username);
                properties.setProperty("password", password);
                properties.setProperty("rememberMe", String.valueOf(remenberMe));
                properties.store(fos, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadLoginInfo() {
        try (FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH)) {
            Properties properties = new Properties();
            properties.load(fis);

            String savedUsername = properties.getProperty("username", "");
            String savedPassword = properties.getProperty("password", "");
            boolean rememberMe = Boolean.parseBoolean(properties.getProperty("rememberMe", "false"));
            txtUsername.setText(savedUsername);
            txtPassword.setText(savedPassword);
            chkSave.setSelected(rememberMe);
        } catch (FileNotFoundException e) {
            saveLoginInfo("", "", false);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void openQuenMatKhau() {
        new QuenMatKhau(this, true).setVisible(true);
    }

    void chamcong() {
        // Chấm công khi đăng nhập thành công
//            NhanVIen nv = dao1.getNhanVienByTaiKhoan(tenTaiKhoan);
//            if (nv == null) {
//                MsgBox.alert(this, "Không tìm thấy thông tin nhân viên!");
//                return;
//            }
//            Date thoiGianVao = new Date();
//
//            this.ThoiGianVao = thoiGianVao;
//            // Thêm thông tin chấm công vào bảng ChamCong
//            String insertSQL = "INSERT INTO ChamCong(MaNhanVien, TenTaiKhoan, TenNhanVien, ThoiGianVao) VALUES (?, ?, ?, ?)";
//            XJdbc.executeUpdate(insertSQL, nv.getMaNhanVien(), tenTaiKhoan, nv.getTenNhanVIen(), thoiGianVao);

//            MsgBox.alert(null, "Chấm công thành công!\nBạn đã đăng nhập thành công với vai trò: " + (Auth.user.isVaiTro() ? "Quản lý" : "Nhân viên"));
    }
}
