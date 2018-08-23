package org.hoshino9.intellijplugin.module;

import org.hoshino9.intellijplugin.module.ui.ModuleWizardUI;

import javax.swing.*;

public class HoshinoModuleWizard extends ModuleWizardUI {
	public HoshinoModuleWizard() {

	}

	@Override
	public JComponent getComponent() {
		return this.mainPanel;
	}

	@Override
	public void updateDataModel() {
		//TODO
	}
}
