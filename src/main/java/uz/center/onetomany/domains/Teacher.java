package uz.center.onetomany.domains;


import lombok.Data;
import uz.center.onetomany.utils.TableName;

import javax.persistence.*;

@Entity
@Data
@Table(name = TableName.TEACHERS)
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "direction_id")
    private Direction direction;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;
}
