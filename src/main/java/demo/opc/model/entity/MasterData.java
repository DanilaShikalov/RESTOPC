package demo.opc.model.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "masterscadadataraw")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterData implements Serializable {
    private Long projectid;
    @EmbeddedId
    private MasterDataID id;
    private Long value;
    private String stringvalue;
    private Long quality;
    private Long flags;
}
