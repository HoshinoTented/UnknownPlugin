package org.hoshino9.intellijplugin.projects;

import org.hoshino9.intellijplugin.LispSettings;
import org.hoshino9.intellijplugin.projects.ui.LispProjectUI;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class LispProjectUIImpl extends LispProjectUI {
	private LispSettings settings = new LispSettings();

	// 这个不是很懂。。
	@NotNull
	@Override
	public JComponent getComponent() {
		return this.mainPanel;
	}

	@Override
	public void updateDataModel() {

	}


}
