package org.hoshino9.intellijplugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class HelloAction extends AnAction {
	@Override
	public void actionPerformed(AnActionEvent e) {
		System.out.println("Hello world!");
	}
}
