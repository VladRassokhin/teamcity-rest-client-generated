package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *         &lt;element ref="{}roles" minOccurs="0"/>
 *         &lt;element ref="{}groups" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastLogin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="realm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "user", propOrder = {
        "properties",
        "roles",
        "groups"
})
public class User {

    public Properties properties;
    public RoleAssignments roles;
    public Groups groups;
    @Key("username")
    public String username;
    @Key("name")
    public String name;
    @Key("id")
    public Long id;
    @Key("email")
    public String email;
    @Key("lastLogin")
    public String lastLogin;
    @Key("password")
    public String password;
    @Key("href")
    public String href;
    @Key("realm")
    public String realm;

}
