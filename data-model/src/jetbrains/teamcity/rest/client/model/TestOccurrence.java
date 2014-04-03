package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testOccurrence complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */

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
    @Key("id")
    public String id;
    @Key("name")
    public String name;
    @Key("status")
    public String status;
    @Key("ignored")
    public Boolean ignored;
    @Key("duration")
    public Integer duration;
    @Key("muted")
    public Boolean muted;
    @Key("currentlyMuted")
    public Boolean currentlyMuted;
    @Key("currentlyInvestigated")
    public Boolean currentlyInvestigated;
    @Key("href")
    public String href;

}
