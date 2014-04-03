package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.*;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "occurrencesSummary")
@XmlSeeAlso({
        ProblemOccurrences.class,
        TestOccurrences.class
})
public class OccurrencesSummary {

    @XmlAttribute(name = "passed")
    public Integer passed;
    @XmlAttribute(name = "failed")
    public Integer failed;
    @XmlAttribute(name = "newFailed")
    public Integer newFailed;
    @XmlAttribute(name = "ignored")
    public Integer ignored;
    @XmlAttribute(name = "muted")
    public Integer muted;

}
