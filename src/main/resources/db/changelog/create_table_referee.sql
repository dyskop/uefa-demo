--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS referee
(
    id         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    first_name VARCHAR(128) NOT NULL,
    last_name  VARCHAR(128) NOT NULL,
    birthdate  TIMESTAMP NOT NULL
);

--rollback DROP TABLE referee
