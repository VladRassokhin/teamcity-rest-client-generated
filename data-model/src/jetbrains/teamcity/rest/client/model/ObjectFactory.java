
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgentRef_QNAME = new QName("", "agent-ref");
    private final static QName _Users_QNAME = new QName("", "users");
    private final static QName _Test_QNAME = new QName("", "test");
    private final static QName _ProblemOccurrence_QNAME = new QName("", "problemOccurrence");
    private final static QName _VcsLabeling_QNAME = new QName("", "vcsLabeling");
    private final static QName _VcsRootRef_QNAME = new QName("", "vcs-root-ref");
    private final static QName _Change_QNAME = new QName("", "change");
    private final static QName _BuildTypes_QNAME = new QName("", "buildTypes");
    private final static QName _NewBuildTypeDescription_QNAME = new QName("", "newBuildTypeDescription");
    private final static QName _ArtifactDependencies_QNAME = new QName("", "artifact-dependencies");
    private final static QName _Plugin_QNAME = new QName("", "plugin");
    private final static QName _AgentPoolRef_QNAME = new QName("", "agentPool-ref");
    private final static QName _File_QNAME = new QName("", "file");
    private final static QName _BuildCancelRequest_QNAME = new QName("", "buildCancelRequest");
    private final static QName _Features_QNAME = new QName("", "features");
    private final static QName _ProblemOccurrences_QNAME = new QName("", "problemOccurrences");
    private final static QName _Role_QNAME = new QName("", "role");
    private final static QName _Investigation_QNAME = new QName("", "investigation");
    private final static QName _Feature_QNAME = new QName("", "feature");
    private final static QName _Href_QNAME = new QName("", "href");
    private final static QName _Groups_QNAME = new QName("", "groups");
    private final static QName _Branches_QNAME = new QName("", "branches");
    private final static QName _VcsRoots_QNAME = new QName("", "vcs-roots");
    private final static QName _VcsRootInstances_QNAME = new QName("", "vcs-root-instances");
    private final static QName _VcsRootEntries_QNAME = new QName("", "vcs-root-entries");
    private final static QName _IssuesUsages_QNAME = new QName("", "issuesUsages");
    private final static QName _Problems_QNAME = new QName("", "problems");
    private final static QName _Property_QNAME = new QName("", "property");
    private final static QName _NewProjectDescription_QNAME = new QName("", "newProjectDescription");
    private final static QName _Steps_QNAME = new QName("", "steps");
    private final static QName _Properties_QNAME = new QName("", "properties");
    private final static QName _VcsRootInstance_QNAME = new QName("", "vcs-root-instance");
    private final static QName _BuildTriggeringOptions_QNAME = new QName("", "buildTriggeringOptions");
    private final static QName _Agent_QNAME = new QName("", "agent");
    private final static QName _Investigations_QNAME = new QName("", "investigations");
    private final static QName _Project_QNAME = new QName("", "project");
    private final static QName _Projects_QNAME = new QName("", "projects");
    private final static QName _AgentPools_QNAME = new QName("", "agentPools");
    private final static QName _ArtifactDependency_QNAME = new QName("", "artifact-dependency");
    private final static QName _Items_QNAME = new QName("", "items");
    private final static QName _Roles_QNAME = new QName("", "roles");
    private final static QName _Issues_QNAME = new QName("", "issues");
    private final static QName _Branch_QNAME = new QName("", "branch");
    private final static QName _Comment_QNAME = new QName("", "comment");
    private final static QName _VcsRootInstanceRef_QNAME = new QName("", "vcs-root-instance-ref");
    private final static QName _BuildType_QNAME = new QName("", "buildType");
    private final static QName _AgentRequirements_QNAME = new QName("", "agent-requirements");
    private final static QName _TestOccurrences_QNAME = new QName("", "testOccurrences");
    private final static QName _Plugins_QNAME = new QName("", "plugins");
    private final static QName _Agents_QNAME = new QName("", "agents");
    private final static QName _AgentPool_QNAME = new QName("", "agentPool");
    private final static QName _Build_QNAME = new QName("", "build");
    private final static QName _VcsRootEntry_QNAME = new QName("", "vcs-root-entry");
    private final static QName _TestOccurrence_QNAME = new QName("", "testOccurrence");
    private final static QName _AgentRequirement_QNAME = new QName("", "agent-requirement");
    private final static QName _Tests_QNAME = new QName("", "tests");
    private final static QName _ParameterType_QNAME = new QName("", "parameterType");
    private final static QName _Entries_QNAME = new QName("", "entries");
    private final static QName _Tags_QNAME = new QName("", "tags");
    private final static QName _VcsRoot_QNAME = new QName("", "vcs-root");
    private final static QName _Files_QNAME = new QName("", "files");
    private final static QName _Trigger_QNAME = new QName("", "trigger");
    private final static QName _Builds_QNAME = new QName("", "builds");
    private final static QName _SnapshotDependencies_QNAME = new QName("", "snapshot-dependencies");
    private final static QName _Problem_QNAME = new QName("", "problem");
    private final static QName _FileRef_QNAME = new QName("", "file-ref");
    private final static QName _Mutes_QNAME = new QName("", "mutes");
    private final static QName _Entry_QNAME = new QName("", "entry");
    private final static QName _ProgressInfo_QNAME = new QName("", "progress-info");
    private final static QName _Server_QNAME = new QName("", "server");
    private final static QName _Triggers_QNAME = new QName("", "triggers");
    private final static QName _Group_QNAME = new QName("", "group");
    private final static QName _User_QNAME = new QName("", "user");
    private final static QName _Step_QNAME = new QName("", "step");
    private final static QName _Changes_QNAME = new QName("", "changes");
    private final static QName _SnapshotDependency_QNAME = new QName("", "snapshot-dependency");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

}
