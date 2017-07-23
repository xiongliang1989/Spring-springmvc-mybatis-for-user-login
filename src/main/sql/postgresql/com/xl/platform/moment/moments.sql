-- Table: public.moments

-- DROP TABLE public.moments;

CREATE TABLE public.moments
(
    cdate date,
    mdate date,
    name character varying COLLATE pg_catalog."default",
    user_id integer,
    id integer NOT NULL DEFAULT nextval('moments_id_seq'::regclass),
    CONSTRAINT moments_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.moments
    OWNER to postgres;