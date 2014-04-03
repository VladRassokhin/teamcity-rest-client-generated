package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for change complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="change">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}user" minOccurs="0"/>
 *         &lt;element name="files" type="{}fileChanges" minOccurs="0"/>
 *         &lt;element name="vcsRootInstance" type="{}vcs-root-instance-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="personal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="webLink" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "change", propOrder = {
        "comment",
        "user",
        "files",
        "vcsRootInstance"
})
public class Change {

    public String comment;
    public User user;
    public FileChanges files;
    public VcsRootInstanceRef vcsRootInstance;
    @XmlAttribute(name = "id")
    public Long id;
    @XmlAttribute(name = "version")
    public String version;
    @XmlAttribute(name = "username")
    public String username;
    @XmlAttribute(name = "date")
    public String date;
    @XmlAttribute(name = "personal")
    public Boolean personal;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "webLink")
    public String webLink;
    @XmlAttribute(name = "locator")
    public String locator;

}
