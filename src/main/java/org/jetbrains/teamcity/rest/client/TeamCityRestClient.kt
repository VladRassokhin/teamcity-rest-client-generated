package org.jetbrains.teamcity.rest.client

import com.google.api.client.http.HttpStatusCodes
import org.jetbrains.teamcity.rest.client.model.*

/**
 * @author Vladislav.Rassokhin
 */

public class TeamCityRestClient(val config: ConnectionConfig) {
    class object {
        private val builder = UrlBuilder()
        private val http = HTTP()
    }

    public fun getBuildTypes(projectId: String): Collection<BuildType> {
        val url = builder.getBuildTypesUrl(config, projectId)
        val types = http.getAs(url, javaClass<BuildTypes>())
        return types.buildTypes!!.filterNotNull()
    }

    public fun getBuildProjects(config: ConnectionConfig): Collection<BuildProject> {
        val url = builder.getBuildProjectsUrl(config)
        val ret = http.getAs(url, javaClass<BuildProjects>())
        return ret.projects!!.filterNotNull()
    }

    public fun isBuildProjectExist(id: String): Boolean {
        val url = builder.getBuildProjectUrl(config, id)
        return http.head(url).getStatusCode() == HttpStatusCodes.STATUS_CODE_OK;
    }

    public fun getBuildProject(id: String): BuildProject {
        val url = builder.getBuildProjectUrl(config, id)
        return http.getAs(url, javaClass<BuildProject>())
    }

    public fun isBuildTypeExist(id: String): Boolean {
        val url = builder.getBuildTypeUrl(config, id)
        return http.head(url).getStatusCode() == HttpStatusCodes.STATUS_CODE_OK;
    }

    public fun getBuildType(id: String): BuildType {
        val url = builder.getBuildTypeUrl(config, id)
        return http.getAs(url, javaClass<BuildType>())
    }

    public fun getLatestBuild(btid: String): Build {
        val url = builder.getLastBuildUrl(config, btid)
        return http.getAs(url, javaClass<Build>())
    }

    public fun getBuildById(id: String): Build {
        val url = builder.getBuildByIdUrl(config, id)
        return http.getAs(url, javaClass<Build>())
    }

    public fun getBuildRefs(btid: String): BuildRefs {
        val url = builder.getBuildRefs(config, btid)
        return http.getAs(url, javaClass<BuildRefs>())
    }
}
