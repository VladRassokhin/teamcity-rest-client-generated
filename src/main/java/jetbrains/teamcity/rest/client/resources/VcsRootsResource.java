/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import jetbrains.teamcity.rest.client.model.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/vcs-roots")
public interface VcsRootsResource {

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    VcsRoot addRoot(@NotNull final VcsRoot root);

    @GET
    @Produces({"application/xml", "application/json" })
    VcsRoots getRoots(@Nullable Locator locator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}")
    VcsRoot getRoot(@PathParam("vcsRootLocator") Locator locator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/properties/{name}")
    String setParameter(@PathParam("vcsRootLocator") Locator vcsRootLocator, @PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/properties/{name}")
    String getProperty(@PathParam("vcsRootLocator") Locator vcsRootLocator, @PathParam("name") String name);

    @DELETE
    @Path("/{vcsRootLocator}/properties/{name}")
    void unsetParameter(@PathParam("vcsRootLocator") Locator vcsRootLocator, @PathParam("name") String name);

    @DELETE
    @Path("/{vcsRootLocator}")
    void deleteRoot(@PathParam("vcsRootLocator") Locator vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties")
    Properties getRootInstanceProperties(@PathParam("vcsRootInstanceLocator") Locator vcsRootInstanceLocator, @PathParam("vcsRootLocator") Locator vcsRootLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}")
    Response serveInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}")
    Response setInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/instances")
    Response serveRootInstances(@PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}")
    Response serveRootInstance(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/properties")
    Response serveProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/properties")
    Response changProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

    @DELETE
    @Path("/{vcsRootLocator}/properties")
    void deleteAllProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/{field}")
    Response serveField(@PathParam("field") String field, @PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/{field}")
    Response setField(@PathParam("field") String field, @PathParam("vcsRootLocator") String vcsRootLocator);

}
