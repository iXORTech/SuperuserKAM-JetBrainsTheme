package dev.ixor.superuserkamtheme.notifications

import com.intellij.ide.BrowserUtil
import com.intellij.notification.NotificationAction
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import org.intellij.lang.annotations.Language


class SettingsNotifications {
    companion object {
        private const val NOTIFICATION_GROUP_ID = "SuperuserKAM Theme Settings"
        private const val GITHUB_LINK: String = "https://github.com/iXORTech/SuperuserKAM-JetBrainsTheme"

        @Language("HTML")
        private const val WELCOME_MESSAGE: String = "<p>Thank you for using SuperuserKAM - JetBrains Theme!</p>"

        @Language("HTML")
        private const val WIP_MESSAGE: String =
            "<p>This theme is currently a work in progress, some things may not look correctly, or may not appear at all! If you notice anything that seems incorrect, please submit a ticket on GitHub!"

//        private val pluginIcon: Icon = IconLoader.getIcon("/META-INF/pluginIcon.svg", SettingsNotifications::class.java)

        @Suppress("DialogTitleCapitalization")
        fun notifyWelcome(project: Project) {
            NotificationGroupManager.getInstance().getNotificationGroup(NOTIFICATION_GROUP_ID).createNotification(
                "SuperuserKAM Theme Installed", WELCOME_MESSAGE, NotificationType.INFORMATION
            )
//                .setIcon(pluginIcon)
                .notify(project)
        }

        @Suppress("DialogTitleCapitalization")
        fun notifyWorkInProgress(project: Project) {
            NotificationGroupManager.getInstance().getNotificationGroup(NOTIFICATION_GROUP_ID).createNotification(
                "SuperuserKAM Theme - Work in Progress", WIP_MESSAGE, NotificationType.WARNING
            )
//                .setIcon(pluginIcon)
                .addAction(NotificationAction.createSimple("GitHub") { BrowserUtil.browse(GITHUB_LINK) })
                .notify(project)
        }
    }
}
