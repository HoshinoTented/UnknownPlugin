package org.hoshino9.intellijplugin.module;

import org.hoshino9.intellijplugin.HoshinoSetting;
import org.hoshino9.intellijplugin.module.ui.HoshinoModuleWizardUI;

import javax.swing.*;

public class HoshinoModuleWizard extends HoshinoModuleWizardUI {
	private HoshinoModuleBuilder builder;

	public HoshinoModuleWizard(HoshinoModuleBuilder builder) {
		this.builder = builder;
	}

	@Override
	public JComponent getComponent() {
		return this.mainPanel;
	}

	@Override
	public void updateDataModel() {
		builder.setting.name = this.name.getText();
	}
}
