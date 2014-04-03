package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

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
    @Key("vcs-root-entries")
    public VcsRootEntries vcsRootEntries;
    public Properties settings;
    public Properties parameters;
    public PropEntitiesStep steps;
    public PropEntitiesFeature features;
    public PropEntitiesTrigger triggers;
    @Key("snapshot-dependencies")
    public PropEntitiesSnapshotDep snapshotDependencies;
    @Key("artifact-dependencies")
    public PropEntitiesArtifactDep artifactDependencies;
    @Key("agent-requirements")
    public PropEntitiesAgentRequirement agentRequirements;
    public Builds builds;
    public Investigations investigations;
    @Key("id")
    public String id;
    @Key("internalId")
    public String internalId;
    @Key("name")
    public String name;
    @Key("templateFlag")
    public Boolean templateFlag;
    @Key("paused")
    public Boolean paused;
    @Key("description")
    public String description;
    @Key("projectName")
    public String projectName;
    @Key("projectId")
    public String projectId;
    @Key("projectInternalId")
    public String projectInternalId;
    @Key("href")
    public String href;
    @Key("webUrl")
    public String webUrl;
    @Key("locator")
    public String locator;

}
