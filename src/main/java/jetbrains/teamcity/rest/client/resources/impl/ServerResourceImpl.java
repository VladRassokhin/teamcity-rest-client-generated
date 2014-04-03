/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.ServerResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class ServerResourceImpl extends ResourceImpl implements ServerResource {


    public ServerResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response serveServerInfo() {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getBackupStatus() {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response startBackup(String fileName, Boolean addTimestamp, Boolean includeConfigs, Boolean includeDatabase,
                                Boolean includeBuildLogs, Boolean includePersonalChanges, Boolean includeRunningBuilds, Boolean includeSupplimentaryData) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveServerVersion(String field) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response servePlugins() {
        throw new java.lang.UnsupportedOperationException();
    }

}
