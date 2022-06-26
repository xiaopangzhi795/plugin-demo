/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.factory;

import com.geek45.plugin.ui.DemoUI;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @ClassName: ReadFactory
 * @Decription:
 * @Author: rubik
 *  rubik create ReadFactory.java of 2022/6/26 15:18
 */
public class ReadFactory implements ToolWindowFactory {

    DemoUI demoUI = new DemoUI();

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(demoUI.getPanel1(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
