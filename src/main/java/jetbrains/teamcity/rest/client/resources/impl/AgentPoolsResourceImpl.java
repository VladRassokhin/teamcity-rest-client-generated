/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.AgentPoolsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class AgentPoolsResourceImpl extends ResourceImpl implements AgentPoolsResource {


    public AgentPoolsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response getPools() {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setPools() {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addProject(String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getPoolProjects(String agentPoolLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response replaceProjects(String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getPoolAgents(String agentPoolLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addAgent(String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deletePool(String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getPool(String agentPoolLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getPoolProject(String projectLocator, String agentPoolLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deletePoolProject(String projectLocator, String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }

}
