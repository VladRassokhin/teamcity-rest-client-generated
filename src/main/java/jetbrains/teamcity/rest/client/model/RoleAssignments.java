package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>Java class for roleAssignments complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="roleAssignments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}role" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "roleAssignments", propOrder = {
        "role"
})
public class RoleAssignments {

    public List<RoleAssignment> role;

}
