/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.DebugResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class DebugResourceImpl extends ResourceImpl implements DebugResource {

    public DebugResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response executeDBQuery(String query, String fieldDelimiter, Integer count) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response scheduleCheckingForChanges(String locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response listDBTables() {
        throw new java.lang.UnsupportedOperationException();
    }

}
