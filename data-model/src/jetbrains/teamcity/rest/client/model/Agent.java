
package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *         &lt;element name="pool" type="{}agentPool-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="connected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="authorized" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="uptodate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {
    "properties",
    "pool"
})
public class Agent {

    public Properties properties;
    public AgentPoolRef pool;
    @XmlAttribute(name = "href")
    public String href;
    @XmlAttribute(name = "id")
    public Integer id;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "typeId")
    public Integer typeId;
    @XmlAttribute(name = "connected", required = true)
    public boolean connected;
    @XmlAttribute(name = "enabled", required = true)
    public boolean enabled;
    @XmlAttribute(name = "authorized", required = true)
    public boolean authorized;
    @XmlAttribute(name = "uptodate", required = true)
    public boolean uptodate;
    @XmlAttribute(name = "ip")
    public String ip;
    @XmlAttribute(name = "locator")
    public String locator;

}
