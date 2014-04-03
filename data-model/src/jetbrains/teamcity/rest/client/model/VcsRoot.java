package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="vcs-root">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}project" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *         &lt;element name="vcsRootInstances" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcsName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modificationCheckInterval" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastChecked" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectLocator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "vcs-root", propOrder = {
        "project",
        "properties",
        "vcsRootInstances"
})
public class VcsRoot {

    public Project project;
    public Properties properties;
    public HReference vcsRootInstances;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "internalId")
    public Long internalId;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "vcsName")
    public String vcsName;
    @XmlAttribute(name = "modificationCheckInterval")
    public Integer modificationCheckInterval;
    @XmlAttribute(name = "status")
    public String status;
    @XmlAttribute(name = "lastChecked")
    public String lastChecked;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "projectLocator")
    public String projectLocator;

}
