
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testOccurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testOccurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ignoreDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}test" minOccurs="0"/>
 *         &lt;element name="mute" type="{}mute" minOccurs="0"/>
 *         &lt;element ref="{}build" minOccurs="0"/>
 *         &lt;element name="firstFailed" type="{}testOccurrence" minOccurs="0"/>
 *         &lt;element name="nextFixed" type="{}testOccurrence" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="muted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currentlyMuted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currentlyInvestigated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testOccurrence", propOrder = {
    "ignoreDetails",
    "details",
    "test",
    "mute",
    "build",
    "firstFailed",
    "nextFixed"
})
public class TestOccurrence {

    public String ignoreDetails;
    public String details;
    public Test test;
    public Mute mute;
    public Build build;
    public TestOccurrence firstFailed;
    public TestOccurrence nextFixed;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "status")
    public String status;
    @XmlAttribute(name = "ignored")
    public Boolean ignored;
    @XmlAttribute(name = "duration")
    public Integer duration;
    @XmlAttribute(name = "muted")
    public Boolean muted;
    @XmlAttribute(name = "currentlyMuted")
    public Boolean currentlyMuted;
    @XmlAttribute(name = "currentlyInvestigated")
    public Boolean currentlyInvestigated;
    @XmlAttribute(name = "href")
    public String href;

}
