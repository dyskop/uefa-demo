package by.skopinau.uefademo.repository;

import by.skopinau.uefademo.model.entity.Coach;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoachRepository extends BaseRepository<Coach> {

    Optional<Coach> findByFirstNameAndLastName(String firstName, String lastName);

    boolean existsByFirstNameAndLastName(String firstName, String lastName);
}
