/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.TestOccurrencesResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class TestOccurrencesResourceImpl extends ResourceImpl implements TestOccurrencesResource {

    public TestOccurrencesResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response getTestOccurrences(String locator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveInstance(String testLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }

}
