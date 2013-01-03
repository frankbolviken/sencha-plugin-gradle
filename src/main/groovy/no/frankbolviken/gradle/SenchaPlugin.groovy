package no.frankbolviken.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project


class SenchaPluginExtension {
    String webappName = "app"
    String workingDir = "src/main/webapp"
}
/**
 * Sencha plugin for Gradle. Enabling building sencha apps with gradle.
 */
class SenchaPlugin implements Plugin<Project> {
    @Override
    def void apply(Project project) {
        project.extensions.create("senchaArgs", SenchaPluginExtension)
        project.task('sencha', type: SenchaTask)
    }
}
