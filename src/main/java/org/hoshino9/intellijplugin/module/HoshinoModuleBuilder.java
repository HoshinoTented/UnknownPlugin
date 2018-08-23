package org.hoshino9.intellijplugin.module;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.Nullable;

public class HoshinoModuleBuilder extends ModuleBuilder {
	@Override
	public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
//		modifiableRootModel.inheritSdk();
		doAddContentEntry(modifiableRootModel);
	}

	@Nullable
	@Override
	public ModuleWizardStep getCustomOptionsStep(WizardContext context, Disposable parentDisposable) {
		return new HoshinoModuleWizard();
	}

	@Override
	public ModuleType getModuleType() {
		return HoshinoModuleType.INSTANCE;
	}
}
