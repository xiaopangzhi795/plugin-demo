/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @ClassName: MyAction
 * @Decription:
 * @Author: rubik
 *  rubik create MyAction.java of 2022/6/24 08:01
 */
public class MyAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "hello plugin", "title", Messages.getInformationIcon());
    }
}
