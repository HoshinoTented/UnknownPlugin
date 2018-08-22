package org.hoshino9.intellijplugin.projects;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.DirectoryProjectGeneratorBase;
import org.hoshino9.intellijplugin.LispSettings;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.IOException;

public class LispProjectType extends DirectoryProjectGeneratorBase<LispSettings> {
	@Nls
	@NotNull
	@Override
	public String getName() {
		return "Lisp";
	}

	@Nullable
	@Override
	public Icon getLogo() {
		return null;
	}


	@Override
	public void generateProject(@NotNull Project project, @NotNull VirtualFile baseDir, @NotNull LispSettings settings, @NotNull Module module) {
		try {
			baseDir.createChildData(this, "README.md");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
