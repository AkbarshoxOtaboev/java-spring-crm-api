package uz.center.onetomany.domains;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import uz.center.onetomany.utils.TableName;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = TableName.GROUPS)
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date startDate;


}
