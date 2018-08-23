package org.hoshino9.intellijplugin.projects;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleBuilderListener;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class HoshinoModuleBuilder extends ModuleBuilder implements ModuleBuilderListener {
	@Override
	public void moduleCreated(@NotNull Module module) {
		ModuleRootManager root = ModuleRootManager.getInstance(module);
		ModifiableRootModel modifiableModel = root.getModifiableModel();
		ContentEntry contentEntries = modifiableModel.getContentEntries()[0];
		VirtualFile baseDir = module.getProject().getBaseDir();
		VirtualFile src = baseDir.findChild("src");

		try {
			contentEntries.addSourceFolder(
					src == null ? baseDir.createChildDirectory(module, "src") : src,
					false);
		} catch (IOException e) {
			e.printStackTrace();
		}

		modifiableModel.commit();
	}

	@Override
	public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
		//do nothing
	}

	@Override
	public ModuleType getModuleType() {
		return HoshinoModuleType.INSTANCE;
	}
}
