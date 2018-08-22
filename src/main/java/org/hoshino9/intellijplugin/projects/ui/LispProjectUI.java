package org.hoshino9.intellijplugin.projects.ui;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public abstract class LispProjectUI extends ModuleWizardStep {
	protected JTextField name;
	protected JPanel mainPanel;
}
