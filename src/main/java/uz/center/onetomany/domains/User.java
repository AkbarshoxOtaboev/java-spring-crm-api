package uz.center.onetomany.domains;

import lombok.Data;
import uz.center.onetomany.utils.TableName;

import javax.persistence.*;

@Entity
@Data
@Table(name = TableName.USERS)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_info_id")
    private UserInfo  userInfo;
}
