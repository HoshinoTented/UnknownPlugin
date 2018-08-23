package org.hoshino9.intellijplugin.module;

import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import org.hoshino9.intellijplugin.HoshinoIcon;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class HoshinoModuleType extends ModuleType<HoshinoModuleBuilder> {
	public static final String MODULE_ID = "HOSHINO_MODULE_TYPE";
	public static final ModuleType INSTANCE = ModuleTypeManager.getInstance().findByID(MODULE_ID);

	public HoshinoModuleType() {
		super(MODULE_ID);
	}

	@NotNull
	@Override
	public HoshinoModuleBuilder createModuleBuilder() {
		return new HoshinoModuleBuilder();
	}

	@NotNull
	@Override
	public String getName() {
		return "Hoshino";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Hoshino Project";
	}

	@Override
	public Icon getNodeIcon(boolean isOpened) {
		return HoshinoIcon.hoshino;
	}
}
