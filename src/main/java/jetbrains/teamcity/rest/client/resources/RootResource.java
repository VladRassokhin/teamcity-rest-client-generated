/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources;

import jetbrains.teamcity.rest.client.model.PluginInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/app/rest")
public interface RootResource {

    @GET
    @Produces("text/plain")
    String serveRoot();

    @GET
    @Produces("text/plain")
    @Path("/version")
    String serveVersion();

    @GET
    @Produces("text/plain")
    @Path("/apiVersion")
    String serveApiVersion();

    @GET
    @Produces("application/xml")
    @Path("/info")
    PluginInfo servePluginInfo();

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/{btLocator}/{buildLocator}/{field}")
    String serveBuildFieldShort(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator);

}
