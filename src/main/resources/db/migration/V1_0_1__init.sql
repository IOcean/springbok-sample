CREATE TABLE user_
(
  id bigint NOT NULL,
  email character varying(255),
  CONSTRAINT user__pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE user_
  OWNER TO springbok;