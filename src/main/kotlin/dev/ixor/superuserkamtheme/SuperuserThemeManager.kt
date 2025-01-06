package dev.ixor.superuserkamtheme

import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.openapi.extensions.PluginId
import java.util.*

class SuperuserThemeManager {
    companion object {
        private const val PLUGIN_ID : String = "dev.ixor.superuserkam-theme"

        val currentVersion : String
            get() = Objects.requireNonNull(PluginManagerCore.getPlugin(PluginId.getId(PLUGIN_ID))?.version ?: "")
    }
}
