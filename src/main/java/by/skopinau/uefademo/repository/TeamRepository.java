package by.skopinau.uefademo.repository;

import by.skopinau.uefademo.model.entity.Coach;
import by.skopinau.uefademo.model.entity.Team;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamRepository extends BaseRepository<Team> {

    Optional<Team> findByName(String name);

    boolean existsByName(String name);

    boolean existsByCoach(Coach coach);
}
