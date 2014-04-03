package jetbrains.teamcity.rest.client.impl;

import jetbrains.teamcity.rest.client.TeamCityClient;
import jetbrains.teamcity.rest.client.resources.*;
import jetbrains.teamcity.rest.client.resources.impl.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

public class TeamCityClientImpl implements TeamCityClient {
    @NotNull protected final RequestsProcessor processor;

    public TeamCityClientImpl(@NotNull final RequestsProcessor processor) {
        this.processor = processor;
    }

    @NotNull
    @Override
    public AgentPoolsResource getAgentPoolsResource() {
        return new AgentPoolsResourceImpl(processor);
    }

    @NotNull
    @Override
    public AgentsResource getAgentsResource() {
        return new AgentsResourceImpl(processor);
    }

    @NotNull
    @Override
    public BuildQueueResource getBuildQueueResource() {
        return new BuildQueueResourceImpl(processor);
    }

    @NotNull
    @Override
    public BuildTypesResource getBuildTypesResource() {
        return new BuildTypesResourceImpl(processor);
    }

    @NotNull
    @Override
    public BuildsResource getBuildsResource() {
        return new BuildsResourceImpl(processor);
    }

    @NotNull
    @Override
    public ChangesResource getChangesResource() {
        return new ChangesResourceImpl(processor);
    }

    @NotNull
    @Override
    public DebugResource getDebugResource() {
        return new DebugResourceImpl(processor);
    }

    @NotNull
    @Override
    public InvestigationsResource getInvestigationsResource() {
        return new InvestigationsResourceImpl(processor);
    }

    @NotNull
    @Override
    public ProblemOccurrencesResource getProblemOccurrencesResource() {
        return new ProblemOccurrencesResourceImpl(processor);
    }

    @NotNull
    @Override
    public ProblemsResource getProblemsResource() {
        return new ProblemsResourceImpl(processor);
    }

    @NotNull
    @Override
    public ProjectsResource getProjectsResource() {
        return new ProjectsResourceImpl(processor);
    }

    @NotNull
    @Override
    public RootResource getResource() {
        return new RootResourceImpl(processor);
    }

    @NotNull
    @Override
    public ServerResource getServerResource() {
        return new ServerResourceImpl(processor);
    }

    @NotNull
    @Override
    public TestOccurrencesResource getTestOccurrencesResource() {
        return new TestOccurrencesResourceImpl(processor);
    }

    @NotNull
    @Override
    public TestsResource getTestsResource() {
        return new TestsResourceImpl(processor);
    }

    @NotNull
    @Override
    public UserGroupsResource getUserGroupsResource() {
        return new UserGroupsResourceImpl(processor);
    }

    @NotNull
    @Override
    public UsersResource getUsersResource() {
        return new UsersResourceImpl(processor);
    }

    @NotNull
    @Override
    public VcsRootInstancesResource getVcsRootInstancesResource() {
        return new VcsRootInstancesResourceImpl(processor);
    }

    @NotNull
    @Override
    public VcsRootsResource getVcsRootsResource() {
        return new VcsRootsResourceImpl(processor);
    }
}
