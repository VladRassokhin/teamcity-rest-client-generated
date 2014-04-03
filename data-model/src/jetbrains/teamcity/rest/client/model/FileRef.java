package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

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

@XmlType(name = "file-ref")
@XmlSeeAlso({
        File.class
})
public class FileRef {

    @Key("name")
    public String name;
    @Key("href")
    public String href;

}
