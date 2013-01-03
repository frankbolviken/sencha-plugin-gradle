package no.frankbolviken.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SenchaTask extends DefaultTask {

    @TaskAction
    def doBuild() {
        println "============== Sencha build ==============="
        println "WebappName:  ${project.senchaArgs.webappName}"
        println "workingDir:  ${project.senchaArgs.workingDir}"
    }
}
