/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/testOccurrences")
public interface TestOccurrencesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getTestOccurrences(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{testLocator}")
    Response serveInstance(@PathParam("testLocator") String testLocator, @QueryParam("fields") String fields);

}
