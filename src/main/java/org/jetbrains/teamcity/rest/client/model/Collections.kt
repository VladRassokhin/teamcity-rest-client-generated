package org.jetbrains.teamcity.rest.client.model

import com.google.api.client.util.Key

/**
 * @author Vladislav.Rassokhin
 */

public class BuildProjects {
    Key("project") public var projects: Array<BuildProject?>? = null
}

public class BuildTypes {
    Key("buildType") public var buildTypes: Array<BuildType?>? = null
}

public class BuildRefs {
    Key("build") public var buildrefs: Array<BuildRef?>? = null
    Key("count") public var count: Int? = null
    Key("nextHref") public var next: String? = null
}