package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="file">
 *   &lt;complexContent>
 *     &lt;extension base="{}file-ref">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{}file-ref" minOccurs="0"/>
 *         &lt;element name="content" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="children" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="modificationTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "file", propOrder = {
        "parent",
        "content",
        "children"
})
public class File
        extends FileRef {

    public FileRef parent;
    public HReference content;
    public HReference children;
    @XmlAttribute(name = "size")
    public Long size;
    @XmlAttribute(name = "modificationTime")
    public String modificationTime;

}
