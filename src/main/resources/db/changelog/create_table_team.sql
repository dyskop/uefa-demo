--liquibase formatted sql

--changeset dskopinau:1

CREATE TABLE IF NOT EXISTS team
(
    id       UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name     VARCHAR(128) NOT NULL,
    country  VARCHAR(128) NOT NULL,
    coach_id UUID UNIQUE REFERENCES coach(id) ON DELETE SET NULL
);

--rollback DROP TABLE team
