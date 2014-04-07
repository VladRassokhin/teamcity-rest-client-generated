package generated;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * Workaround for JAX_RS_SPEC-312
 */
class WebApplicationExceptionMessage
    extends WebApplicationException {
  WebApplicationExceptionMessage(Response response) {
    super(response);
  }

  /**
   * Workaround for JAX_RS_SPEC-312
   */
  public String getMessage() {
    Response response = getResponse();
    Response.Status status = Response.Status.fromStatusCode(response.getStatus());
    if (status != null) {
      return (response.getStatus() + (" " + status.getReasonPhrase()));
    } else {
      return Integer.toString(response.getStatus());
    }
  }

  public String toString() {
    String s = "javax.ws.rs.WebApplicationException";
    String message = getLocalizedMessage();
    return (s + (": " + message));
  }
}
