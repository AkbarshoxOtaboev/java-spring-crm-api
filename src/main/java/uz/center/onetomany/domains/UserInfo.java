package uz.center.onetomany.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import uz.center.onetomany.utils.TableName;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = TableName.USER_INFO)
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "birth_day")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birthDay;

    @Column(name = "passport_info")
    private String passportInfo;

    @Column(name="passport_series")
    private String passporSeries;

    @Column(name = "passport_personal_number")
    private String passportPersonalNumber;

    @Column(name = "cv_uri")
    private String cvUri;

    @JsonIgnore
    @OneToOne(mappedBy = "userInfo")
    private User user;

    @JsonIgnore
    @OneToOne(mappedBy = "userInfo")
    private Teacher teacher;


}
