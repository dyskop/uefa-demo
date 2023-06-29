--liquibase formatted sql

--changeset dskopinau:1

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

--rollback DROP EXTENSION uuid-ossp
