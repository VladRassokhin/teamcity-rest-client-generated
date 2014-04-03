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
        //TODO: implement
        return null;
    }


    public Response getBackupStatus() {
        //TODO: implement
        return null;
    }


    public Response startBackup(String fileName, Boolean addTimestamp, Boolean includeConfigs, Boolean includeDatabase, 
                Boolean includeBuildLogs, Boolean includePersonalChanges, Boolean includeRunningBuilds, Boolean includeSupplimentaryData) {
        //TODO: implement
        return null;
    }


    public Response serveServerVersion(String field) {
        //TODO: implement
        return null;
    }


    public Response servePlugins() {
        //TODO: implement
        return null;
    }

}
