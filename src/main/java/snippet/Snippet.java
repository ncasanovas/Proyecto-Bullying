package snippet;

public class Snippet {
	--
	-- PostgreSQL database dump
	--
	
	-- Dumped from database version 9.5.8
	-- Dumped by pg_dump version 9.5.8
	
	-- Started on 2017-09-24 00:03:12
	
	SET statement_timeout = 0;
	SET lock_timeout = 0;
	SET client_encoding = 'SQL_ASCII';
	SET standard_conforming_strings = on;
	SET check_function_bodies = false;
	SET client_min_messages = warning;
	SET row_security = off;
	
	--
	-- TOC entry 1 (class 3079 OID 12355)
	-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
	--
	
	CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
	
	
	--
	-- TOC entry 2158 (class 0 OID 0)
	-- Dependencies: 1
	-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
	--
	
	COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
	
	
	SET search_path = public, pg_catalog;
	
	SET default_tablespace = '';
	
	SET default_with_oids = false;
	
	--
	-- TOC entry 181 (class 1259 OID 41280)
	-- Name: centros; Type: TABLE; Schema: public; Owner: postgres
	--
	
	CREATE TABLE centros (
	    id integer NOT NULL,
	    nombre text,
	    descripcion text,
	    direccion text
	);
	
	
	ALTER TABLE centros OWNER TO postgres;
	
	--
	-- TOC entry 182 (class 1259 OID 41286)
	-- Name: centros_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
	--
	
	CREATE SEQUENCE centros_id_seq
	    START WITH 1
	    INCREMENT BY 1
	    NO MINVALUE
	    NO MAXVALUE
	    CACHE 1;
	
	
	ALTER TABLE centros_id_seq OWNER TO postgres;
	
	--
	-- TOC entry 2159 (class 0 OID 0)
	-- Dependencies: 182
	-- Name: centros_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
	--
	
	ALTER SEQUENCE centros_id_seq OWNED BY centros.id;
	
	
	--
	-- TOC entry 183 (class 1259 OID 41288)
	-- Name: contacto; Type: TABLE; Schema: public; Owner: postgres
	--
	
	CREATE TABLE contacto (
	    id integer NOT NULL,
	    mail text,
	    comentario text
	);
	
	
	ALTER TABLE contacto OWNER TO postgres;
	
	--
	-- TOC entry 184 (class 1259 OID 41294)
	-- Name: contacto_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
	--
	
	CREATE SEQUENCE contacto_id_seq
	    START WITH 1
	    INCREMENT BY 1
	    NO MINVALUE
	    NO MAXVALUE
	    CACHE 1;
	
	
	ALTER TABLE contacto_id_seq OWNER TO postgres;
	
	--
	-- TOC entry 2160 (class 0 OID 0)
	-- Dependencies: 184
	-- Name: contacto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
	--
	
	ALTER SEQUENCE contacto_id_seq OWNED BY contacto.id;
	
	
	--
	-- TOC entry 185 (class 1259 OID 41296)
	-- Name: experiencias; Type: TABLE; Schema: public; Owner: postgres
	--
	
	CREATE TABLE experiencias (
	    id integer NOT NULL,
	    usuario text,
	    avatar text,
	    comentario text
	);
	
	
	ALTER TABLE experiencias OWNER TO postgres;
	
	--
	-- TOC entry 186 (class 1259 OID 41302)
	-- Name: experiencias_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
	--
	
	CREATE SEQUENCE experiencias_id_seq
	    START WITH 1
	    INCREMENT BY 1
	    NO MINVALUE
	    NO MAXVALUE
	    CACHE 1;
	
	
	ALTER TABLE experiencias_id_seq OWNER TO postgres;
	
	--
	-- TOC entry 2161 (class 0 OID 0)
	-- Dependencies: 186
	-- Name: experiencias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
	--
	
	ALTER SEQUENCE experiencias_id_seq OWNED BY experiencias.id;
	
	
	--
	-- TOC entry 187 (class 1259 OID 41304)
	-- Name: pensamientospositivos; Type: TABLE; Schema: public; Owner: postgres
	--
	
	CREATE TABLE pensamientospositivos (
	    id integer NOT NULL,
	    usuario text,
	    imagen text
	);
	
	
	ALTER TABLE pensamientospositivos OWNER TO postgres;
	
	--
	-- TOC entry 188 (class 1259 OID 41310)
	-- Name: pensamientos_positivos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
	--
	
	CREATE SEQUENCE pensamientos_positivos_id_seq
	    START WITH 1
	    INCREMENT BY 1
	    NO MINVALUE
	    NO MAXVALUE
	    CACHE 1;
	
	
	ALTER TABLE pensamientos_positivos_id_seq OWNER TO postgres;
	
	--
	-- TOC entry 2162 (class 0 OID 0)
	-- Dependencies: 188
	-- Name: pensamientos_positivos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
	--
	
	ALTER SEQUENCE pensamientos_positivos_id_seq OWNED BY pensamientospositivos.id;
	
	
	--
	-- TOC entry 189 (class 1259 OID 41312)
	-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
	--
	
	CREATE TABLE usuarios (
	    id integer NOT NULL,
	    usuarioc text,
	    password integer,
	    codigo text
	);
	
	
	ALTER TABLE usuarios OWNER TO postgres;
	
	--
	-- TOC entry 190 (class 1259 OID 41318)
	-- Name: usuarios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
	--
	
	CREATE SEQUENCE usuarios_id_seq
	    START WITH 1
	    INCREMENT BY 1
	    NO MINVALUE
	    NO MAXVALUE
	    CACHE 1;
	
	
	ALTER TABLE usuarios_id_seq OWNER TO postgres;
	
	--
	-- TOC entry 2163 (class 0 OID 0)
	-- Dependencies: 190
	-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
	--
	
	ALTER SEQUENCE usuarios_id_seq OWNED BY usuarios.id;
	
	
	--
	-- TOC entry 2010 (class 2604 OID 41320)
	-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY centros ALTER COLUMN id SET DEFAULT nextval('centros_id_seq'::regclass);
	
	
	--
	-- TOC entry 2011 (class 2604 OID 41321)
	-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY contacto ALTER COLUMN id SET DEFAULT nextval('contacto_id_seq'::regclass);
	
	
	--
	-- TOC entry 2012 (class 2604 OID 41322)
	-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY experiencias ALTER COLUMN id SET DEFAULT nextval('experiencias_id_seq'::regclass);
	
	
	--
	-- TOC entry 2013 (class 2604 OID 41323)
	-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY pensamientospositivos ALTER COLUMN id SET DEFAULT nextval('pensamientos_positivos_id_seq'::regclass);
	
	
	--
	-- TOC entry 2014 (class 2604 OID 41324)
	-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY usuarios ALTER COLUMN id SET DEFAULT nextval('usuarios_id_seq'::regclass);
	
	
	--
	-- TOC entry 2141 (class 0 OID 41280)
	-- Dependencies: 181
	-- Data for Name: centros; Type: TABLE DATA; Schema: public; Owner: postgres
	--
	
	INSERT INTO centros VALUES (4, 'Equipo ABA: Anti Bullying Argentina', 'Equipo ABA nace en el año 2010 frente a la necesidad de dar respuesta al fenómeno del Bullying y de la violencia escolar que tanto afecta a los niños y adolescentes. Desde sus inicios, Equipo ABA se consolidó como un proyecto con un abordaje integral y multidimensional que busca trabajar para no sólo reducir los índices de violencia sino también fortalecer la educación en valores y fomentar la sana convivencia escolar. ', 'http://www.equipoaba.com.ar');
	INSERT INTO centros VALUES (5, 'Fundación Horacio Zorraquín', 'Somos una organización de la sociedad civil, fundada en el año 1997 por la Sra. Adela Elortondo de Zorraquín, con el deseo de contribuir con la educación en los valores humanos de nuestro país', 'www.fhz.org.ar');
	INSERT INTO centros VALUES (6, 'Editorial Proyecto CEPA (Clima Emocional Positivo en el Aula)', 'Somos una editorial centrada en la publicación de materiales para educadores, novedosos, prácticos y sólidos desde el punto de vista teórico. Nuestro objetivo es ofrecer a los docentes, terapeutas, padres y a toda persona que trabaje en la tarea de educar niños y adolescentes, libros que respondan a necesidades concretas de su tarea.', 'http://www.proyectocepa.com');
	INSERT INTO centros VALUES (7, 'f', 'd', 'd');
	INSERT INTO centros VALUES (8, 'df', 'd', 'd');
	INSERT INTO centros VALUES (9, 'g', 'g', 'g');
	
	
	--
	-- TOC entry 2164 (class 0 OID 0)
	-- Dependencies: 182
	-- Name: centros_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
	--
	
	SELECT pg_catalog.setval('centros_id_seq', 9, true);
	
	
	--
	-- TOC entry 2143 (class 0 OID 41288)
	-- Dependencies: 183
	-- Data for Name: contacto; Type: TABLE DATA; Schema: public; Owner: postgres
	--
	
	
	
	--
	-- TOC entry 2165 (class 0 OID 0)
	-- Dependencies: 184
	-- Name: contacto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
	--
	
	SELECT pg_catalog.setval('contacto_id_seq', 1, false);
	
	
	--
	-- TOC entry 2145 (class 0 OID 41296)
	-- Dependencies: 185
	-- Data for Name: experiencias; Type: TABLE DATA; Schema: public; Owner: postgres
	--
	
	INSERT INTO experiencias VALUES (16, 'Martín', 'https://cdn.filestackcontent.com/oO5kC54USEGOG6istquN', 'Reconozco que en mi época escolar hacia mucho bullyng, mis victimas eran todas aquellas personas que tenían la particularidad de tormentar a aquellos, que eran tímidos, nerds, etc. En resumen disfrutaba torturando a aquellos que hacían el típico Bullyng.
	Me sentía el defensor de las victimas de esta practica.
	');
	INSERT INTO experiencias VALUES (17, 'Rocío', 'https://cdn.filestackcontent.com/UyEQihCmS4K3xFlSAsCH', 'En la escuela me hacen mucho bullying por ser bajita. Lo hablé con los maestros y dicen que van a poner límites pero me siguen molestando :(.');
	
	
	--
	-- TOC entry 2166 (class 0 OID 0)
	-- Dependencies: 186
	-- Name: experiencias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
	--
	
	SELECT pg_catalog.setval('experiencias_id_seq', 17, true);
	
	
	--
	-- TOC entry 2167 (class 0 OID 0)
	-- Dependencies: 188
	-- Name: pensamientos_positivos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
	--
	
	SELECT pg_catalog.setval('pensamientos_positivos_id_seq', 8, true);
	
	
	--
	-- TOC entry 2147 (class 0 OID 41304)
	-- Dependencies: 187
	-- Data for Name: pensamientospositivos; Type: TABLE DATA; Schema: public; Owner: postgres
	--
	
	INSERT INTO pensamientospositivos VALUES (6, 'Miriam', 'https://cdn.filestackcontent.com/zjwGOTnhSIuztirzpMcj');
	INSERT INTO pensamientospositivos VALUES (7, 'Ernesto', 'https://cdn.filestackcontent.com/Dn63LiWeTCergMfE2CbT');
	INSERT INTO pensamientospositivos VALUES (8, 'Daniela', 'https://cdn.filestackcontent.com/hMgijF0pRDSemE58Aqxj');
	
	
	--
	-- TOC entry 2149 (class 0 OID 41312)
	-- Dependencies: 189
	-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
	--
	
	INSERT INTO usuarios VALUES (1, 'natalia', 1234, 'aea70bd7-b12f-4657-bd42-d8cf8cdfb58d');
	INSERT INTO usuarios VALUES (2, 'daniela', 2255, 'b25f67bf-a7e1-4b0c-a973-f6fc350d57ac');
	
	
	--
	-- TOC entry 2168 (class 0 OID 0)
	-- Dependencies: 190
	-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
	--
	
	SELECT pg_catalog.setval('usuarios_id_seq', 2, true);
	
	
	--
	-- TOC entry 2016 (class 2606 OID 41326)
	-- Name: centros_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY centros
	    ADD CONSTRAINT centros_pkey PRIMARY KEY (id);
	
	
	--
	-- TOC entry 2018 (class 2606 OID 41328)
	-- Name: contacto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY contacto
	    ADD CONSTRAINT contacto_pkey PRIMARY KEY (id);
	
	
	--
	-- TOC entry 2020 (class 2606 OID 41330)
	-- Name: experiencias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY experiencias
	    ADD CONSTRAINT experiencias_pkey PRIMARY KEY (id);
	
	
	--
	-- TOC entry 2024 (class 2606 OID 41332)
	-- Name: nombreUsado; Type: CONSTRAINT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY usuarios
	    ADD CONSTRAINT "nombreUsado" UNIQUE (usuarioc);
	
	
	--
	-- TOC entry 2022 (class 2606 OID 41334)
	-- Name: pensamientos_positivos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY pensamientospositivos
	    ADD CONSTRAINT pensamientos_positivos_pkey PRIMARY KEY (id);
	
	
	--
	-- TOC entry 2026 (class 2606 OID 41336)
	-- Name: usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
	--
	
	ALTER TABLE ONLY usuarios
	    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);
	
	
	--	-- TOC entry 2157 (class 0 OID 0)
	-- Dependencies: 7
	-- Name: public; Type: ACL; Schema: -; Owner: postgres
	--
	
	REVOKE ALL ON SCHEMA public FROM PUBLIC;
	REVOKE ALL ON SCHEMA public FROM postgres;
	GRANT ALL ON SCHEMA public TO postgres;
	GRANT ALL ON SCHEMA public TO PUBLIC;
	
	
	-- Completed on 2017-09-24 00:03:19
	
	--
	-- PostgreSQL database dump complete
	--
	
	
}

