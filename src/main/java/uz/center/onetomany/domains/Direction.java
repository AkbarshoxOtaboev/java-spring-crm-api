package uz.center.onetomany.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import uz.center.onetomany.utils.TableName;

import javax.persistence.*;

@Entity
@Data
@Table(name = TableName.DIRECTIONS)
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToOne(mappedBy = "direction")
    @JsonIgnore
    private Teacher teacher;



}
