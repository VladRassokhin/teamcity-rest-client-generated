package jetbrains.teamcity.rest.client.impl;

import jetbrains.teamcity.rest.client.resources.RootResource;
import junit.framework.Assert;
import org.jetbrains.teamcity.rest.client.*;
import org.testng.annotations.Test;

public class TeamCityClientImplTest {
    @Test
    public void testConnectGuest() throws Exception {
        final AuthDataGuest auth = new AuthDataGuest();
        final ConnectionConfig config = new ConnectionConfig("http://teamcity.jetbrains.com", auth);
        final TeamCityRestClient client = new TeamCityRestClient(config);
        final RootResource root = client.getRootResource();
        final String version = root.getVersion();
        Assert.assertNotNull(version);
        System.out.println(version);
    }

    @Test
    public void testConnectLogInAsGuest() throws Exception {
        final AuthData auth = new AuthDataBasic("guest", "any");
        final ConnectionConfig config = new ConnectionConfig("http://teamcity.jetbrains.com", auth);
        final TeamCityRestClient client = new TeamCityRestClient(config);
        final RootResource root = client.getRootResource();
        String version = root.getVersion();
        Assert.assertNotNull(version);
        System.out.println(version);
         version = root.getVersion();
        Assert.assertNotNull(version);
        System.out.println(version);
    }
}
