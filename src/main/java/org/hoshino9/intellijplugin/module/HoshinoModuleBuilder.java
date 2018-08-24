package org.hoshino9.intellijplugin.module;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.vfs.VirtualFile;
import org.hoshino9.intellijplugin.HoshinoSetting;
import org.hoshino9.intellijplugin.language.HoshinoLanguage;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class HoshinoModuleBuilder extends ModuleBuilder {
	public HoshinoSetting setting = new HoshinoSetting();

	@Override
	public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
		doAddContentEntry(modifiableRootModel);
		ContentEntry entry = modifiableRootModel.getContentEntries()[0];
		try {
			VirtualFile moduleRoot = entry.getFile();
			if (moduleRoot != null) moduleRoot.findOrCreateChildData(modifiableRootModel.getModule(), setting.name + "." + HoshinoLanguage.EXTENSTION);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Nullable
	@Override
	public ModuleWizardStep getCustomOptionsStep(WizardContext context, Disposable parentDisposable) {
		return new HoshinoModuleWizard(this);
	}

//	@Override
//	public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
//		int size = 50;
//		HoshinoModuleWizard[] wizards = new HoshinoModuleWizard[size];
//		for (int i = 0; i < size; ++ i) {
//			wizards[i] = new HoshinoModuleWizard();
//		}
//
//		return wizards;
//	}

	@Override
	public ModuleType getModuleType() {
		return HoshinoModuleType.INSTANCE;
	}
}
