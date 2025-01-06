package dev.ixor.superuserkamtheme.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil

@State(name = "OxocarbonVersionSettings", storages = [(Storage("OxocarbonSettings.xml"))])
class SuperuserThemeVersionSettings private constructor(): PersistentStateComponent<SuperuserThemeVersionSettings> {

    var version: String? = this.state.version

    override fun getState() = this

    override fun loadState(versionSettings: SuperuserThemeVersionSettings) {
        XmlSerializerUtil.copyBean(versionSettings, this)
    }

    companion object {
        val instance: SuperuserThemeVersionSettings
            get() = ApplicationManager.getApplication().getService(SuperuserThemeVersionSettings::class.java)
    }
}
