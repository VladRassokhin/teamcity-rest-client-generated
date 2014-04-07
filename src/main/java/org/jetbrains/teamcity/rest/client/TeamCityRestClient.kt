package org.jetbrains.teamcity.rest.client

import jetbrains.teamcity.rest.client.impl.TeamCityClientImpl

public class TeamCityRestClient(val config: ConnectionConfig) : TeamCityClientImpl(HTTP(config)) {
}
