package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>Java class for propEntitiesAgentRequirement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="propEntitiesAgentRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}agent-requirement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propEntitiesAgentRequirement", propOrder = {
        "agentRequirement"
})
public class PropEntitiesAgentRequirement {

    @XmlElement(name = "agent-requirement")
    public List<PropEntityAgentRequirement> agentRequirement;
    @XmlAttribute(name = "count")
    public Integer count;

}
