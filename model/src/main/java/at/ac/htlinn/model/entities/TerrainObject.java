package at.ac.htlinn.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "TERRAIN")
public class TerrainObject {
    @Id
    @SequenceGenerator(name = "terrain_seq", sequenceName = "TERRAIN_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terrain_seq")
    @Column(name = "ID")
    private long terrainId;

    @Column(name = "USER_ID")
    private long userID;

    @JsonIgnore
    @Column(name = "HASH_VALUE", unique = true)
    private int hashValue;

    @Column(name = "TERRAIN_NAME")
    private String terrainName;

    @Column(name = "WIDTH")
    private int width;

    @Column(name = "HEIGHT")
    private int height;

    @OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Field> customFields = new HashSet<>();

//    @OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    private Set<HamsterObject> hamsters = new HashSet<>();

    @OneToOne(mappedBy = "terrain", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private HamsterObject defaultHamster;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TerrainObject that = (TerrainObject) o;
        return Objects.equals(userID, that.userID) && Objects.equals(terrainName, that.terrainName)&& Objects.equals(width, that.width)
                && Objects.equals(height, that.height) && Objects.equals(customFields, that.customFields);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userID, terrainName, width, height, /*hamsters*/defaultHamster, customFields);
    }
}
