package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcsLabelingOptions complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="vcsLabelingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcsRoots" type="{}vcs-roots" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="labelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsLabelingOptions", propOrder = {
        "branchFilter",
        "vcsRoots"
})
public class VcsLabelingOptions {

    public String branchFilter;
    public VcsRoots vcsRoots;
    @XmlAttribute(name = "labelName")
    public String labelName;
    @XmlAttribute(name = "type")
    public String type;

}
