package org.hoshino9.intellijplugin.language;

import com.intellij.lang.Language;

public final class HoshinoLanguage extends Language {
	public static final HoshinoLanguage INSTANCE = new HoshinoLanguage();
	public static final String NAME = "Hoshino";
	public static final String EXTENSTION = "hsn";

	private HoshinoLanguage() {
		super(NAME);
	}
}
