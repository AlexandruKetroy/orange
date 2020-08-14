insert into dictionar_valute(cod_valuta, denumire_valuta, flag)
values ('USD', 'Dolar', 'USA'),
       ('EUR', 'Euro', 'Europa'),
       ('RUB', 'Rubla ruseasca', 'Russia'),
       ('RON', 'Ron', 'Romania'),
       ('UAH', 'Hrivna', 'Ucraina'),
       ('KZT', 'Leu kazakhstan','Kazakhstan'),
       ('JPY','Yen','Japonia');

insert into angajati(nume, prenume, varsta)
values ('Cojacaru', 'Dumitru', 29),
       ('Rotaru', 'Diano', 25),
       ('Olegov', 'Oleg', 39);

insert into curs_valutar(cod_valuta, rata, curs)
values ('EUR', 1, 19.78),
       ('USD', 1, 16.70),
       ('RUB', 1, 0.22),
       ('RON', 1, 4.09),
       ('UAH', 1, 0.61);

insert into numerar(utilizator, cod_valuta, suma, data)
values ('user1', 'UAH', 10, '2020-08-14'),
       ('user2', 'USD', 150, '2020-08-14'),
       ('user3', 'RON', 50, '2020-08-14');

insert into schimb_valutar(cod_valuta, curs_schimb, suma_primita, suma_eliberata)
values ('USD', 16.70, 100, 1670),
       ('RON', 4.09, 50, 204.5),
       ('RUB', 0.22, 50, 11);