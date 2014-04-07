package jetbrains.teamcity.rest.client.hl

import jetbrains.teamcity.rest.client.TeamCityClient
import jetbrains.teamcity.rest.client.model.Project
import jetbrains.teamcity.rest.client.model.BuildTypes
import jetbrains.teamcity.rest.client.model.Projects
import jetbrains.teamcity.rest.client.model.VcsRoots
import jetbrains.teamcity.rest.client.resources.Locator


public class TCProject(client: TeamCityClient, val model: Project) : ClientAware(client) {

    // TODO: Replace HL build types
    public fun getBuildTypes(): BuildTypes {
        return model.buildTypes!!
    }

    // TODO: Replace HL vcs roots
    public fun getVcsRoots(): VcsRoots {
        //        "vcs-roots/?locator=project:(id:_Root)"
        return client.getVcsRootsResource().getRoots(Locator.simple("project:(id:${model.id!!})"))!!
    }

    public fun getProjects(): Projects {
        return model.projects?:Projects();
    }

    public fun getId(): String {
        return model.id!!
    }

    public fun getInternalId(): String {
        return model.internalId!!
    }

    public fun getName(): String {
        return model.name!!
    }

    public fun getParentProjectId(): String? {
        return model.parentProjectId
    }

    public fun getWebUrl(): String {
        return model.webUrl!!
    }

    override fun hashCode(): Int {
        return super<ClientAware>.hashCode() + (model.id?.hashCode()?:0);
    }
    override fun equals(other: Any?): Boolean {
        if (other == null) return false;
        if (!(other is TCProject)) return false;
        return client.equals(other.client) && model.id.equals(other.model.id);
    }

    override fun toString(): String {
        return "TCProject (id=${model.id})";
    }
}
