package org.hoshino9.intellijplugin.action;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import org.hoshino9.intellijplugin.HoshinoIcons;

public class CreateHoshinoFileFromTemplate extends CreateFileFromTemplateAction {
	public static final String NAME = "Hoshino File From Template";

	public CreateHoshinoFileFromTemplate() {
		super(CreateHoshinoFileFromTemplate.NAME, "Create Hoshino File From Template", HoshinoIcons.hoshino_file);
	}

	@Override
	protected void buildDialog(Project project, PsiDirectory directory, CreateFileFromTemplateDialog.Builder builder) {
		builder
				.setTitle(NAME)
				.addKind("File", HoshinoIcons.hoshino_file, "Hoshino_File")
				.addKind("Hoshino", HoshinoIcons.hoshino, "Hoshino_Hoshino");
	}

	@Override
	protected String getActionName(PsiDirectory directory, String newName, String templateName) {
		return CreateHoshinoFileFromTemplate.NAME;
	}
}
