
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root-instance-ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-root-instance-ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcs-root-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcsRootInternalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-instance-ref")
public class VcsRootInstanceRef {

    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "vcs-root-id")
    public String vcsRootId;
    @XmlAttribute(name = "vcsRootInternalId")
    public String vcsRootInternalId;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "href")
    public String href;

}
