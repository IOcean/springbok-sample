INSERT INTO credential(id, application, label) VALUES
(1, 'INTRANET', 'CREATE'),
(2, 'INTRANET', 'VIEW'),
(3, 'INTRANET', 'UPDATE'),
(4, 'INTRANET', 'DELETE');

INSERT INTO profile(id, label, active) VALUES
(1, 'ADMIN', true),    
(2, 'USER', true); 

INSERT INTO profile_credential(id, profile_id, credential_id) VALUES 
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 1, 4),
(5, 2, 2);

INSERT INTO account(id, email, username, password, signedup_date, enabled) VALUES 
(1, 'admin@iocean.fr', 'Admin', '$2a$04$LW6Bs3Wb7AWkg1kCSsuqsuMN1Gjs3qXFASZwfJEO/0Oi/AjpD5wNa', '2015-06-02 11:00:00', true);

INSERT INTO profile_account(id, account_id, profile_id) VALUES 
(1, 1, 1);

INSERT INTO user_(id, account_id, firstname, lastname) VALUES 
(1, 1, 'Admin', 'Admin');

