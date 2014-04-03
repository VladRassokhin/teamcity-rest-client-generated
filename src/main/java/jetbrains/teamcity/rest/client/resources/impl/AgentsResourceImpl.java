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
        //TODO: implement
        return null;
    }


    public Response getAgentPool(String agentLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response setAgentPool(String agentLocator) {
        //TODO: implement
        return null;
    }


    public Response serveAgent(String agentLocator) {
        //TODO: implement
        return null;
    }


    public void deleteAgent(String agentLocator) {
        //TODO: implement
    }


    public Response serveAgentField(String field, String agentLocator) {
        //TODO: implement
        return null;
    }


    public Response setAgentField(String field, String agentLocator) {
        //TODO: implement
        return null;
    }

}
