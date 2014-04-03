/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.model.PluginInfo;
import jetbrains.teamcity.rest.client.resources.RootResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

public class RootResourceImpl extends ResourceImpl implements RootResource {


    public RootResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public String serveRoot() {
        //TODO: implement
        return null;
    }


    public String serveVersion() {
        //TODO: implement
        return null;
    }


    public String serveApiVersion() {
        //TODO: implement
        return null;
    }


    public PluginInfo servePluginInfo() {
        //TODO: implement
        return null;
    }


    public String serveBuildFieldShort(String field, String projectLocator, String btLocator, String buildLocator) {
        //TODO: implement
        return null;
    }

}
