package dev.ixor.superuserkamtheme.listeners

import com.intellij.ide.ui.LafManager
import com.intellij.ide.ui.LafManagerListener
import com.intellij.openapi.editor.colors.EditorColorsManager
import dev.ixor.superuserkamtheme.notifications.SettingsNotifications

class ThemeChangeListenerImpl: LafManagerListener {
    private val THEME_NAME = "SuperuserKAM"

    private val editorColorsManager = EditorColorsManager.getInstance()
    private var previousUI = LafManager.getInstance().currentUIThemeLookAndFeel.name

    override fun lookAndFeelChanged(p0: LafManager) {
        val currentUI = p0.currentUIThemeLookAndFeel.name
        if (currentUI != previousUI) {
            if (currentUI == THEME_NAME) {
                editorColorsManager.setGlobalScheme(editorColorsManager.getScheme("_@user_$currentUI"))
            }
        }
        previousUI = currentUI
    }
}
