/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.ProblemsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class ProblemsResourceImpl extends ResourceImpl implements ProblemsResource {

    public ProblemsResourceImpl(@NotNull RequestsProcessor processor) {
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
