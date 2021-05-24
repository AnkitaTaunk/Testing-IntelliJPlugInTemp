package com.github.ankitataunk.testingintellijplugintemp.services

import com.github.ankitataunk.testingintellijplugintemp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
