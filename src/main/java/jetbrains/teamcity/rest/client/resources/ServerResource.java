/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/server")
public interface ServerResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveServerInfo();

    @GET
    @Produces("text/plain")
    @Path("/backup")
    Response getBackupStatus();

    @POST
    @Produces("text/plain")
    @Path("/backup")
    Response startBackup(@QueryParam("fileName") String fileName, @QueryParam("addTimestamp") Boolean addTimestamp, @QueryParam("includeConfigs") Boolean includeConfigs, @QueryParam("includeDatabase") Boolean includeDatabase, 
                @QueryParam("includeBuildLogs") Boolean includeBuildLogs, @QueryParam("includePersonalChanges") Boolean includePersonalChanges, @QueryParam("includeRunningBuilds") Boolean includeRunningBuilds, @QueryParam("includeSupplimentaryData") Boolean includeSupplimentaryData);

    @GET
    @Produces("text/plain")
    @Path("/{field}")
    Response serveServerVersion(@PathParam("field") String field);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/plugins")
    Response servePlugins();

}
