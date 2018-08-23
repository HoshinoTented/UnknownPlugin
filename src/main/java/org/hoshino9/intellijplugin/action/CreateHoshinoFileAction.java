package org.hoshino9.intellijplugin.action;

import org.hoshino9.intellijplugin.HoshinoIcons;

public class CreateHoshinoFileAction extends com.intellij.ide.actions.CreateFileAction {
	public CreateHoshinoFileAction() {
		super("Hoshino File", "Create a Hoshino File", HoshinoIcons.hoshino);
	}
}
