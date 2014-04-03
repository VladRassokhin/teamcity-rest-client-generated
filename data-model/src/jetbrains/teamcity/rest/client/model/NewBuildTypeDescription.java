
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newBuildTypeDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newBuildTypeDescription", propOrder = {
    "sourceBuildType"
})
public class NewBuildTypeDescription
    extends CopyOptionsDescription
{

    public BuildType sourceBuildType;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "sourceBuildTypeLocator")
    public String sourceBuildTypeLocator;

}
