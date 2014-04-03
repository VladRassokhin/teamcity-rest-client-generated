package org.jetbrains.teamcity.rest.client

import jetbrains.teamcity.rest.client.impl.TeamCityClientImpl
import com.google.api.client.http.GenericUrl

public class TeamCityRestClient(val config: ConnectionConfig) : TeamCityClientImpl(HTTP(GenericUrl(config.getRestUrl()))) {
}
