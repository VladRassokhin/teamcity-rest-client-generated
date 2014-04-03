/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.TestsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class TestsResourceImpl extends ResourceImpl implements TestsResource {


    public TestsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response getTests(String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveInstance(String testLocator, String fields) {
        //TODO: implement
        return null;
    }

}
