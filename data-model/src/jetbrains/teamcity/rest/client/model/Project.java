package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for project complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentProject" type="{}project" minOccurs="0"/>
 *         &lt;element ref="{}buildTypes" minOccurs="0"/>
 *         &lt;element name="templates" type="{}buildTypes" minOccurs="0"/>
 *         &lt;element name="parameters" type="{}properties" minOccurs="0"/>
 *         &lt;element name="vcsRoots" type="{}HReference" minOccurs="0"/>
 *         &lt;element ref="{}projects" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentProjectId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentProjectInternalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentProjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "project", propOrder = {
        "parentProject",
        "buildTypes",
        "templates",
        "parameters",
        "vcsRoots",
        "projects"
})
public class Project {

    public Project parentProject;
    public BuildTypes buildTypes;
    public BuildTypes templates;
    public Properties parameters;
    public HReference vcsRoots;
    public Projects projects;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "internalId")
    public String internalId;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "parentProjectId")
    public String parentProjectId;
    @XmlAttribute(name = "parentProjectInternalId")
    public String parentProjectInternalId;
    @XmlAttribute(name = "parentProjectName")
    public String parentProjectName;
    @XmlAttribute(name = "archived")
    public Boolean archived;
    @XmlAttribute(name = "description")
    public String description;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "webUrl")
    public String webUrl;
    @XmlAttribute(name = "locator")
    public String locator;

}
