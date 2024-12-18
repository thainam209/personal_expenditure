/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlchitieu;

import Dialog.AboutUsDialog;
import Dialog.LoginDialog;
import Dialog.SettingDialog;
import Tabs.AddExpenditurePane;
import Tabs.AddExpenditureTypePane;
import Tabs.AddReceiptPane;
import Tabs.AddReceiptTypePane;
import Tabs.ListExpenditurePane;
import Tabs.ListExpenditureTypePane;
import Tabs.ListReceiptPane;
import Tabs.ListReceiptTypePane;
import Tabs.ReportExpenditurePane;
import java.awt.event.KeyEvent;

/**
 *
 * @author DELL
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents(); //khởi tạo các components
        
        setLocationRelativeTo(null); //hiển thị form ra giữa màn hình
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAddExpenditure = new javax.swing.JButton();
        btnListExpenditure = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnAddReceipt = new javax.swing.JButton();
        btnListReceipt = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnReportExpenditure = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btnLock = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        btnCloseTab = new javax.swing.JButton();
        tpnBoard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLogin = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuLogout = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuLock = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnuSetting = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuListExpenditureType = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnuAddExpenditureType = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mnuListExpenditure = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuLAddExpenditure = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuListReceipt = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuAddReceipt = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnuListReceiptType = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        mnuAddReceiptType = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuContent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Expenditure");
        setSize(new java.awt.Dimension(800, 650));

        jToolBar1.setRollover(true);

        btnAddExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_32.png"))); // NOI18N
        btnAddExpenditure.setText("Thêm mới chi tiêu");
        btnAddExpenditure.setFocusable(false);
        btnAddExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddExpenditure);

        btnListExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listExpenditure_32.png"))); // NOI18N
        btnListExpenditure.setText("Liệt kê chi tiêu");
        btnListExpenditure.setFocusable(false);
        btnListExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListExpenditure);
        jToolBar1.add(jSeparator9);

        btnAddReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_32.png"))); // NOI18N
        btnAddReceipt.setText("Thêm mới nguồn thu");
        btnAddReceipt.setFocusable(false);
        btnAddReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddReceipt);

        btnListReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list_32.png"))); // NOI18N
        btnListReceipt.setText("Liệt kê nguồn thu");
        btnListReceipt.setFocusable(false);
        btnListReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListReceipt);
        jToolBar1.add(jSeparator10);

        btnReportExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/financial report.png"))); // NOI18N
        btnReportExpenditure.setText("Báo cáo tài chính");
        btnReportExpenditure.setFocusable(false);
        btnReportExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(btnReportExpenditure);
        jToolBar1.add(jSeparator11);

        btnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_32.png"))); // NOI18N
        btnLock.setText("Khóa");
        btnLock.setFocusable(false);
        btnLock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLock.setMaximumSize(new java.awt.Dimension(60, 60));
        btnLock.setMinimumSize(new java.awt.Dimension(60, 60));
        btnLock.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLock);
        jToolBar1.add(jSeparator16);

        btnCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_32.png"))); // NOI18N
        btnCloseTab.setText("Đóng Tab");
        btnCloseTab.setFocusable(false);
        btnCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseTabActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCloseTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        tpnBoard.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/icons/home.png")), jPanel1); // NOI18N

        jMenu1.setMnemonic(KeyEvent.VK_F);
        jMenu1.setText("File");

        mnuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login_20.png"))); // NOI18N
        mnuLogin.setText("Đăng nhập");
        mnuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLoginActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogin);
        jMenu1.add(jSeparator5);

        mnuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_20.png"))); // NOI18N
        mnuLogout.setText("Đăng xuất");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogout);
        jMenu1.add(jSeparator7);

        mnuLock.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_20.png"))); // NOI18N
        mnuLock.setText("Khóa");
        mnuLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLockActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLock);
        jMenu1.add(jSeparator8);

        mnuSetting.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting_20.png"))); // NOI18N
        mnuSetting.setText("Cài đặt");
        mnuSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSettingActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSetting);
        jMenu1.add(jSeparator6);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_24.png"))); // NOI18N
        mnuExit.setMnemonic(KeyEvent.VK_X);
        mnuExit.setText("Thoát");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic(KeyEvent.VK_Q

        );
        jMenu2.setText("Quản lý");

        mnuListExpenditureType.setText("Liệt kê loại chi tiêu");
        mnuListExpenditureType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListExpenditureTypeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListExpenditureType);
        jMenu2.add(jSeparator12);

        mnuAddExpenditureType.setText("Thêm mới loại chi tiêu");
        mnuAddExpenditureType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddExpenditureTypeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAddExpenditureType);
        jMenu2.add(jSeparator13);

        mnuListExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listExpenditure_20.png"))); // NOI18N
        mnuListExpenditure.setText("Liệt kê chi tiêu");
        mnuListExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListExpenditureActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListExpenditure);
        jMenu2.add(jSeparator2);

        mnuLAddExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_20.png"))); // NOI18N
        mnuLAddExpenditure.setText("Thêm mới chi tiêu");
        mnuLAddExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLAddExpenditureActionPerformed(evt);
            }
        });
        jMenu2.add(mnuLAddExpenditure);
        jMenu2.add(jSeparator3);

        mnuListReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list_20.png"))); // NOI18N
        mnuListReceipt.setText("Liệt kê nguồn thu");
        mnuListReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListReceiptActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListReceipt);
        jMenu2.add(jSeparator4);

        mnuAddReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_20.png"))); // NOI18N
        mnuAddReceipt.setText("Thêm mới nguồn thu");
        mnuAddReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddReceiptActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAddReceipt);
        jMenu2.add(jSeparator14);

        mnuListReceiptType.setText("Liệt kê loại nguồn thu");
        mnuListReceiptType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListReceiptTypeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListReceiptType);
        jMenu2.add(jSeparator15);

        mnuAddReceiptType.setText("Thêm mới loại nguồn thu");
        mnuAddReceiptType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddReceiptTypeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAddReceiptType);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Hỗ trợ");

        mnuContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help_20.png"))); // NOI18N
        mnuContent.setText("Nội dung");
        jMenu3.add(mnuContent);
        jMenu3.add(jSeparator1);

        mnuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about_20.png"))); // NOI18N
        mnuAboutUs.setText("Thông tin cá nhân");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAboutUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpnBoard)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpnBoard)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExpenditureActionPerformed
        AddExpenditurePane pane = new AddExpenditurePane(this);
        
        //thêm tab "add expenditure" vào bảng trong main
        tpnBoard.add("Thêm mới chi tiêu", pane);
        //Thiết lập hiển thị tab "add expenditure"
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_btnAddExpenditureActionPerformed

    private void btnCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseTabActionPerformed
        int selectedIndex = tpnBoard.getSelectedIndex(); //lấy vị trí đối tượng component đang được lựa chọn
        if(selectedIndex > 0 ) // không xóa tab home (index tab home=0;)
        {
            tpnBoard.remove(selectedIndex);
        }
    }//GEN-LAST:event_btnCloseTabActionPerformed

    private void mnuListExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListExpenditureActionPerformed
        
        //Gọi lại phương thức tạo tab list expenditure
        btnListExpenditureActionPerformed(evt);
    }//GEN-LAST:event_mnuListExpenditureActionPerformed

    private void btnListExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListExpenditureActionPerformed
        // TODO add your handling code here:
        ListExpenditurePane pane = new ListExpenditurePane(this);
        tpnBoard.add("Liệt kê chi tiêu",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_btnListExpenditureActionPerformed

    private void mnuLAddExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLAddExpenditureActionPerformed
        // TODO add your handling code here:
        
        //Gọi lại phương thức tạo tab add expenditure
        btnAddExpenditureActionPerformed(evt);
    }//GEN-LAST:event_mnuLAddExpenditureActionPerformed

    private void btnAddReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReceiptActionPerformed
        AddReceiptPane pane = new AddReceiptPane(this);
        tpnBoard.add("Thêm mới nguồn thu", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_btnAddReceiptActionPerformed

    private void btnListReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListReceiptActionPerformed
        ListReceiptPane pane = new ListReceiptPane(this);
        tpnBoard.add("Liệt kê nguồn thu",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_btnListReceiptActionPerformed

    private void mnuListReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListReceiptActionPerformed
        btnListReceiptActionPerformed(evt);
    }//GEN-LAST:event_mnuListReceiptActionPerformed

    private void mnuAddReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddReceiptActionPerformed
        btnAddReceiptActionPerformed(evt);
    }//GEN-LAST:event_mnuAddReceiptActionPerformed

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        AboutUsDialog dialog = new AboutUsDialog(this,true);
        //Hiển thị Dialog
        dialog.setVisible(true);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void mnuSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSettingActionPerformed
        SettingDialog dialog = new SettingDialog(this,true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mnuSettingActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLoginActionPerformed
        LoginDialog dialog = new LoginDialog(this,true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mnuLoginActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void mnuLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLockActionPerformed
        mnuLogoutActionPerformed(evt);
    }//GEN-LAST:event_mnuLockActionPerformed

    private void btnLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockActionPerformed
        mnuLogoutActionPerformed(evt);
    }//GEN-LAST:event_btnLockActionPerformed

    private void mnuListExpenditureTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListExpenditureTypeActionPerformed
        ListExpenditureTypePane pane = new ListExpenditureTypePane(this);
        tpnBoard.add("Liệt kê loại chi tiêu",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_mnuListExpenditureTypeActionPerformed

    private void mnuAddExpenditureTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddExpenditureTypeActionPerformed
        AddExpenditureTypePane pane = new AddExpenditureTypePane(this);
        tpnBoard.add("Thêm mới loại chi tiêu",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_mnuAddExpenditureTypeActionPerformed

    private void mnuListReceiptTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListReceiptTypeActionPerformed
        ListReceiptTypePane pane = new ListReceiptTypePane(this);
        tpnBoard.add("Liệt kê loại nguồn thu",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_mnuListReceiptTypeActionPerformed

    private void mnuAddReceiptTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddReceiptTypeActionPerformed
        AddReceiptTypePane pane = new AddReceiptTypePane(this);
        tpnBoard.add("Thêm mới loại nguồn thu",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_mnuAddReceiptTypeActionPerformed

    private void btnReportExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportExpenditureActionPerformed
        ReportExpenditurePane pane = new ReportExpenditurePane();
        tpnBoard.add("Báo cáo tài chính",pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_btnReportExpenditureActionPerformed
    
    public void showListExpenditureType(){
        mnuListExpenditureTypeActionPerformed(null);
    }
    
    public void showUpdateExpenditureType(String Id){
        AddExpenditureTypePane pane = new AddExpenditureTypePane(this,Id);
        tpnBoard.add("Chỉnh sửa loại chi tiêu",pane);
        tpnBoard.setSelectedComponent(pane);
    }
    
    public void showListExpenditure()
    {
        mnuListExpenditureActionPerformed(null);
    }
    
    public void showUpdateExpenditure(String Id){
        AddExpenditurePane pane = new AddExpenditurePane(this,Id);
        tpnBoard.add("Chỉnh sửa chi tiêu",pane);
        tpnBoard.setSelectedComponent(pane);
    }
    
    public void showListReceiptType(){
        mnuListReceiptTypeActionPerformed(null);
    }
    
    public void showUpdateReceiptType(String Id){
        AddReceiptTypePane pane = new AddReceiptTypePane(this,Id);
        tpnBoard.add("Chỉnh sửa loại nguồn thu",pane);
        tpnBoard.setSelectedComponent(pane);
    }
    
    public void showListReceipt()
    {
        mnuListReceiptActionPerformed(null);
    }
    
    public void showUpdateReceipt(String Id){
        AddReceiptPane pane = new AddReceiptPane(this,Id);
        tpnBoard.add("Chỉnh sửa nguồn thu",pane);
        tpnBoard.setSelectedComponent(pane);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
                LoginDialog dialog = new LoginDialog(null,true); //parent=null , modal=true;
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExpenditure;
    private javax.swing.JButton btnAddReceipt;
    private javax.swing.JButton btnCloseTab;
    private javax.swing.JButton btnListExpenditure;
    private javax.swing.JButton btnListReceipt;
    private javax.swing.JButton btnLock;
    private javax.swing.JButton btnReportExpenditure;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenuItem mnuAddExpenditureType;
    private javax.swing.JMenuItem mnuAddReceipt;
    private javax.swing.JMenuItem mnuAddReceiptType;
    private javax.swing.JMenuItem mnuContent;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuLAddExpenditure;
    private javax.swing.JMenuItem mnuListExpenditure;
    private javax.swing.JMenuItem mnuListExpenditureType;
    private javax.swing.JMenuItem mnuListReceipt;
    private javax.swing.JMenuItem mnuListReceiptType;
    private javax.swing.JMenuItem mnuLock;
    private javax.swing.JMenuItem mnuLogin;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuSetting;
    private javax.swing.JTabbedPane tpnBoard;
    // End of variables declaration//GEN-END:variables
}
