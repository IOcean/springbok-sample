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

INSERT INTO account(id, email, username, password, token, signedup_date, enabled) VALUES 
(1, 'admin@iocean.fr', 'Admin', '$2a$10$ggIHKT/gYkYk0Bt2yP4xvOybahPn7GfSwC0T3fYhCzrZ9ta9LAYt6', 'b5e655641f1d05a415d5ea30d4fd25dcd03ea4a187c5d121d221454c03770f9f98101c206878b25697a79c924149da6802af8e97fbed4999c0dd838577590d9e', '2015-06-02 11:00:00', true),
(2, 'john@iocean.fr', 'John', '$2a$10$dJ9dhL7FqCDXBb1kKj5y.ub4ohRm7VARPLlg5H.AHcd/T/XVEgpA.', 'c4e655641f1d05a415d5ea30d4fd25dcd03ea4a187c5d121d221454c03770f9f98101c206878b25697a79c924149da6802ad8997fbed4999c0dd838577590d9e', '2015-05-10 14:30:00', true),
(3, 'inactive@iocean.fr', 'Inactive', '$2a$10$dJ9dhL7FqCDXBb1kKj5y.ub4ohRm7VARPLlg5H.AHcd/T/XVEgpA.', 'c4e655641f1d05a415d5ea30d4fd25dcd03ea4a187c5d121d221454c03770f9f98101c206878b25697a79c924149da6802ad8997fbed4999c0dd838577590d9e', '2015-05-10 14:30:00', false);

INSERT INTO profile_account(id, account_id, profile_id) VALUES 
(1, 1, 1),
(2, 2, 2),
(3, 3, 2);

INSERT INTO user_(id, account_id, first_name, last_name) VALUES 
(1, 1, 'Admin', 'Admin'),
(2, 2, 'Johnathan', 'Scurfield'),
(3, 3, '', 'Iocean');