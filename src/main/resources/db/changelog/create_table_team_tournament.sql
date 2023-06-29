--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS team_tournament
(
    team_id       UUID NOT NULL REFERENCES team(id),
    tournament_id UUID NOT NULL REFERENCES tournament(id),
    PRIMARY KEY (team_id, tournament_id)
);

--rollback DROP TABLE team_tournament
