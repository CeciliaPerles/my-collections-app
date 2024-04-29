package mycollectionsapp.model;
import com.sun.istack.NotNull;
import org.intellij.lang.annotations.Pattern;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    private Long id;

    private Boolean active;

    @Pattern("[0-9]+")
    private String email;
    @NotNull
    private String firstName;

    @Pattern("[0-9]+")
    private String phone;

    @NotNull
    private String lastName;

    private Date lastLoginDate;

    private String description;

    private User author;

    private List<User> members;

    private List<Thing> things;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;
}

