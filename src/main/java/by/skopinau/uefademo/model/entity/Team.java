package by.skopinau.uefademo.model.entity;

import by.skopinau.uefademo.model.enums.Country;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Country country;
    @OneToOne(optional = false)
    private Coach coach;
    @OneToMany(mappedBy = "team", orphanRemoval = true)
    private Set<Footballer> squad = new HashSet<>();
    @ManyToMany(mappedBy = "teams")
    private Set<Match> matches = new HashSet<>();
}
