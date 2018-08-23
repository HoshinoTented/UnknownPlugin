package org.hoshino9.intellijplugin.module;

import org.hoshino9.intellijplugin.module.ui.HoshinoModuleWizardUI;

import javax.swing.*;

public class HoshinoModuleWizard extends HoshinoModuleWizardUI {
	@Override
	public JComponent getComponent() {
		return this.mainPanel;
	}

	@Override
	public void updateDataModel() {
		System.out.println("Hello world!");
	}
}
