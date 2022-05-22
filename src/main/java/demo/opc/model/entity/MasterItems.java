package demo.opc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "masterscadadataitems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterItems implements Serializable {
    private Long projectid;
    @Id
    private Long itemid;
    private String name;
    private Integer vartype;
    private Integer intervalid;
    private Long firsttime;
    private Long lasttime;
    private Long valuescount;
    @OneToMany(targetEntity = MasterData.class)
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    private List<MasterData> dataList;
}
