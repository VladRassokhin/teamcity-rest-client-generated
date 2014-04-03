package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

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

@XmlType(name = "runningBuildInfo")
public class RunningBuildInfo {

    @Key("percentageComplete")
    public Integer percentageComplete;
    @Key("elapsedSeconds")
    public long elapsedSeconds;
    @Key("estimatedTotalSeconds")
    public Long estimatedTotalSeconds;
    @Key("currentStageText")
    public String currentStageText;
    @Key("outdated")
    public boolean outdated;
    @Key("probablyHanging")
    public boolean probablyHanging;

}
