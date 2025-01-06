package dev.ixor.superuserkamtheme.activities

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import com.intellij.openapi.util.registry.Registry
import dev.ixor.superuserkamtheme.SuperuserThemeManager
import dev.ixor.superuserkamtheme.notifications.SettingsNotifications
import dev.ixor.superuserkamtheme.settings.SuperuserThemeVersionSettings

class SuperuserThemeStartupActivity: ProjectActivity {
    override suspend fun execute(project: Project) {
        removeDefaultBlankEditorText()
        sendStartupNotifications(project)
    }

    private fun removeDefaultBlankEditorText() {
        Registry.get("editor.paint.empty.text").setValue(false)
    }

    private fun sendStartupNotifications(project: Project) {
        val currentPluginVersion: String = SuperuserThemeManager.currentVersion
        val versionSettingsInstance: SuperuserThemeVersionSettings = SuperuserThemeVersionSettings.instance

        if (versionSettingsInstance.version == null || versionSettingsInstance.version!!.isEmpty()) {
            versionSettingsInstance.version = currentPluginVersion
            SettingsNotifications.notifyWelcome(project)
            SettingsNotifications.notifyWorkInProgress(project)
        }
    }
}
