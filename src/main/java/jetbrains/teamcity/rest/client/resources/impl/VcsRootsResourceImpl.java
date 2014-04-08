/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import com.google.api.client.http.HttpResponse;
import jetbrains.teamcity.rest.client.model.VcsRoot;
import jetbrains.teamcity.rest.client.model.VcsRoots;
import jetbrains.teamcity.rest.client.resources.Locator;
import jetbrains.teamcity.rest.client.resources.VcsRootsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;
import java.io.IOException;

public class VcsRootsResourceImpl extends ResourceImpl implements VcsRootsResource {


  public static final String VCS_ROOTS = "/vcs-roots";

  public VcsRootsResourceImpl(@NotNull RequestsProcessor processor) {
    super(processor);
  }

  public VcsRoot addRoot(@NotNull VcsRoot root) {
//      if (root.project == null) {
//        throw new IllegalArgumentException("project field required");
//      }

    final HttpResponse response = processor.post(VCS_ROOTS, processor.asJson(root));
    try {
      if ("application/json".equals(response.getContentType())) {
        return response.parseAs(VcsRoot.class);
      } else {
        // Not good.
        System.err.println("Error: " + response.parseAsString());
        return null;
      }
    } catch (IOException e) {
      return null;
    }
  }

  public VcsRoots getRoots(@Nullable final Locator locator) {
    String url = VCS_ROOTS;
    if (locator != null) {
      url += "/?locator=" + locator.toString();
    }
    return processor.getAs(url, VcsRoots.class);
  }


  public String setParameter(Locator vcsRootLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public String getProperty(Locator vcsRootLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void unsetParameter(Locator vcsRootLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public VcsRoot getRoot(Locator locator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteRoot(Locator vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public jetbrains.teamcity.rest.client.model.Properties getRootInstanceProperties(Locator vcsRootInstanceLocator, Locator vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveInstanceField(String field, String vcsRootInstanceLocator, String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setInstanceField(String field, String vcsRootInstanceLocator, String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveRootInstances(String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveRootInstance(String vcsRootInstanceLocator, String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveProperties(String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changProperties(String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteAllProperties(String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveField(String field, String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setField(String field, String vcsRootLocator) {
    throw new java.lang.UnsupportedOperationException();
  }

}
