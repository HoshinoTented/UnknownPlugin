package org.hoshino9.intellijplugin.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.hoshino9.intellijplugin.HoshinoIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public final class HoshinoFileType extends LanguageFileType {
	public static final HoshinoFileType INSTANCE = new HoshinoFileType();

	private HoshinoFileType() {
		super(HoshinoLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return HoshinoLanguage.NAME;
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Hoshino File";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return HoshinoLanguage.EXTENSTION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return HoshinoIcons.hoshino;
	}
}
