--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS tournament
(
    id     UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name   VARCHAR(128) NOT NULL,
    season VARCHAR(128) UNIQUE NOT NULL
);

--rollback DROP TABLE tournament
