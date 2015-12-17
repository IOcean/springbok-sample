INSERT INTO credential(id, label) VALUES
(1, 'ADMINISTRATION');

INSERT INTO profile(id, label) VALUES
(1, 'ADMIN');

INSERT INTO profile_credential(id, profiledetails_id, credentialdetails_id) VALUES 
(1, 1, 1);

INSERT INTO user_profile(id, userdetails_id, profiledetails_id) VALUES 
(1, 1, 1);

INSERT INTO user(id, email, username, password, token, signedup_date, enabled) VALUES 
(1, 'admin@iocean.fr', 'admin', '$2a$10$Gdut0FQgJ9qxNvLLShDyW./sh1scqFYDjT6I.ClHwZMW.LP82nude', 'b5e655641f1d05a415d5ea30d4fd25dcd03ea4a187c5d121d221454c03770f9f98101c206878b25697a79c924149da6802af8e97fbed4999c0dd838577590d9e', '2015-06-02 11:00:00', true);
