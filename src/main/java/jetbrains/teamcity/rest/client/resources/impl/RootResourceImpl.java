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

    public String getRoot() {
        //TODO: implement
        return null;
    }


    public String getVersion() {
        return processor.getAsString("/version");
    }


    public String getApiVersion() {
        //TODO: implement
        return null;
    }


    public PluginInfo getPluginInfo() {
        //TODO: implement
        return null;
    }


    public String getBuildFieldShort(String field, String projectLocator, String btLocator, String buildLocator) {
        //TODO: implement
        return null;
    }

}
