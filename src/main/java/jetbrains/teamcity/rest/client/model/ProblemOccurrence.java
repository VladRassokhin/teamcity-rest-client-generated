package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemOccurrence complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="problemOccurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}problem" minOccurs="0"/>
 *         &lt;element name="mute" type="{}mute" minOccurs="0"/>
 *         &lt;element ref="{}build" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="muted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currentlyInvestigated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currentlyMuted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "problemOccurrence", propOrder = {
        "details",
        "additionalData",
        "problem",
        "mute",
        "build"
})
public class ProblemOccurrence {

    public String details;
    public String additionalData;
    public Problem problem;
    public Mute mute;
    public Build build;
    @Key("id")
    public String id;
    @Key("type")
    public String type;
    @Key("identity")
    public String identity;
    @Key("href")
    public String href;
    @Key("muted")
    public Boolean muted;
    @Key("currentlyInvestigated")
    public Boolean currentlyInvestigated;
    @Key("currentlyMuted")
    public Boolean currentlyMuted;

}
