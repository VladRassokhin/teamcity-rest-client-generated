/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.UsersResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class UsersResourceImpl extends ResourceImpl implements UsersResource {


    public UsersResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response createUser(String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveUsers(String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteUser(String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response updateUser(String userLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveUser(String userLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response replaceRoles(String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addRole(String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response listRoles(String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response listRole(String userLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addRoleSimple(String userLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteRole(String userLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void addRoleSimplePost(String userLocator, String scope, String roleId) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addGroup(String userLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response replaceGroups(String userLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getGroups(String userLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveUserField(String field, String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setUserField(String field, String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveUserProperties(String userLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveUserProperties(String userLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response putUserProperty(String userLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void removeUserProperty(String userLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }

}
