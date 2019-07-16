package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "city")
public class City {
    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "coord")
    private Coord coord;

    @XmlElement(name = "country")
    private String country;

    @XmlElement(name = "sun")
    private Sun sun;
}
