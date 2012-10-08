package org.jetbrains.teamcity.rest.client

/**
 * @author Vladislav.Rassokhin
 */
public class UrlBuilder {

    public fun getBuildProjectsUrl(config: ConnectionConfig): String {
        return config.getRestUrl() + "/projects"
    }

    public fun getBuildProjectUrl(config: ConnectionConfig, id: String): String {
        return config.getRestUrl() + "/projects/id:${id}"
    }

    public fun getBuildTypeUrl(config: ConnectionConfig, id: String): String {
        return config.getRestUrl() + "/buildTypes/id:${id}"
    }

    public fun getBuildTypesUrl(config: ConnectionConfig, projectId: String): String {
        return config.getRestUrl() + "/projects/id:${projectId}/buildTypes"
    }

    public fun getLastBuildUrl(config: ConnectionConfig, buildTypeId: String): String {
        return config.getRestUrl() + "/builds/buildType:${buildTypeId}"
    }
    public fun getBuildByIdUrl(config: ConnectionConfig, id: String): String {
        return config.getRestUrl() + "/builds/id:${id}"
    }

    public fun getBuildRefs(config: ConnectionConfig, buildTypeId: String): String {
        return config.getRestUrl() + "/builds?buildType:${buildTypeId}"
    }
}
