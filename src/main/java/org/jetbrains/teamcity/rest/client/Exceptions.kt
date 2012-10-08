package org.jetbrains.teamcity.rest.client

/**
 * @author Vladislav.Rassokhin
 */


public open class TeamCityException(message: String? = null, cause: Throwable? = null): Exception(message?:cause?.getMessage(), cause) {
}

public open class TeamCityResourceNotFoundException(message: String? = null, cause: Throwable? = null): TeamCityException(message?:cause?.getMessage(), cause) {
}

