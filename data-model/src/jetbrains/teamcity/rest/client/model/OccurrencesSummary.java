package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for occurrencesSummary complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="occurrencesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="passed" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="failed" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="newFailed" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="muted" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "occurrencesSummary")
@XmlSeeAlso({
        ProblemOccurrences.class,
        TestOccurrences.class
})
public class OccurrencesSummary {

    @Key("passed")
    public Integer passed;
    @Key("failed")
    public Integer failed;
    @Key("newFailed")
    public Integer newFailed;
    @Key("ignored")
    public Integer ignored;
    @Key("muted")
    public Integer muted;

}
