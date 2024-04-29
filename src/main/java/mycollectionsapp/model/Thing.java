package mycollectionsapp.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
public class Thing {

    @Id
    private Long id;

    @NotNull
    private String title;

    private String phone;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private String description;

    private String image;

    private String url;

    private User author;

    private Address address;

    private ThingType type;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;


}
