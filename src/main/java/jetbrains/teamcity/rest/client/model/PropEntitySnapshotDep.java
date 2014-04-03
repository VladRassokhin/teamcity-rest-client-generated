package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propEntitySnapshotDep complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="propEntitySnapshotDep">
 *   &lt;complexContent>
 *     &lt;extension base="{}propEntity">
 *       &lt;sequence>
 *         &lt;element name="source-buildType" type="{}buildType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "propEntitySnapshotDep", propOrder = {
        "sourceBuildType"
})
public class PropEntitySnapshotDep
        extends PropEntity {

    @Key("source-buildType")
    public BuildType sourceBuildType;

}
