CREATE TABLE account
(
  id bigserial NOT NULL,
  email character varying(255) NOT NULL,
  enabled boolean NOT NULL DEFAULT FALSE,
  password character varying(255),
  signedup_date timestamp without time zone,
  username character varying(30) NOT NULL,
  CONSTRAINT account__pkey PRIMARY KEY (id),
  CONSTRAINT uk_account_email UNIQUE (email),
  CONSTRAINT uk_account_username UNIQUE (username)
);

CREATE TABLE user_
(
  id bigserial NOT NULL,
  account_id bigint,
  firstname character varying(255) NOT NULL,
  lastname character varying(255) NOT NULL,
  CONSTRAINT user_pkey PRIMARY KEY (id),
  CONSTRAINT fk_user_account_account_id FOREIGN KEY (account_id)
      REFERENCES account (id) 
);

CREATE TABLE profile
(
  id bigserial NOT NULL,
  label character varying(255) NOT NULL,
  active boolean NOT NULL DEFAULT TRUE,
  CONSTRAINT profile_pkey PRIMARY KEY (id),
  CONSTRAINT uk_profile_label UNIQUE (label)
);

CREATE TABLE profile_account
(
  id bigserial NOT NULL,
  profile_id bigint NOT NULL,
  account_id bigint NOT NULL,
  CONSTRAINT profile_account_pkey PRIMARY KEY (id),
  CONSTRAINT fk_profile_account_profile_id FOREIGN KEY (profile_id)
      REFERENCES profile (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_profile_account_account_id FOREIGN KEY (account_id)
      REFERENCES account(id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE credential
(
  id bigserial NOT NULL,
  application character varying(255) NOT NULL,
  label character varying(255) NOT NULL,
  CONSTRAINT credential_pkey PRIMARY KEY (id),
  CONSTRAINT uk_credential_label UNIQUE (label)
);

CREATE TABLE profile_credential
(
  id bigserial NOT NULL,
  credential_id bigint NOT NULL,
  profile_id bigint NOT NULL,
  CONSTRAINT profile_credential_pkey PRIMARY KEY (id),
  CONSTRAINT fk_profile_credential_profile_id FOREIGN KEY (profile_id)
      REFERENCES profile (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_profile_credential_credential_id FOREIGN KEY (credential_id)
      REFERENCES credential (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
