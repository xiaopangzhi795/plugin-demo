/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.action;

import com.geek45.plugin.ui.TestPanel;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.components.JBLabel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: PopupAction
 * @Decription:
 * @Author: rubik
 *  rubik create PopupAction.java of 2022/6/26 15:41
 */
public class PopupAction extends AnAction {
    TestPanel testPanel = new TestPanel();
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        JBPopupFactory instance = JBPopupFactory.getInstance();
        //新建Button放到自定义弹框中
        instance.createComponentPopupBuilder(testPanel.getPanel1(), new JBLabel())
                .setTitle("hello")
                .setMovable(true)
                .setResizable(true)
                .setNormalWindowLevel(false)
                .setMinSize(new Dimension(600, 300))
                .createPopup()
                .showInFocusCenter();

    }

    class Table extends JTable{

    }
}
