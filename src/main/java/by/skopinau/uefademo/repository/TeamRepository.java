package by.skopinau.uefademo.repository;

import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.model.entity.Coach;
import by.skopinau.uefademo.model.entity.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends BaseRepository<Team> {

    /*@Override
    @Query(value = """
            select *
            from team as t
            left join footballer f on t.id = f.team_id
            left join match_team mt on t.id = mt.team_id""",
    nativeQuery = true)
    List<Team> findAll();*/

    Optional<Team> findByName(String name);

    boolean existsByName(String name);

    boolean existsByCoach(Coach coach);
}
