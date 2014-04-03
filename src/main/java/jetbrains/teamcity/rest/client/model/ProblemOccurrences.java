package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>Java class for problemOccurrences complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="problemOccurrences">
 *   &lt;complexContent>
 *     &lt;extension base="{}occurrencesSummary">
 *       &lt;sequence>
 *         &lt;element ref="{}problemOccurrence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nextHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prevHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "problemOccurrences", propOrder = {
        "problemOccurrence"
})
public class ProblemOccurrences
        extends OccurrencesSummary {

    public List<ProblemOccurrence> problemOccurrence;
    @Key("count")
    public Integer count;
    @Key("href")
    public String href;
    @Key("nextHref")
    public String nextHref;
    @Key("prevHref")
    public String prevHref;

}
