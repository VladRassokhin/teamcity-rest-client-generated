/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/vcs-root-instances")
public interface VcsRootInstancesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveInstances(@QueryParam("locator") String locator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/repositoryState")
    Response getRepositoryState(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/repositoryState")
    Response setRepositoryState(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/properties")
    Response serveRootInstanceProperties(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootInstanceLocator}/{field}")
    Response serveInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootInstanceLocator}/{field}")
    Response setInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces("*/*")
    @Path("/{vcsRootInstanceLocator}/repositoryState/creationDate")
    Response getRepositoryStateCreationDate(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces("*/*")
    @Path("/{vcsRootInstanceLocator}/files/latest/content{path:(/.*)?}")
    Response getVcsFileContent(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("path") String path);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/files/latest/children{path:(/.*)?}")
    Response getVcsFileListing(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("path") String path);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/files/latest/metadata{path:(/.*)?}")
    Response getVcsFile(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("path") String path);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}")
    Response serveInstance(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

}
