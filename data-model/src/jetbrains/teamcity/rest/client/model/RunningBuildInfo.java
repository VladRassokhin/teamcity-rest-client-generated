package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runningBuildInfo complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="runningBuildInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="percentageComplete" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="elapsedSeconds" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="estimatedTotalSeconds" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="currentStageText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outdated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="probablyHanging" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runningBuildInfo")
public class RunningBuildInfo {

    @XmlAttribute(name = "percentageComplete")
    public Integer percentageComplete;
    @XmlAttribute(name = "elapsedSeconds", required = true)
    public long elapsedSeconds;
    @XmlAttribute(name = "estimatedTotalSeconds")
    public Long estimatedTotalSeconds;
    @XmlAttribute(name = "currentStageText")
    public String currentStageText;
    @XmlAttribute(name = "outdated", required = true)
    public boolean outdated;
    @XmlAttribute(name = "probablyHanging", required = true)
    public boolean probablyHanging;

}
