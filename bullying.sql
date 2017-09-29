--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.4
-- Dumped by pg_dump version 9.6.4

-- Started on 2017-09-27 12:54:01

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'SQL_ASCII';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12387)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2180 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 185 (class 1259 OID 16862)
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
-- TOC entry 186 (class 1259 OID 16868)
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
-- TOC entry 2181 (class 0 OID 0)
-- Dependencies: 186
-- Name: centros_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE centros_id_seq OWNED BY centros.id;


--
-- TOC entry 187 (class 1259 OID 16870)
-- Name: contacto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE contacto (
    id integer NOT NULL,
    mail text,
    comentario text
);


ALTER TABLE contacto OWNER TO postgres;

--
-- TOC entry 188 (class 1259 OID 16876)
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
-- TOC entry 2182 (class 0 OID 0)
-- Dependencies: 188
-- Name: contacto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE contacto_id_seq OWNED BY contacto.id;


--
-- TOC entry 189 (class 1259 OID 16878)
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
-- TOC entry 190 (class 1259 OID 16884)
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
-- TOC entry 2183 (class 0 OID 0)
-- Dependencies: 190
-- Name: experiencias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE experiencias_id_seq OWNED BY experiencias.id;


--
-- TOC entry 191 (class 1259 OID 16886)
-- Name: pensamientospositivos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE pensamientospositivos (
    id integer NOT NULL,
    usuario text,
    imagen text
);


ALTER TABLE pensamientospositivos OWNER TO postgres;

--
-- TOC entry 192 (class 1259 OID 16892)
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
-- TOC entry 2184 (class 0 OID 0)
-- Dependencies: 192
-- Name: pensamientos_positivos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE pensamientos_positivos_id_seq OWNED BY pensamientospositivos.id;


--
-- TOC entry 193 (class 1259 OID 16894)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE usuarios (
    id integer NOT NULL,
    usuarioc text,
    codigo text,
    password text
);


ALTER TABLE usuarios OWNER TO postgres;

--
-- TOC entry 194 (class 1259 OID 16900)
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
-- TOC entry 2185 (class 0 OID 0)
-- Dependencies: 194
-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE usuarios_id_seq OWNED BY usuarios.id;


--
-- TOC entry 2030 (class 2604 OID 16902)
-- Name: centros id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY centros ALTER COLUMN id SET DEFAULT nextval('centros_id_seq'::regclass);


--
-- TOC entry 2031 (class 2604 OID 16903)
-- Name: contacto id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY contacto ALTER COLUMN id SET DEFAULT nextval('contacto_id_seq'::regclass);


--
-- TOC entry 2032 (class 2604 OID 16904)
-- Name: experiencias id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY experiencias ALTER COLUMN id SET DEFAULT nextval('experiencias_id_seq'::regclass);


--
-- TOC entry 2033 (class 2604 OID 16905)
-- Name: pensamientospositivos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY pensamientospositivos ALTER COLUMN id SET DEFAULT nextval('pensamientos_positivos_id_seq'::regclass);


--
-- TOC entry 2034 (class 2604 OID 16906)
-- Name: usuarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuarios ALTER COLUMN id SET DEFAULT nextval('usuarios_id_seq'::regclass);


--
-- TOC entry 2164 (class 0 OID 16862)
-- Dependencies: 185
-- Data for Name: centros; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY centros (id, nombre, descripcion, direccion) FROM stdin;
4	Equipo ABA: Anti Bullying Argentina	Equipo ABA nace en el año 2010 frente a la necesidad de dar respuesta al fenómeno del Bullying y de la violencia escolar que tanto afecta a los niños y adolescentes. Desde sus inicios, Equipo ABA se consolidó como un proyecto con un abordaje integral y multidimensional que busca trabajar para no sólo reducir los índices de violencia sino también fortalecer la educación en valores y fomentar la sana convivencia escolar. 	http://www.equipoaba.com.ar
5	Fundación Horacio Zorraquín	Somos una organización de la sociedad civil, fundada en el año 1997 por la Sra. Adela Elortondo de Zorraquín, con el deseo de contribuir con la educación en los valores humanos de nuestro país	www.fhz.org.ar
6	Editorial Proyecto CEPA (Clima Emocional Positivo en el Aula)	Somos una editorial centrada en la publicación de materiales para educadores, novedosos, prácticos y sólidos desde el punto de vista teórico. Nuestro objetivo es ofrecer a los docentes, terapeutas, padres y a toda persona que trabaje en la tarea de educar niños y adolescentes, libros que respondan a necesidades concretas de su tarea.	http://www.proyectocepa.com
12	Centro	fsfasfsafsa	afasaf aff 
13	f	f	f
14	f	f	f
15	fg	g	g
\.


--
-- TOC entry 2186 (class 0 OID 0)
-- Dependencies: 186
-- Name: centros_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('centros_id_seq', 15, true);


--
-- TOC entry 2166 (class 0 OID 16870)
-- Dependencies: 187
-- Data for Name: contacto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY contacto (id, mail, comentario) FROM stdin;
1	hfh	fgjg
2	v	v
3	soledad	fsfasfasf
\.


--
-- TOC entry 2187 (class 0 OID 0)
-- Dependencies: 188
-- Name: contacto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('contacto_id_seq', 3, true);


--
-- TOC entry 2168 (class 0 OID 16878)
-- Dependencies: 189
-- Data for Name: experiencias; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY experiencias (id, usuario, avatar, comentario) FROM stdin;
16	Martín	https://cdn.filestackcontent.com/oO5kC54USEGOG6istquN	Reconozco que en mi época escolar hacia mucho bullyng, mis victimas eran todas aquellas personas que tenían la particularidad de tormentar a aquellos, que eran tímidos, nerds, etc. En resumen disfrutaba torturando a aquellos que hacían el típico Bullyng.\nMe sentía el defensor de las victimas de esta practica.\n
17	Rocío	https://cdn.filestackcontent.com/UyEQihCmS4K3xFlSAsCH	En la escuela me hacen mucho bullying por ser bajita. Lo hablé con los maestros y dicen que van a poner límites pero me siguen molestando :(.
23	federico	https://cdn.filestackcontent.com/otjQH6W7T7OXM9APA9Hx	dgdhfhfdyi dyttu
\.


--
-- TOC entry 2188 (class 0 OID 0)
-- Dependencies: 190
-- Name: experiencias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('experiencias_id_seq', 23, true);


--
-- TOC entry 2189 (class 0 OID 0)
-- Dependencies: 192
-- Name: pensamientos_positivos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('pensamientos_positivos_id_seq', 12, true);


--
-- TOC entry 2170 (class 0 OID 16886)
-- Dependencies: 191
-- Data for Name: pensamientospositivos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY pensamientospositivos (id, usuario, imagen) FROM stdin;
6	Miriam	https://cdn.filestackcontent.com/zjwGOTnhSIuztirzpMcj
7	Ernesto	https://cdn.filestackcontent.com/Dn63LiWeTCergMfE2CbT
8	Daniela	https://cdn.filestackcontent.com/hMgijF0pRDSemE58Aqxj
12	soledad	https://cdn.filestackcontent.com/QlevZ3VpSdWnMgcMpBZQ
\.


--
-- TOC entry 2172 (class 0 OID 16894)
-- Dependencies: 193
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuarios (id, usuarioc, codigo, password) FROM stdin;
1	natalia	aea70bd7-b12f-4657-bd42-d8cf8cdfb58d	\N
2	daniela	b25f67bf-a7e1-4b0c-a973-f6fc350d57ac	\N
3	h	\N	\N
4	r	\N	\N
5	g	39350151-3b50-4b7f-9972-666ad44f166d	1111
6	e	a064e3e6-9cf4-4bda-aada-8bf2a329776b	1111
7	soledad	29adf99c-11f5-4c9b-a3f9-9fca7c1750e6	18
8	t	c5c4d294-dae3-466d-bfeb-6809de404ab2	111
\.


--
-- TOC entry 2190 (class 0 OID 0)
-- Dependencies: 194
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('usuarios_id_seq', 8, true);


--
-- TOC entry 2036 (class 2606 OID 16908)
-- Name: centros centros_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY centros
    ADD CONSTRAINT centros_pkey PRIMARY KEY (id);


--
-- TOC entry 2038 (class 2606 OID 16910)
-- Name: contacto contacto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY contacto
    ADD CONSTRAINT contacto_pkey PRIMARY KEY (id);


--
-- TOC entry 2040 (class 2606 OID 16912)
-- Name: experiencias experiencias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY experiencias
    ADD CONSTRAINT experiencias_pkey PRIMARY KEY (id);


--
-- TOC entry 2044 (class 2606 OID 16914)
-- Name: usuarios nombreUsado; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuarios
    ADD CONSTRAINT "nombreUsado" UNIQUE (usuarioc);


--
-- TOC entry 2042 (class 2606 OID 16916)
-- Name: pensamientospositivos pensamientos_positivos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY pensamientospositivos
    ADD CONSTRAINT pensamientos_positivos_pkey PRIMARY KEY (id);


--
-- TOC entry 2046 (class 2606 OID 16918)
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);


-- Completed on 2017-09-27 12:54:04

--
-- PostgreSQL database dump complete
--

