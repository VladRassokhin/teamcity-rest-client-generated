
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="problem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}mutes" minOccurs="0"/>
 *         &lt;element ref="{}investigations" minOccurs="0"/>
 *         &lt;element ref="{}problemOccurrences" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "problem", propOrder = {
    "mutes",
    "investigations",
    "problemOccurrences"
})
public class Problem {

    public Mutes mutes;
    public Investigations investigations;
    public ProblemOccurrences problemOccurrences;
    @XmlAttribute(name = "id")
    public String id;
    @XmlAttribute(name = "type")
    public String type;
    @XmlAttribute(name = "identity")
    public String identity;
    @XmlAttribute(name = "href")
    public String href;

}
