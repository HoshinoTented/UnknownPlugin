package org.hoshino9.intellijplugin.module.ui;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public abstract class HoshinoModuleWizardUI extends ModuleWizardStep {
	protected JPanel mainPanel;
	protected JTextField name;
}
