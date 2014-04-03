package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemTarget complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="problemTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}tests" minOccurs="0"/>
 *         &lt;element ref="{}problems" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="anyProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "problemTarget", propOrder = {
        "tests",
        "problems"
})
public class ProblemTarget {

    public Tests tests;
    public Problems problems;
    @Key("anyProblem")
    public Boolean anyProblem;

}
