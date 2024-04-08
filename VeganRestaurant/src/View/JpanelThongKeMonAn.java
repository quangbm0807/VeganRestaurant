/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ThongKeDAO;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import se.malmin.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.ImageIcon;
/**
 *
 * @author Võ Thanh Tùng
 */
public class JpanelThongKeMonAn extends javax.swing.JPanel {

    ThongKeDAO tkDAO = new ThongKeDAO();

    /**
     * Creates new form JpanelThongKeMonAn
     */
    public JpanelThongKeMonAn() {
        initComponents();
        fillToTable();
        
         ImageIcon iconuser = new ImageIcon("Logos/bar-chart.png");
        btnBieuDo.setIcon(iconuser);
        
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
        tblMonAnBanChay = new javax.swing.JTable();
        btnBieuDo = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Top 7 món ăn bán chạy");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblMonAnBanChay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Tên món ăn", "Số lương món ăn đã bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMonAnBanChay);
        if (tblMonAnBanChay.getColumnModel().getColumnCount() > 0) {
            tblMonAnBanChay.getColumnModel().getColumn(0).setResizable(false);
            tblMonAnBanChay.getColumnModel().getColumn(1).setResizable(false);
            tblMonAnBanChay.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBieuDo.setBackground(new java.awt.Color(255, 153, 153));
        btnBieuDo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBieuDo.setText("Biểu đồ");
        btnBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBieuDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBieuDoActionPerformed

        JFreeChart chart = createChart();
        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Top 7 món ăn bán chạy");
        frame.getContentPane().add(chartPanel);
        frame.setSize(1000, 600);
        frame.setVisible(true);
    }//GEN-LAST:event_btnBieuDoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBieuDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMonAnBanChay;
    // End of variables declaration//GEN-END:variables

    void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblMonAnBanChay.getModel();
        model.setRowCount(0);
        int i = 1;
        List<Object[]> list = tkDAO.getMonAnBanChay();
        for (Object[] row : list) {
            model.addRow(new Object[]{i, row[0], row[1]});
            i++;
        }
    }

    private JFreeChart createChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Object[]> list = tkDAO.getMonAnBanChay();
        for (Object[] row : list) {
            dataset.addValue((Number) row[1], "Số lượng bán", (Comparable) row[0]);
        }

        JFreeChart chart = ChartFactory.createBarChart3D(
                "Biểu đồ số lượng món ăn bán chạy",
                "Tên món ăn",
                "Số lượng bán",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
 CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Thiết lập màu sắc cho từng cột thủ công
        renderer.setSeriesPaint(0, Color.MAGENTA);
        renderer.setSeriesPaint(1, Color.RED);
        renderer.setSeriesPaint(2, Color.BLUE);

        CategoryItemLabelGenerator labelGenerator = new StandardCategoryItemLabelGenerator() {

            public String generateLabel(CategoryDataset dataset, int row, int column) {
                return dataset.getValue(row, column).toString();
            }
        };
        renderer.setBaseItemLabelGenerator(labelGenerator);
        renderer.setBaseItemLabelsVisible(true);

        Font labelFont = new Font("Arial", Font.BOLD, 14);
        renderer.setBaseItemLabelFont(labelFont);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.BLUE);
        return chart;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Thống kê món ăn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JpanelThongKeMonAn());
        frame.pack();
        frame.setVisible(true);
    }
}
