
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root-instance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-root-instance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root" type="{}vcs-root-ref" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcsName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastChecked" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastVersionInternal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectLocator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-instance", propOrder = {
    "vcsRoot",
    "properties"
})
public class VcsRootInstance {

    @XmlElement(name = "vcs-root")
    public VcsRootRef vcsRoot;
    public Properties properties;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "vcsName")
    public String vcsName;
    @XmlAttribute(name = "status")
    public String status;
    @XmlAttribute(name = "lastChecked")
    public String lastChecked;
    @XmlAttribute(name = "lastVersion")
    public String lastVersion;
    @XmlAttribute(name = "lastVersionInternal")
    public String lastVersionInternal;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "projectLocator")
    public String projectLocator;

}
