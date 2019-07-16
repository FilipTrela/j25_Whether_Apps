package pl.sda.gdajava25.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "humidity")
public class Humidity {
    @XmlAttribute(name = "value")
    private double value;
    @XmlAttribute(name = "unit")
    private String unit;
}
