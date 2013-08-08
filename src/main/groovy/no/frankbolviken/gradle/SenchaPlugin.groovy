package no.frankbolviken.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project


class SenchaPluginExtension {
    String webappName = "app"
    String webappDir = "."
    String environment = "production"
}
/**
 * Sencha plugin for Gradle. Enabling building sencha apps with gradle.
 */
class SenchaPlugin implements Plugin<Project> {
    @Override
    def void apply(Project project) {
        project.extensions.create("sencha", SenchaPluginExtension)
        project.task('sencha', type: SenchaTask, description: "Utilize Sencha CMD to minify app, and build war with it's sources")
        project.tasks.getByName('war').dependsOn('sencha')
    }
}
