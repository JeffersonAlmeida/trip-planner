package org.apache.shiro.grails
            
import org.gradle.api.Plugin 
import org.gradle.api.Project
    
class ShiroBuildPlugin implements Plugin<Project> {
    void apply(Project project) {
        def pluginProject = project.currentPlugin
        project.dependencies {
            compile pluginProject.sourceSets.main.classes, pluginProject.sourceSets.main.compileClasspath
        } 
    }       
}           
