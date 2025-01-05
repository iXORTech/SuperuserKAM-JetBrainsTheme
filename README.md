<div align="center">

# SuperuserKAM - JetBrains Theme

[![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/iXORTech/SuperuserKAM-JetBrainsTheme/build.yml?style=for-the-badge&logo=github&&label=Build&labelColor=425563&color=80E0A7)](https://github.com/iXORTech/SuperuserKAM-JetBrainsTheme/actions/workflows/build.yml)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID?style=for-the-badge&logo=jetbrains&label=JetBrains%20Plugin&labelColor=425563&color=80E0A7)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID?noRedirect=true)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID?style=for-the-badge&logo=jetbrains&label=Plugin%20Downloads&labelColor=425563&color=80E0A7)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID?noRedirect=true)
[![GitHub License](https://img.shields.io/github/license/iXORTech/SuperuserKAM-JetBrainsTheme?style=for-the-badge&logo=Github&labelColor=425563&color=80E0A7)](https://github.com/ImLynxie/Oxocarbon/blob/master/LICENSE)

</div>

This JetBrains IDE theme is a port to the IntelliJ Platform of the [Visual Studio Code Theme](https://github.com/JSchmiegel/SuperuserKAM-VSCodeTheme), made by [@JSchmiegel](https://github.com/JSchmiegel), originating from his [terminal theme](https://github.com/JSchmiegel/ColorSchemeSuperuserKAM) to match with the SuperuserKAM keycap design by [FreshFromTheGrave](https://geekhack.org/index.php?topic=108326.0%3Futm_source%3Dkeycapsets).

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Get familiar with the [template documentation][template].
- [x] Adjust the [pluginGroup](./gradle.properties) and [pluginName](./gradle.properties), as well as the [id](./src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [x] Adjust the plugin description in `README` (see [Tips][docs:plugin-description])
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html?from=IJPluginTemplate).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the `MARKETPLACE_ID` in the above README badges. You can obtain it once the plugin is published to JetBrains Marketplace.
- [ ] Set the [Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html?from=IJPluginTemplate) related [secrets](https://github.com/JetBrains/intellij-platform-plugin-template#environment-variables).
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html?from=IJPluginTemplate).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
This Fancy IntelliJ Platform Plugin is going to be your implementation of the brilliant ideas that you have.

This specific section is a source for the [plugin.xml](/src/main/resources/META-INF/plugin.xml) file which will be extracted by the [Gradle](/build.gradle.kts) during the build process.

To keep everything working, do not remove `<!-- ... -->` sections. 
<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "SuperuserKAMTheme"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/iXORTech/SuperuserKAMTheme/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
