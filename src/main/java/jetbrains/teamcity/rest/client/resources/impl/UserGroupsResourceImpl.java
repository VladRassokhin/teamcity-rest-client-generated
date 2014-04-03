/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.UserGroupsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class UserGroupsResourceImpl extends ResourceImpl implements UserGroupsResource {


    public UserGroupsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response addGroup(String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveGroups(String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteGroup(String groupLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveGroup(String groupLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addRolePut(String groupLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addRole(String groupLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response listRoles(String groupLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response listRole(String groupLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addRoleSimple(String groupLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteRole(String groupLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }

}
