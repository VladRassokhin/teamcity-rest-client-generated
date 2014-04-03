package jetbrains.teamcity.rest.client.impl;

import jetbrains.teamcity.rest.client.TeamCityClient;
import jetbrains.teamcity.rest.client.resources.*;
import jetbrains.teamcity.rest.client.resources.impl.*;
import org.jetbrains.annotations.NotNull;

public class TeamCityClientImpl implements TeamCityClient {
    @NotNull
    @Override
    public AgentPoolsResource getAgentPoolsResource() {
        return new AgentPoolsResourceImpl();
    }

    @NotNull
    @Override
    public AgentsResource getAgentsResource() {
        return new AgentsResourceImpl();
    }

    @NotNull
    @Override
    public BuildQueueResource getBuildQueueResource() {
        return new BuildQueueResourceImpl();
    }

    @NotNull
    @Override
    public BuildTypesResource getBuildTypesResource() {
        return new BuildTypesResourceImpl();
    }

    @NotNull
    @Override
    public BuildsResource getBuildsResource() {
        return new BuildsResourceImpl();
    }

    @NotNull
    @Override
    public ChangesResource getChangesResource() {
        return new ChangesResourceImpl();
    }

    @NotNull
    @Override
    public DebugResource getDebugResource() {
        return new DebugResourceImpl();
    }

    @NotNull
    @Override
    public InvestigationsResource getInvestigationsResource() {
        return new InvestigationsResourceImpl();
    }

    @NotNull
    @Override
    public ProblemOccurrencesResource getProblemOccurrencesResource() {
        return new ProblemOccurrencesResourceImpl();
    }

    @NotNull
    @Override
    public ProblemsResource getProblemsResource() {
        return new ProblemsResourceImpl();
    }

    @NotNull
    @Override
    public ProjectsResource getProjectsResource() {
        return new ProjectsResourceImpl();
    }

    @NotNull
    @Override
    public RootResource getResource() {
        return new RootResourceImpl();
    }

    @NotNull
    @Override
    public ServerResource getServerResource() {
        return new ServerResourceImpl();
    }

    @NotNull
    @Override
    public TestOccurrencesResource getTestOccurrencesResource() {
        return new TestOccurrencesResourceImpl();
    }

    @NotNull
    @Override
    public TestsResource getTestsResource() {
        return new TestsResourceImpl();
    }

    @NotNull
    @Override
    public UserGroupsResource getUserGroupsResource() {
        return new UserGroupsResourceImpl();
    }

    @NotNull
    @Override
    public UsersResource getUsersResource() {
        return new UsersResourceImpl();
    }

    @NotNull
    @Override
    public VcsRootInstancesResource getVcsRootInstancesResource() {
        return new VcsRootInstancesResourceImpl();
    }

    @NotNull
    @Override
    public VcsRootsResource getVcsRootsResource() {
        return new VcsRootsResourceImpl();
    }
}
