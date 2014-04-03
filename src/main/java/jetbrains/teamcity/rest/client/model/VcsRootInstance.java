package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for vcs-root-instance complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */

@XmlType(name = "vcs-root-instance", propOrder = {
        "vcsRoot",
        "properties"
})
public class VcsRootInstance {

    @XmlElement(name = "vcs-root")
    public VcsRootRef vcsRoot;
    public Properties properties;
    @Key("id")
    public String id;
    @Key("name")
    public String name;
    @Key("vcsName")
    public String vcsName;
    @Key("status")
    public String status;
    @Key("lastChecked")
    public String lastChecked;
    @Key("lastVersion")
    public String lastVersion;
    @Key("lastVersionInternal")
    public String lastVersionInternal;
    @Key("href")
    public String href;
    @Key("projectLocator")
    public String projectLocator;

}
