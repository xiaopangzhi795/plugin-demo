/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.ui;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 * @ClassName: DemoUI
 * @Decription:
 * @Author: rubik
 *  rubik create DemoUI.java of 2022/6/26 14:10
 */
public class DemoUI {
    private JTextArea textArea1;
    private JPanel panel1;

    public DemoUI() {
        textArea1.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                System.err.println("1111");
            }
        });
    }
}
