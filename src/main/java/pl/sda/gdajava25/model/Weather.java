package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "weather")
public class Weather {

    @XmlAttribute(name = "number")
    private int number;

    @XmlAttribute(name = "value")
    private String value;

    @XmlAttribute(name = "icon")
    private String icon;
}
