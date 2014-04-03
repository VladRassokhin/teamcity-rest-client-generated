/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/changes")
public interface ChangesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveChanges(@QueryParam("project") String project, @QueryParam("buildType") String buildType, @QueryParam("build") String build, @QueryParam("vcsRoot") String vcsRoot, 
                @QueryParam("sinceChange") String sinceChange, @QueryParam("start") Long start, @QueryParam("count") Integer count, @QueryParam("locator") String locator, 
                @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{changeLocator}/{field}")
    Response getChangeField(@PathParam("field") String field, @PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/parentChanges")
    Response getParentChanges(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/parentRevisions")
    Response getChangeParentRevisions(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/vcsRoot")
    Response getChangeVCSRoot(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/attributes")
    Response getChangeAttributes(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/duplicates")
    Response getChangeDuplicates(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/issues")
    Response getChangeIssue(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/buildTypes")
    Response getRelatedBuildTypes(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/firstBuilds")
    Response getChangeFirstBuilds(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}")
    Response serveChange(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

}
