package com.github.mhssn95.stringsplugin.services

import com.intellij.openapi.project.Project
import com.github.mhssn95.stringsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
