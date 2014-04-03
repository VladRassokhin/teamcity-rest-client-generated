package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>Java class for vcs-root-instances complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="vcs-root-instances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root-instance" type="{}vcs-root-instance-ref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="nextHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prevHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-instances", propOrder = {
        "vcsRootInstance"
})
public class VcsRootInstances {

    @XmlElement(name = "vcs-root-instance")
    public List<VcsRootInstanceRef> vcsRootInstance;
    @XmlAttribute(name = "count", required = true)
    public long count;
    @XmlAttribute(name = "nextHref")
    public String nextHref;
    @XmlAttribute(name = "prevHref")
    public String prevHref;

}
