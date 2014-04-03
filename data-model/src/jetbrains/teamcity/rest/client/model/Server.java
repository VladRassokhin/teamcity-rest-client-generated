package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for server complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */

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
    @Key("version")
    public String version;
    @Key("versionMajor")
    public byte versionMajor;
    @Key("versionMinor")
    public byte versionMinor;
    @Key("startTime")
    public String startTime;
    @Key("currentTime")
    public String currentTime;
    @Key("buildNumber")
    public String buildNumber;
    @Key("buildDate")
    public String buildDate;
    @Key("internalId")
    public String internalId;

}
