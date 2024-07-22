package com.github.huangkl1024.defaultjvmargs.project

import java.util.Objects


class ModuleJvmArgsItem () {
    var enable: Boolean? = true
    var moduleName: String? = null
    var jvmArgs: String? = null

    constructor(moduleName: String?, jvmArgs: String?):this() {
        this.moduleName = moduleName
        this.jvmArgs = jvmArgs
    }
    constructor(enable:Boolean?, moduleName: String?, jvmArgs: String?):this() {
        if(Objects.nonNull(enable)) {
            this.enable = enable
        }
        this.moduleName = moduleName
        this.jvmArgs = jvmArgs
    }



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModuleJvmArgsItem

        if (enable != other.enable) return false
        if (moduleName != other.moduleName) return false
        if (jvmArgs != other.jvmArgs) return false

        return true
    }

    override fun hashCode(): Int {
        var result = enable?.hashCode() ?: 0
        result = 31 * result + (moduleName?.hashCode() ?: 0)
        result = 31 * result + (jvmArgs?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "ModuleJvmArgsItem(enable=$enable, moduleName=$moduleName, jvmArgs=$jvmArgs)"
    }


}
