create table dictionar_valute
(
    cod_valuta      varchar(50) check (LENGTH(cod_valuta) = 3 ) primary key,
    denumire_valuta varchar(255) NOT NULL,
    flag           varchar(255)
);

create table curs_valutar
(
    id_cursvalutar serial primary key ,
    cod_valuta     varchar(50) check (LENGTH(cod_valuta) = 3 ) not null,
    rata          int   ,
    curs          float    not null,
    data  date not null default CURRENT_DATE,
    unique (cod_valuta, data),
    foreign key (cod_valuta)
        references dictionar_valute (cod_valuta)
);

create table schimb_valutar
(
    id_schimbvalutar serial primary key,
    cod_valuta        varchar(50) check (LENGTH(cod_valuta) = 3 ) not null,
    curs_schimb       float    not null,
    suma_primita      float    not null,
    suma_eliberata    float    not null,
    foreign key (cod_valuta)
        references dictionar_valute (cod_valuta)
);

create table numerar
(
    id_numerar serial primary key,
    utilizator varchar(255) unique,
    cod_valuta  varchar(50) check (LENGTH(cod_valuta) = 3 ) not null,
    suma       float    not null,
    data       date,
    foreign key (cod_valuta)
        references dictionar_valute (cod_valuta)
);

create table angajati
(
    id_angajat serial primary key,
    nume       varchar(255) not null,
    prenume    varchar(255) not null,
    varsta     int
);