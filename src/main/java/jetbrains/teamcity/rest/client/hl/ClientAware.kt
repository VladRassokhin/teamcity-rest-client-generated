package jetbrains.teamcity.rest.client.hl

import jetbrains.teamcity.rest.client.TeamCityClient

public open class ClientAware(val client: TeamCityClient) {
    override fun hashCode(): Int {
        return client.hashCode()
    }
}