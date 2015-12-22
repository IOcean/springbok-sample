CREATE TABLE user_
(
  id bigserial NOT NULL,
  email character varying(255) NOT NULL,
  enabled boolean NOT NULL DEFAULT FALSE,
  password character varying(255),
  signedup_date timestamp without time zone,
  token character varying(255) NOT NULL,
  username character varying(30) NOT NULL,
  CONSTRAINT user__pkey PRIMARY KEY (id),
  CONSTRAINT uk_user_email UNIQUE (email),
  CONSTRAINT uk_user_username UNIQUE (username)
);

CREATE TABLE profile
(
  id bigserial NOT NULL,
  label character varying(255) NOT NULL,
  CONSTRAINT profile_pkey PRIMARY KEY (id),
  CONSTRAINT uk_profile_label UNIQUE (label)
);

CREATE TABLE user_profile
(
  id bigserial NOT NULL,
  profiledetails_id bigint NOT NULL,
  userdetails_id bigint NOT NULL,
  CONSTRAINT user_profile_pkey PRIMARY KEY (id),
  CONSTRAINT fk_user_profile_profiledetails_id FOREIGN KEY (profiledetails_id)
      REFERENCES profile (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_user_profile_userdetails_id FOREIGN KEY (userdetails_id)
      REFERENCES user_ (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE credential
(
  id bigserial NOT NULL,
  label character varying(255) NOT NULL,
  CONSTRAINT credential_pkey PRIMARY KEY (id),
  CONSTRAINT uk_credential_label UNIQUE (label)
);

CREATE TABLE profile_credential
(
  id bigserial NOT NULL,
  credentialdetails_id bigint NOT NULL,
  profiledetails_id bigint NOT NULL,
  CONSTRAINT profile_credential_pkey PRIMARY KEY (id),
  CONSTRAINT fk_profile_credential_profiledetails_id FOREIGN KEY (profiledetails_id)
      REFERENCES profile (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_profile_credential_credentialdetails_id FOREIGN KEY (credentialdetails_id)
      REFERENCES credential (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
