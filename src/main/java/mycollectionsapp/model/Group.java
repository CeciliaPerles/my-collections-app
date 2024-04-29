package mycollectionsapp.model;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
public class Group {
    @Id
    private Long id;

    @NotNull
    private String title;

    private String description;

    private User author;

    private List<User> members;

    private List<Thing> things;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;
}
