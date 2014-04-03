package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="investigation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignee" type="{}user" minOccurs="0"/>
 *         &lt;element name="assignment" type="{}comment" minOccurs="0"/>
 *         &lt;element name="scope" type="{}problemScope" minOccurs="0"/>
 *         &lt;element name="target" type="{}problemTarget" minOccurs="0"/>
 *         &lt;element name="resolution" type="{}resolution" minOccurs="0"/>
 *         &lt;element name="responsible" type="{}user" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "investigation", propOrder = {
        "assignee",
        "assignment",
        "scope",
        "target",
        "resolution",
        "responsible"
})
public class Investigation {

    public User assignee;
    public Comment assignment;
    public ProblemScope scope;
    public ProblemTarget target;
    public Resolution resolution;
    public User responsible;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "state")
    public String state;
    @XmlAttribute(name = "href")
    public String href;

}
