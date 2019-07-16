package pl.sda.gdajava25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "sun")
public class Sun {
    @XmlAttribute(name = "rise")
    private LocalDateTime rise;

    @XmlAttribute(name = "set")
    private LocalDateTime set;
}
