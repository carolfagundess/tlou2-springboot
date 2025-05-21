INSERT INTO tb_character_list (name) VALUES ('Jackson City');
INSERT INTO tb_character_list (name) VALUES ('Washington Liberation Front');
INSERT INTO tb_character_list (name) VALUES ('Seraphites');

INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Ellie', 'Jackson', 'Female', 'Protagonist', 'Alive', 'https://static.wikia.nocookie.net/thelastofus/images/9/9f/Ellie_TLOU_Part_II.png', 'Determined survivor', 'Ellie is the main protagonist of The Last of Us Part II, known for her resilience, resourcefulness, and strong sense of justice.');
INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Jesse', 'Jackson', 'Male', 'Survivor', 'Deceased', 'https://static.wikia.nocookie.net/thelastofus/images/7/7d/Jesse_TLOU_Part_II.png', 'Reliable friend', 'Jesse is a trusted friend of Ellie and Dina, always ready to help his community.');
INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Dina', 'Jackson', 'Female', 'Survivor', 'Alive', 'https://static.wikia.nocookie.net/thelastofus/images/6/6c/Dina_TLOU_Part_II.png', 'Loyal and loving', 'Dina is Ellie''s girlfriend and a key companion during her journey of revenge.');
INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Abby Anderson', 'WLF', 'Female', 'Soldier', 'Alive', 'https://static.wikia.nocookie.net/thelastofus/images/9/9c/Abby_TLOU_Part_II.png', 'Determined and skilled soldier', 'Abby is a member of the Washington Liberation Front (WLF) seeking revenge for her father''s death.');
INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Isaac Dixon', 'WLF', 'Male', 'Leader', 'Deceased', 'https://static.wikia.nocookie.net/thelastofus/images/3/3b/Isaac_TLOU_Part_II.png', 'Leader of the WLF', 'Isaac is the strict and determined leader of the Washington Liberation Front.');
INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Nora Harris', 'WLF', 'Female', 'Soldier', 'Deceased', 'https://static.wikia.nocookie.net/thelastofus/images/2/2b/Nora_TLOU_Part_II.png', 'Resourceful and brave', 'Nora is a WLF soldier and former Firefly who faces a tragic fate during Ellie''s quest.');
INSERT INTO tb_character (name, faction, genre, role, status, img_url, short_description, long_description) VALUES ('Seraphite Leader', 'Seraphites', 'Female', 'Leader', 'Deceased', 'https://static.wikia.nocookie.net/thelastofus/images/6/6e/Seraphite_Leader_TLOU_Part_II.png', 'Charismatic cult leader', 'The Seraphite Leader is the spiritual head of the Seraphites, guiding her people with strict rules.');

INSERT INTO tb_belonging(list_id, character_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging(list_id, character_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging(list_id, character_id, position) VALUES (1, 3, 2);

INSERT INTO tb_belonging(list_id, character_id, position) VALUES (2, 4, 0);
INSERT INTO tb_belonging(list_id, character_id, position) VALUES (2, 5, 1);
INSERT INTO tb_belonging(list_id, character_id, position) VALUES (2, 6, 2);

INSERT INTO tb_belonging(list_id, character_id, position) VALUES (3, 7, 0);