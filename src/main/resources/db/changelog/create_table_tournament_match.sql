--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS tournament_match
(
    tournament_id UUID NOT NULL REFERENCES tournament(id),
    match_id      UUID NOT NULL REFERENCES match(id),
    PRIMARY KEY (tournament_id, match_id)
);

--rollback DROP TABLE tournament_match
