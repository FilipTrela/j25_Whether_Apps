package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "precipitation")
public class Precipitation {
    @XmlAttribute(name = "value")
    private double value;
    @XmlAttribute(name = "mode")
    private String mode;
}
