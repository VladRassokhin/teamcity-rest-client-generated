package org.jetbrains.teamcity.rest.client.model

import com.google.api.client.util.Key

/**
 * @author Vladislav.Rassokhin
 */


public class Build {
    Key public var id: Int? = null
    Key public var number: String? = null
    Key public var status: Status? = null
    Key public var history: Boolean? = null
    Key public var pinned: Boolean? = null
    Key public var personal: Boolean? = null
    Key public var statusText: String? = null

    Key public var buildType: BuildType? = null

    Key public var href: String? = null
    Key public var webUrl: String? = null
}

public class BuildRef {
    Key public var id: Int? = null
    Key public var number: String? = null
    Key public var status: Status? = null

    Key public var buildTypeId: String? = null

    Key public var href: String? = null
    Key public var webUrl: String? = null
}
