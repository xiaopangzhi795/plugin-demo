/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    public TestPanel() {
        确定Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.err.println("okkk");
            }
        });
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
}
