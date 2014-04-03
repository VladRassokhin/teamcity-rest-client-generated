package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for test complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}mutes" minOccurs="0"/>
 *         &lt;element ref="{}investigations" minOccurs="0"/>
 *         &lt;element ref="{}testOccurrences" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", propOrder = {
        "mutes",
        "investigations",
        "testOccurrences"
})
public class Test {

    public Mutes mutes;
    public Investigations investigations;
    public TestOccurrences testOccurrences;
    @XmlAttribute(name = "id")
    public Long id;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "href")
    public String href;

}
