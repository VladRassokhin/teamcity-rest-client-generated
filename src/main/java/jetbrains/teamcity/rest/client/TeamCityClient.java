package jetbrains.teamcity.rest.client;

import jetbrains.teamcity.rest.client.resources.*;
import org.jetbrains.annotations.NotNull;

public interface TeamCityClient {
    @NotNull
    AgentPoolsResource getAgentPoolsResource();

    @NotNull
    AgentsResource getAgentsResource();

    @NotNull
    BuildQueueResource getBuildQueueResource();

    @NotNull
    BuildTypesResource getBuildTypesResource();

    @NotNull
    BuildsResource getBuildsResource();

    @NotNull
    ChangesResource getChangesResource();

    @NotNull
    DebugResource getDebugResource();

    @NotNull
    InvestigationsResource getInvestigationsResource();

    @NotNull
    ProblemOccurrencesResource getProblemOccurrencesResource();

    @NotNull
    ProblemsResource getProblemsResource();

    @NotNull
    ProjectsResource getProjectsResource();

    @NotNull
    RootResource getRootResource();

    @NotNull
    ServerResource getServerResource();

    @NotNull
    TestOccurrencesResource getTestOccurrencesResource();

    @NotNull
    TestsResource getTestsResource();

    @NotNull
    UserGroupsResource getUserGroupsResource();

    @NotNull
    UsersResource getUsersResource();

    @NotNull
    VcsRootInstancesResource getVcsRootInstancesResource();

    @NotNull
    VcsRootsResource getVcsRootsResource();
}
