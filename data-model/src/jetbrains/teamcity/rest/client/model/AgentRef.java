package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent-ref complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="agent-ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "agent-ref")
public class AgentRef {

    @Key("id")
    public Integer id;
    @Key("name")
    public String name;
    @Key("typeId")
    public Integer typeId;
    @Key("href")
    public String href;
    @Key("locator")
    public String locator;

}
