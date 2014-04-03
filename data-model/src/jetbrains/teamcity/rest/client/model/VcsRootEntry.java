package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for vcs-root-entry complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="vcs-root-entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root" type="{}vcs-root-ref" minOccurs="0"/>
 *         &lt;element name="checkout-rules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-entry", propOrder = {
        "vcsRoot",
        "checkoutRules"
})
public class VcsRootEntry {

    @XmlElement(name = "vcs-root")
    public VcsRootRef vcsRoot;
    @XmlElement(name = "checkout-rules")
    public String checkoutRules;
    @XmlAttribute(name = "id")
    public String id;

}
