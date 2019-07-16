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
@XmlRootElement(name = "lastupdate")
public class Lastupdate {

    @XmlAttribute(name = "value")
    private LocalDateTime value;
}
