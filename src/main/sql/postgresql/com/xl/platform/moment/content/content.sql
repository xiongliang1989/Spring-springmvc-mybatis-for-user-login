-- Table: public.content

-- DROP TABLE public.content;

CREATE TABLE public.content
(
    cdate date,
    mdate date,
    moments_id integer,
    id integer NOT NULL DEFAULT nextval('content_id_seq'::regclass),
    content_data character varying COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.content
    OWNER to postgres;