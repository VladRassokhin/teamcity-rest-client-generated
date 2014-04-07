package jetbrains.teamcity.rest.client.impl;

import generated.TeamCityClient;
import generated.resources.AppRestRoot;
import org.testng.annotations.Test;

import java.net.URI;

public class GeneratedTest {
  @Test
  public void testGenerated() throws Exception {
    final AppRestRoot rest = new TeamCityClient(new URI("http://teamcity.jetbrains.com")).getRootResource();
    final String plain = rest.version().get();
    System.out.println(plain);

  }
}
