--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5
-- Dumped by pg_dump version 11.5

-- Started on 2019-08-22 23:57:36

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2825 (class 0 OID 16396)
-- Dependencies: 197
-- Data for Name: flights; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.flights (id, flight_code, created_at, updated_at, company) FROM stdin;
1201	ar0001	2019-08-22 00:14:44.461	2019-08-22 00:14:44.461	bodair
\.


--
-- TOC entry 2827 (class 0 OID 16406)
-- Dependencies: 199
-- Data for Name: passengers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.passengers (id, name, lastname, seat, created_at, updated_at, flight_code) FROM stdin;
1551	nacho	bosio	a01	2019-08-22 15:06:00.802	2019-08-22 15:06:00.802	ar0001
1552	nacho1	bosio1	a02	2019-08-22 15:06:10.995	2019-08-22 15:06:10.995	ar0001
1553	nacho2	bosio2	a03	2019-08-22 15:06:22.434	2019-08-22 15:06:22.434	ar0001
1554	nacho3	bosio4	a04	2019-08-22 19:07:32.788	2019-08-22 19:07:32.788	ar0001
\.


--
-- TOC entry 2837 (class 0 OID 0)
-- Dependencies: 200
-- Name: flight_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.flight_sequence', 1250, true);


--
-- TOC entry 2838 (class 0 OID 0)
-- Dependencies: 196
-- Name: flights_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.flights_id_seq', 1, false);


--
-- TOC entry 2839 (class 0 OID 0)
-- Dependencies: 201
-- Name: passenger_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.passenger_sequence', 1950, true);


--
-- TOC entry 2840 (class 0 OID 0)
-- Dependencies: 198
-- Name: passengers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.passengers_id_seq', 1, false);


-- Completed on 2019-08-22 23:57:36

--
-- PostgreSQL database dump complete
--

