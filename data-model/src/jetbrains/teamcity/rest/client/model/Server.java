
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for server complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="server">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projects" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="vcsRoots" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="builds" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="users" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="userGroups" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="agents" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="buildQueue" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="agentPools" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="versionMajor" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="versionMinor" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currentTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buildNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buildDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "server", propOrder = {
    "projects",
    "vcsRoots",
    "builds",
    "users",
    "userGroups",
    "agents",
    "buildQueue",
    "agentPools"
})
public class Server {

    public HReference projects;
    public HReference vcsRoots;
    public HReference builds;
    public HReference users;
    public HReference userGroups;
    public HReference agents;
    public HReference buildQueue;
    public HReference agentPools;
    @XmlAttribute(name = "version")
    public String version;
    @XmlAttribute(name = "versionMajor", required = true)
    public byte versionMajor;
    @XmlAttribute(name = "versionMinor", required = true)
    public byte versionMinor;
    @XmlAttribute(name = "startTime")
    public String startTime;
    @XmlAttribute(name = "currentTime")
    public String currentTime;
    @XmlAttribute(name = "buildNumber")
    public String buildNumber;
    @XmlAttribute(name = "buildDate")
    public String buildDate;
    @XmlAttribute(name = "internalId")
    public String internalId;

}
