package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>Java class for pluginInfos complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="pluginInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}plugin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "pluginInfos", propOrder = {
        "plugin"
})
public class PluginInfos {

    public List<PluginInfo> plugin;

}
