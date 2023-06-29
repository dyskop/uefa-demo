--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS match
(
    id              UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    start_date_time TIMESTAMP NOT NULL,
    stadium         VARCHAR(128) NOT NULL,
    referee_id      UUID NOT NULL REFERENCES referee(id),
    result          VARCHAR(128)
);

--rollback DROP TABLE match
