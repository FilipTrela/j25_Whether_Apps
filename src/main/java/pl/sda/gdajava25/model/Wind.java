package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "wind")
public class Wind {

    @XmlElement(name = "speed")
    private Speed speed;

    @XmlElement(name = "direction")
    private Direction direction;
}
