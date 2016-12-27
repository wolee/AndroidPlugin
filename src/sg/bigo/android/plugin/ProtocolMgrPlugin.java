package sg.bigo.android.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by lijianfeng on 2016/12/27 下午7:46
 */
public class ProtocolMgrPlugin extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        String s = Messages.showInputDialog(project, "What's your name?", "Hello", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello " + s + "!", "Welcome", Messages.getInformationIcon());
    }
}
