package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileChange complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="fileChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="before-revision" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="after-revision" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relative-file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileChange")
public class FileChange {

    @XmlAttribute(name = "before-revision")
    public String beforeRevision;
    @XmlAttribute(name = "after-revision")
    public String afterRevision;
    @XmlAttribute(name = "file")
    public String file;
    @XmlAttribute(name = "relative-file")
    public String relativeFile;

}
