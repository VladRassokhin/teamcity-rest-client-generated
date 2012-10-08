package org.jetbrains.teamcity.rest.client.model

import com.google.api.client.util.Key

/**
 * @author Vladislav.Rassokhin
 */


public class BuildProject {
    [Key("id")] public var id: String? = null
    [Key("name")] public var name: String? = null

    public var description: String? = null
}