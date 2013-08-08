package no.frankbolviken.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SenchaTask extends DefaultTask {

    @TaskAction
    def doBuild() {
        println "============== Sencha build properties ==============="
        println "WebappName:  ${project.sencha.webappName}"
        println "workingDir:  ${project.sencha.webappDir}"
        println "environment:  ${project.sencha.environment}"
        println "============== End properties ==============="

        def ant = new AntBuilder()
        ant.exec(failonerror: "true",
                dir: "${project.sencha.webappDir}",
                executable: 'sencha') {
                    arg(line:"app build ${project.sencha.environment}")
                }

        project.tasks.getByName('war').configure {
            from "${project.sencha.webappDir}/build/${project.sencha.webappName}/${project.sencha.environment}"
            include 'index.html', 'all-classes.js', 'resources/'
            exclude '.sass-cache', '*.scss'
        }
    }
}