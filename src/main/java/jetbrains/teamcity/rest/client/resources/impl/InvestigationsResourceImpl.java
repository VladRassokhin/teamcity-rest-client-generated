/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.InvestigationsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class InvestigationsResourceImpl extends ResourceImpl implements InvestigationsResource {

    public InvestigationsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response getInvestigations(String locator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveInstance(String investigationLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }

}
