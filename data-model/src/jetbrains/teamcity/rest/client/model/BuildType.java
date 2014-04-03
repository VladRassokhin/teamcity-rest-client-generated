package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buildType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="buildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}project" minOccurs="0"/>
 *         &lt;element name="template" type="{}buildType" minOccurs="0"/>
 *         &lt;element ref="{}vcs-root-entries" minOccurs="0"/>
 *         &lt;element name="settings" type="{}properties" minOccurs="0"/>
 *         &lt;element name="parameters" type="{}properties" minOccurs="0"/>
 *         &lt;element ref="{}steps" minOccurs="0"/>
 *         &lt;element ref="{}features" minOccurs="0"/>
 *         &lt;element ref="{}triggers" minOccurs="0"/>
 *         &lt;element ref="{}snapshot-dependencies" minOccurs="0"/>
 *         &lt;element ref="{}artifact-dependencies" minOccurs="0"/>
 *         &lt;element ref="{}agent-requirements" minOccurs="0"/>
 *         &lt;element ref="{}builds" minOccurs="0"/>
 *         &lt;element ref="{}investigations" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="paused" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectInternalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "buildType", propOrder = {
        "project",
        "template",
        "vcsRootEntries",
        "settings",
        "parameters",
        "steps",
        "features",
        "triggers",
        "snapshotDependencies",
        "artifactDependencies",
        "agentRequirements",
        "builds",
        "investigations"
})
public class BuildType {

    public Project project;
    public BuildType template;
    @XmlElement(name = "vcs-root-entries")
    public VcsRootEntries vcsRootEntries;
    public Properties settings;
    public Properties parameters;
    public PropEntitiesStep steps;
    public PropEntitiesFeature features;
    public PropEntitiesTrigger triggers;
    @XmlElement(name = "snapshot-dependencies")
    public PropEntitiesSnapshotDep snapshotDependencies;
    @XmlElement(name = "artifact-dependencies")
    public PropEntitiesArtifactDep artifactDependencies;
    @XmlElement(name = "agent-requirements")
    public PropEntitiesAgentRequirement agentRequirements;
    public Builds builds;
    public Investigations investigations;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "internalId")
    public String internalId;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "templateFlag")
    public Boolean templateFlag;
    @XmlAttribute(name = "paused")
    public Boolean paused;
    @XmlAttribute(name = "description")
    public String description;
    @XmlAttribute(name = "projectName")
    public String projectName;
    @XmlAttribute(name = "projectId")
    public String projectId;
    @XmlAttribute(name = "projectInternalId")
    public String projectInternalId;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "webUrl")
    public String webUrl;
    @XmlAttribute(name = "locator")
    public String locator;

}
