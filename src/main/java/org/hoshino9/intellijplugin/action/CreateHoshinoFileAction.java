package org.hoshino9.intellijplugin.action;

import org.hoshino9.intellijplugin.HoshinoIcons;
import org.hoshino9.intellijplugin.language.HoshinoLanguage;
import org.jetbrains.annotations.Nullable;

public class CreateHoshinoFileAction extends com.intellij.ide.actions.CreateFileAction {
	public CreateHoshinoFileAction() {
		super("Hoshino File", "Create a Hoshino File", HoshinoIcons.hoshino);
	}

	@Nullable
	@Override
	protected String getDefaultExtension() {
		return HoshinoLanguage.EXTENSTION;
	}
}
