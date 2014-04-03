package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newProjectDescription complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="newProjectDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{}copyOptionsDescription">
 *       &lt;sequence>
 *         &lt;element name="sourceProject" type="{}project" minOccurs="0"/>
 *         &lt;element name="parentProject" type="{}project" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceProjectLocator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "newProjectDescription", propOrder = {
        "sourceProject",
        "parentProject"
})
public class NewProjectDescription
        extends CopyOptionsDescription {

    public Project sourceProject;
    public Project parentProject;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "sourceProjectLocator")
    public String sourceProjectLocator;

}
