package org.hoshino9.intellijplugin.projects;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleBuilderListener;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.ModuleRootModel;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class HoshinoModuleBuilder extends ModuleBuilder {
	@Override
	public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
		modifiableRootModel.inheritSdk();
		doAddContentEntry(modifiableRootModel);
		System.out.println("setupRootModel");
	}

	@Override
	public ModuleType getModuleType() {
		return HoshinoModuleType.INSTANCE;
	}
}
