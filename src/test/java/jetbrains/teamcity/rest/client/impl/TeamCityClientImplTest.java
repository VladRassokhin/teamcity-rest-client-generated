package jetbrains.teamcity.rest.client.impl;

import jetbrains.teamcity.rest.client.resources.RootResource;
import junit.framework.Assert;
import org.jetbrains.teamcity.rest.client.AuthDataGuest;
import org.jetbrains.teamcity.rest.client.ConnectionConfig;
import org.jetbrains.teamcity.rest.client.TeamCityRestClient;
import org.testng.annotations.Test;

public class TeamCityClientImplTest {
    @Test
    public void testConnect() throws Exception {
        final AuthDataGuest auth = new AuthDataGuest();
        final ConnectionConfig config = new ConnectionConfig("http://teamcity.jetbrains.com", auth);
        final TeamCityRestClient client = new TeamCityRestClient(config);
        final RootResource root = client.getRootResource();
        final String version = root.getVersion();
        Assert.assertNotNull(version);
        System.out.println(version);
    }
}
