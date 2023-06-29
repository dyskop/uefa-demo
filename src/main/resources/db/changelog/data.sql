--liquibase formatted sql

--changeset dskopinau:1

INSERT INTO coach VALUES
('320419f7-4ed6-4c58-9deb-eeb1984bb74a', 'Richard', 'Huff', '1993-03-17'),
('497f6330-1e32-4beb-ba0a-9aa43ba7f081', 'Robert', 'Riley', '1990-05-11');

INSERT INTO team VALUES
('79212312-2cd0-4c8c-b92e-195ed4a54cd5', 'PSG', 'FRANCE', '320419f7-4ed6-4c58-9deb-eeb1984bb74a'),
('588a033f-9c07-4723-ba61-20d1149e2073', 'Arsenal', 'UNITED_KINGDOM', '497f6330-1e32-4beb-ba0a-9aa43ba7f081');

INSERT INTO footballer VALUES
('86d2f376-118c-4296-ab7e-b55d0e5c5fd3', 'Richard', 'Huff', '1993-03-17', '79212312-2cd0-4c8c-b92e-195ed4a54cd5', 'CF'),
('e7d29eaf-25e1-44bf-8c34-1faa1186cf75', 'Den', 'Norris', '1993-04-17', '79212312-2cd0-4c8c-b92e-195ed4a54cd5', 'GK'),
('4c9e106f-b0df-4f9c-b54f-64eeabd775cc', 'Mark', 'Cook', '1993-05-17', '588a033f-9c07-4723-ba61-20d1149e2073', 'CB'),
('58025517-8da2-4f46-97df-92ee6cc0c203', 'Jack', 'Nilsen', '1993-06-17', '588a033f-9c07-4723-ba61-20d1149e2073', 'CF');

INSERT INTO referee VALUES
('b7ae3176-5b1b-4cf3-bd12-6e455db0414d', 'Din', 'Smith', '1980-04-10');

INSERT INTO tournament VALUES
('300eb456-bc69-4fa0-913b-43e3508b7443', 'Champions League', '2023/2024');

INSERT INTO match VALUES
('ba2a730c-29d7-400b-b581-a88f7c45cb0d', '2023-05-16 15:05:47', 'Emirates', 'b7ae3176-5b1b-4cf3-bd12-6e455db0414d', '2:0');

INSERT INTO match_team VALUES
('ba2a730c-29d7-400b-b581-a88f7c45cb0d', '79212312-2cd0-4c8c-b92e-195ed4a54cd5'),
('ba2a730c-29d7-400b-b581-a88f7c45cb0d', '588a033f-9c07-4723-ba61-20d1149e2073');

INSERT INTO tournament_match VALUES
('300eb456-bc69-4fa0-913b-43e3508b7443', 'ba2a730c-29d7-400b-b581-a88f7c45cb0d');

INSERT INTO team_tournament VALUES
('79212312-2cd0-4c8c-b92e-195ed4a54cd5', '300eb456-bc69-4fa0-913b-43e3508b7443'),
('588a033f-9c07-4723-ba61-20d1149e2073', '300eb456-bc69-4fa0-913b-43e3508b7443');