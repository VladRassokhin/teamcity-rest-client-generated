package org.jetbrains.teamcity.rest.client.model
import com.google.api.client.util.Key

/**
 * @author Vladislav.Rassokhin
 */


public class BuildType {
    Key public var id: String? = null
    Key public var name: String? = null
    Key public var projectId: String? = null
    Key public var project: BuildProject? = null

    public fun getPID(): String? {
        return  projectId?:project?.id
    }
}
