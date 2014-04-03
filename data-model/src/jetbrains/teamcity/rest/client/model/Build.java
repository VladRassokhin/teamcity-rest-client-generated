
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for build complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="build">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}buildType" minOccurs="0"/>
 *         &lt;element ref="{}comment" minOccurs="0"/>
 *         &lt;element ref="{}tags" minOccurs="0"/>
 *         &lt;element name="pinInfo" type="{}comment" minOccurs="0"/>
 *         &lt;element ref="{}user" minOccurs="0"/>
 *         &lt;element name="startEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="running-info" type="{}runningBuildInfo" minOccurs="0"/>
 *         &lt;element name="canceledInfo" type="{}comment" minOccurs="0"/>
 *         &lt;element name="queuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="triggered" type="{}triggeredBy" minOccurs="0"/>
 *         &lt;element name="lastChanges" type="{}changes" minOccurs="0"/>
 *         &lt;element ref="{}changes" minOccurs="0"/>
 *         &lt;element name="revisions" type="{}revisions" minOccurs="0"/>
 *         &lt;element name="agent" type="{}agent-ref" minOccurs="0"/>
 *         &lt;element name="compatibleAgents" type="{}HReference" minOccurs="0"/>
 *         &lt;element ref="{}testOccurrences" minOccurs="0"/>
 *         &lt;element ref="{}problemOccurrences" minOccurs="0"/>
 *         &lt;element name="artifacts" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="relatedIssues" type="{}issueUsages" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *         &lt;element name="attributes" type="{}entries" minOccurs="0"/>
 *         &lt;element name="statistics" type="{}properties" minOccurs="0"/>
 *         &lt;element name="snapshot-dependencies" type="{}builds" minOccurs="0"/>
 *         &lt;element name="artifact-dependencies" type="{}builds" minOccurs="0"/>
 *         &lt;element name="custom-artifact-dependencies" type="{}propEntitiesArtifactDep" minOccurs="0"/>
 *         &lt;element name="triggeringOptions" type="{}buildTriggeringOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="taskId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="buildTypeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="running" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="personal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="percentageComplete" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="unspecifiedBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="history" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pinned" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "build", propOrder = {
    "statusText",
    "buildType",
    "comment",
    "tags",
    "pinInfo",
    "user",
    "startEstimate",
    "waitReason",
    "runningInfo",
    "canceledInfo",
    "queuedDate",
    "startDate",
    "finishDate",
    "triggered",
    "lastChanges",
    "changes",
    "revisions",
    "agent",
    "compatibleAgents",
    "testOccurrences",
    "problemOccurrences",
    "artifacts",
    "relatedIssues",
    "properties",
    "attributes",
    "statistics",
    "snapshotDependencies",
    "artifactDependencies",
    "customArtifactDependencies",
    "triggeringOptions"
})
public class Build {

    public String statusText;
    public BuildType buildType;
    public Comment comment;
    public Tags tags;
    public Comment pinInfo;
    public User user;
    public String startEstimate;
    public String waitReason;
    @XmlElement(name = "running-info")
    public RunningBuildInfo runningInfo;
    public Comment canceledInfo;
    public String queuedDate;
    public String startDate;
    public String finishDate;
    public TriggeredBy triggered;
    public Changes lastChanges;
    public Changes changes;
    public Revisions revisions;
    public AgentRef agent;
    public HReference compatibleAgents;
    public TestOccurrences testOccurrences;
    public ProblemOccurrences problemOccurrences;
    public HReference artifacts;
    public IssueUsages relatedIssues;
    public Properties properties;
    public Entries attributes;
    public Properties statistics;
    @XmlElement(name = "snapshot-dependencies")
    public Builds snapshotDependencies;
    @XmlElement(name = "artifact-dependencies")
    public Builds artifactDependencies;
    @XmlElement(name = "custom-artifact-dependencies")
    public PropEntitiesArtifactDep customArtifactDependencies;
    public BuildTriggeringOptions triggeringOptions;
    @XmlAttribute(name = "id")
    public Long id;
    @XmlAttribute(name = "taskId")
    public Long taskId;
    @XmlAttribute(name = "buildTypeId")
    public String buildTypeId;
    @XmlAttribute(name = "number")
    public String number;
    @XmlAttribute(name = "status")
    public String status;
    @XmlAttribute(name = "state")
    public String state;
    @XmlAttribute(name = "running")
    public Boolean running;
    @XmlAttribute(name = "personal")
    public Boolean personal;
    @XmlAttribute(name = "percentageComplete")
    public Integer percentageComplete;
    @XmlAttribute(name = "branchName")
    public String branchName;
    @XmlAttribute(name = "defaultBranch")
    public Boolean defaultBranch;
    @XmlAttribute(name = "unspecifiedBranch")
    public Boolean unspecifiedBranch;
    @XmlAttribute(name = "history")
    public Boolean history;
    @XmlAttribute(name = "pinned")
    public Boolean pinned;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "webUrl")
    public String webUrl;
    @XmlAttribute(name = "locator")
    public String locator;

}
