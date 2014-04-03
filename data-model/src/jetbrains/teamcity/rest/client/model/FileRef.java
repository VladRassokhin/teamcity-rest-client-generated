package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for file-ref complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="file-ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file-ref")
@XmlSeeAlso({
        File.class
})
public class FileRef {

    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "href")
    public String href;

}
