CREATE TABLE user_(
    id BIGSERIAL PRIMARY KEY, 
    email VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL UNIQUE, 
    password VARCHAR(255) NOT NULL,
    token VARCHAR(128) NOT NULL,
    signedup_date DATETIME,
    enabled BOOLEAN NOT NULL DEFAULT FALSE
); 

CREATE TABLE profile(
    id BIGSERIAL PRIMARY KEY,
    label VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE user_profile(
    id BIGSERIAL PRIMARY KEY,
    userdetails_id BIGINT NOT NULL,
    profiledetails_id BIGINT NOT NULL,
    UNIQUE(userdetails_id, profiledetails_id),
    FOREIGN KEY (userdetails_id) REFERENCES user_(id),
    FOREIGN KEY (profiledetails_id) REFERENCES profile(id)
);

CREATE TABLE credential(
    id BIGSERIAL PRIMARY KEY,
    label VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE profile_credential(
    id BIGSERIAL PRIMARY KEY,
    profiledetails_id BIGINT NOT NULL,
    credentialdetails_id BIGINT NOT NULL,
    UNIQUE(userdetails_id, credentialdetails_id),
    FOREIGN KEY (profiledetails_id) REFERENCES profile(id),
    FOREIGN KEY (credentialdetails_id) REFERENCES credential(id)
);