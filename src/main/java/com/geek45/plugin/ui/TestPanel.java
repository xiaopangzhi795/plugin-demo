/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName: TestPanel
 * @Decription:
 * @Author: rubik
 *  rubik create TestPanel.java of 2022/6/26 15:50
 */
public class TestPanel {
    private JList list1;
    private JButton 确定Button;
    private JPanel panel1;
    private JCheckBox serviceCheckBox;
    private JCheckBox mapperCheckBox;
    private JCheckBox entityCheckBox;
    private JCheckBox controllerCheckBox;
    private JCheckBox modelCheckBox;


    public TestPanel() {
        PopupMenu popupMenu = new PopupMenu();
        MenuItem menuItem = new MenuItem();
        menuItem.setLabel("41234");
        popupMenu.add(menuItem);
        serviceCheckBox.add(popupMenu);
        确定Button.addActionListener(this::clickGenerator);
    }

    public JList getList1() {
        return list1;
    }

    public JButton get确定Button() {
        return 确定Button;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void clickGenerator(ActionEvent actionEvent) {
        System.err.println("点击了确认按钮");
        System.err.println(serviceCheckBox.isSelected());
        System.err.println(entityCheckBox.isSelected());
        System.err.println(controllerCheckBox.isSelected());
        System.err.println(modelCheckBox.isSelected());
        System.err.println(mapperCheckBox.isSelected());
    }
}
