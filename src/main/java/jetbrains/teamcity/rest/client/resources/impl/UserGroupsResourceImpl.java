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
        //TODO: implement
        return null;
    }


    public Response serveGroups(String fields) {
        //TODO: implement
        return null;
    }


    public void deleteGroup(String groupLocator) {
        //TODO: implement
    }


    public Response serveGroup(String groupLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response addRolePut(String groupLocator) {
        //TODO: implement
        return null;
    }


    public Response addRole(String groupLocator) {
        //TODO: implement
        return null;
    }


    public Response listRoles(String groupLocator) {
        //TODO: implement
        return null;
    }


    public Response listRole(String groupLocator, String scope, String roleId) {
        //TODO: implement
        return null;
    }


    public Response addRoleSimple(String groupLocator, String scope, String roleId) {
        //TODO: implement
        return null;
    }


    public void deleteRole(String groupLocator, String scope, String roleId) {
        //TODO: implement
    }

}
