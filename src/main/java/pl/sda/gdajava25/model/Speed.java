package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "speed")
public class Speed {

    @XmlAttribute(name = "value")
    private double value;

    @XmlAttribute(name = "name")
    private String name;
}
