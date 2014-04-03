package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newBuildTypeDescription complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="newBuildTypeDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{}copyOptionsDescription">
 *       &lt;sequence>
 *         &lt;element name="sourceBuildType" type="{}buildType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceBuildTypeLocator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "newBuildTypeDescription", propOrder = {
        "sourceBuildType"
})
public class NewBuildTypeDescription
        extends CopyOptionsDescription {

    public BuildType sourceBuildType;
    @Key("name")
    public String name;
    @Key("id")
    public String id;
    @Key("sourceBuildTypeLocator")
    public String sourceBuildTypeLocator;

}
