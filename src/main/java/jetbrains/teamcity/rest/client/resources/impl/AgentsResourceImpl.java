/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.AgentsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class AgentsResourceImpl extends ResourceImpl implements AgentsResource {


    public AgentsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response serveAgents(Boolean includeDisconnected, Boolean includeUnauthorized, String locator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getAgentPool(String agentLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setAgentPool(String agentLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveAgent(String agentLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteAgent(String agentLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveAgentField(String field, String agentLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setAgentField(String field, String agentLocator) {
        throw new java.lang.UnsupportedOperationException();
    }

}
