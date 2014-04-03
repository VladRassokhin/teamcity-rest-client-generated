package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * <p>Java class for propEntitiesSnapshotDep complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="propEntitiesSnapshotDep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}snapshot-dependency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "propEntitiesSnapshotDep", propOrder = {
        "snapshotDependency"
})
public class PropEntitiesSnapshotDep {

    @XmlElement(name = "snapshot-dependency")
    public List<PropEntitySnapshotDep> snapshotDependency;
    @Key("count")
    public Integer count;

}
