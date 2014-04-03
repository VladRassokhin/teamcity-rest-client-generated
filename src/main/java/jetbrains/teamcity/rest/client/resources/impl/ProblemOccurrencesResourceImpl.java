/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.ProblemOccurrencesResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class ProblemOccurrencesResourceImpl extends ResourceImpl implements ProblemOccurrencesResource {

    public ProblemOccurrencesResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response getProblems(String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveInstance(String problemLocator, String fields) {
        //TODO: implement
        return null;
    }

}
