--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS match_team
(
    match_id UUID NOT NULL REFERENCES match(id),
    team_id  UUID NOT NULL REFERENCES team(id),
    PRIMARY KEY (match_id, team_id)
);

--rollback DROP TABLE match_team
