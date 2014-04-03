package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for copyOptionsDescription complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="copyOptionsDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectsIdsMap" type="{}properties" minOccurs="0"/>
 *         &lt;element name="buildTypesIdsMap" type="{}properties" minOccurs="0"/>
 *         &lt;element name="vcsRootsIdsMap" type="{}properties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="copyAllAssociatedSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyOptionsDescription", propOrder = {
        "projectsIdsMap",
        "buildTypesIdsMap",
        "vcsRootsIdsMap"
})
@XmlSeeAlso({
        NewBuildTypeDescription.class,
        NewProjectDescription.class
})
public class CopyOptionsDescription {

    public Properties projectsIdsMap;
    public Properties buildTypesIdsMap;
    public Properties vcsRootsIdsMap;
    @XmlAttribute(name = "copyAllAssociatedSettings")
    public Boolean copyAllAssociatedSettings;

}
