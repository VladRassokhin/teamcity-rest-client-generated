package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buildTriggeringOptions complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="buildTriggeringOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rebuildDependencies" type="{}buildTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cleanSources" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rebuildAllDependencies" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="queueAtTop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "buildTriggeringOptions", propOrder = {
        "rebuildDependencies"
})
public class BuildTriggeringOptions {

    public BuildTypes rebuildDependencies;
    @Key("cleanSources")
    public Boolean cleanSources;
    @Key("rebuildAllDependencies")
    public Boolean rebuildAllDependencies;
    @Key("queueAtTop")
    public Boolean queueAtTop;

}
