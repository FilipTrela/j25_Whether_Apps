package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "coord")
public class Coord {
    @XmlAttribute(name = "lot")
    private double lon;

    @XmlAttribute(name = "lat")
    private double lat;
}
