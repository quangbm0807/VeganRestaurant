/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ThongKeDAO;
import javax.swing.DefaultComboBoxModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import javax.swing.ImageIcon;
/**
 *
 * @author Võ Thanh Tùng
 */
public class JPanelThongKeDoanhThu extends javax.swing.JPanel {

    ThongKeDAO tkDAO = new ThongKeDAO();

    /**
     * Creates new form JPanelThongKeDoanhThu
     */
    public JPanelThongKeDoanhThu() {
        initComponents();
        init();
        
         ImageIcon iconuser = new ImageIcon("Logos/bar-chart.png");
        btnBieuDo.setIcon(iconuser);
        ImageIcon iconuser1 = new ImageIcon("Logos/printer.png");
        jButton1.setIcon(iconuser1);
    }
    
    void init() {
        fillToComBoBoxNam();
        fillToTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        cboNam = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnBieuDo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Doanh thu theo tháng");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tháng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoanhThu);
        if (tblDoanhThu.getColumnModel().getColumnCount() > 0) {
            tblDoanhThu.getColumnModel().getColumn(0).setResizable(false);
            tblDoanhThu.getColumnModel().getColumn(1).setResizable(false);
        }

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Năm");

        btnBieuDo.setBackground(new java.awt.Color(255, 0, 102));
        btnBieuDo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBieuDo.setText("Biểu đồ");
        btnBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBieuDoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("In file excel");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBieuDo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBieuDoActionPerformed
        drawElliottWaveChart();
    }//GEN-LAST:event_btnBieuDoActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        fillToTable();
    }//GEN-LAST:event_cboNamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fillToTableAndExportToExcel();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBieuDo;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoanhThu;
    // End of variables declaration//GEN-END:variables

    void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int year = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = tkDAO.getDoanhThu(year);
        for (Object[] rows : list) {
            model.addRow(new Object[]{rows[0], rows[1]});
        }
     
    }

    void fillToComBoBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List<Integer> list = tkDAO.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }

    private void drawElliottWaveChart() {
        // Lấy dữ liệu từ ComboBox
        int year = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = tkDAO.getDoanhThu(year);

        // Tạo dữ liệu cho biểu đồ
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[][] data = new double[2][list.size()];
        for (int i = 0; i < list.size(); i++) {
            Object[] row = list.get(i);
            data[0][i] = i + 1; // Tháng
            data[1][i] = Double.parseDouble(row[1].toString()); // Doanh thu
        }
        dataset.addSeries("Doanh thu", data);

        


        // Tạo biểu đồ Elliott Wave
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Doanh thu theo năm " + year, "Tháng", "Doanh thu",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        XYPlot plot = chart.getXYPlot();
        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        domainAxis.setTickUnit(new NumberTickUnit(1)); // Đặt đơn vị tick là 1
        domainAxis.setRange(0.5, 12.5); // Đặt khoảng giá trị trục x từ 0.5 đến 12.5
        domainAxis.setTickLabelsVisible(true); // Hiển thị nhãn tick

        // Hiển thị biểu đồ trong cửa sổ JFrame mới
        JFrame frame = new JFrame("Biểu đồ Elliott Wave");
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.getContentPane().add(chartPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
     void fillToTableAndExportToExcel() {
        int year = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = tkDAO.getDoanhThu(year);

        // Tạo một workbook mới
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("DoanhThu" + year);

            CellStyle style = workbook.createCellStyle();
            style.setAlignment(HorizontalAlignment.CENTER); // Căn giữa theo chiều ngang
            style.setVerticalAlignment(VerticalAlignment.CENTER);
            style.setFillForegroundColor(IndexedColors.GOLD.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Row reportRow = sheet.createRow(0);
            Row headerRow = sheet.createRow(1);
            Cell mergedCell = reportRow.createCell(0);
            mergedCell.setCellValue("Báo cáo");
            headerRow.createCell(0).setCellValue("Tháng");
            headerRow.createCell(1).setCellValue("Tổng tiền");

            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 1));
            mergedCell.setCellStyle(style);
            // Điền dữ liệu vào tệp Excel
            for (int i = 0; i < list.size(); i++) {
                Object[] rowData = list.get(i);
                Row row = sheet.createRow(i + 2);
                row.createCell(0).setCellValue((Integer) rowData[0]);
                row.createCell(1).setCellValue(((BigDecimal) rowData[1]).doubleValue());
            }

            // Lưu workbook vào tệp Excel
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Lưu tệp Excel");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xlsx");
            fileChooser.setFileFilter(filter);

            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String filePath = file.getAbsolutePath();

                // Thêm phần mở rộng .xlsx nếu người dùng không nhập nó
                if (!filePath.toLowerCase().endsWith(".xlsx")) {
                    filePath += ".xlsx";
                }

                try ( FileOutputStream fileOut = new FileOutputStream(filePath)) {
                    workbook.write(fileOut);
                    JOptionPane.showMessageDialog(null, "Tệp Excel đã được tạo thành công.");
                }
            } else {
                System.out.println("Người dùng không chọn đường dẫn lưu file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thống kê món ăn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JPanelThongKeDoanhThu());
        frame.pack();
        frame.setVisible(true);
    }
}
