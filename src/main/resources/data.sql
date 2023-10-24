insert into MEDIA_TYPE(type)
values ('music'),
       ('video'),
       ('podcast');

insert into GENRES (genre_name)
values ('Black Metal'),
       ('Crust Punk'),
       ('Thrash Metal'),
       ('Reggae'),
       ('Bachata'),
       ('Culture and Society'),
       ('Sport'),
       ('News'),
       ('Entertainment');

insert into podhosts(genre_id, podhost_name)
values  (3,'Liv och Caroline'),
        (3,'Henrik Eriksson'),
        (3, 'Sveriges Radio'),
        (3, 'Tone Schunnesson');

insert into seasons(podhost_id, season_name, release_date)
VALUES (1, 'Season One', '4-04-2020'),
       (2, 'Season One', '22-05-2021'),
       (3, 'Season One', '29-11-2022'),
       (4, 'Season One', '28-01-2017');

insert into episodes(podhost_id, genre_id, media_type_id, media_name, release_date, season_id, url)
VALUES (1, 6, 3,'Episode 1', '4-04-2020', 1, 'https://open.spotify.com/track/1cQXDosKkPHAZVi7YWYX15'),
       (1, 6, 3,'Episode 2', '5-04-2020', 1, 'https://open.spotify.com/track/3V8k7s6ORTUFYJD7hKRg9O'),
       (1, 6, 3,'Episode 3', '6-04-2020', 1, 'https://open.spotify.com/track/0cxwhfboz5lX2rcxOqzPyb'),
       (1, 6, 3,'Episode 4', '7-04-2020', 1, 'https://open.spotify.com/track/56XB0noQfCYgSyREol4zDg'),
       (1, 6, 3,'Episode 5', '8-04-2020', 1, 'https://open.spotify.com/track/5IuXQQ3qGtKesuMCGpnx3Q'),
       (1, 6, 3,'Episode 6', '9-04-2020', 1, 'https://open.spotify.com/track/2OTHuzzpXnTXnAXJBtr0p5');

insert into episodes(podhost_id, genre_id, media_type_id, media_name, release_date, season_id, url)
VALUES (2, 7, 3,'Episode 1', '22-05-2021', 2, 'https://open.spotify.com/track/1cQXDosKkPHAZVi7YWYX15'),
       (2, 7, 3,'Episode 2', '23-05-2021', 2, 'https://open.spotify.com/track/3V8k7s6ORTUFYJD7hKRg9O'),
       (2, 7, 3,'Episode 3', '24-05-2021', 2, 'https://open.spotify.com/track/0cxwhfboz5lX2rcxOqzPyb'),
       (2, 7, 3,'Episode 4', '25-05-2021', 2, 'https://open.spotify.com/track/56XB0noQfCYgSyREol4zDg'),
       (2, 7, 3,'Episode 5', '26-05-2021', 2, 'https://open.spotify.com/track/5IuXQQ3qGtKesuMCGpnx3Q'),
       (2, 7, 3,'Episode 6', '27-05-2021', 2, 'https://open.spotify.com/track/2OTHuzzpXnTXnAXJBtr0p5');

insert into episodes(podhost_id, genre_id, media_type_id, media_name, release_date, season_id, url)
VALUES (3, 8, 3,'Episode 1', '29-11-2022', 3, 'https://open.spotify.com/track/1cQXDosKkPHAZVi7YWYX15'),
       (3, 8, 3,'Episode 2', '30-11-2022', 3, 'https://open.spotify.com/track/3V8k7s6ORTUFYJD7hKRg9O'),
       (3, 8, 3,'Episode 3', '01-12-2022', 3, 'https://open.spotify.com/track/0cxwhfboz5lX2rcxOqzPyb'),
       (3, 8, 3,'Episode 4', '02-12-2022', 3, 'https://open.spotify.com/track/56XB0noQfCYgSyREol4zDg'),
       (3, 8, 3,'Episode 5', '03-12-2022', 3, 'https://open.spotify.com/track/5IuXQQ3qGtKesuMCGpnx3Q'),
       (3, 8, 3,'Episode 6', '04-12-2022', 3, 'https://open.spotify.com/track/2OTHuzzpXnTXnAXJBtr0p5');

insert into episodes(podhost_id, genre_id, media_type_id, media_name, release_date, season_id, url)
VALUES (4, 9, 3,'Episode 1', '28-01-2017', 4, 'https://open.spotify.com/track/1cQXDosKkPHAZVi7YWYX15'),
       (4, 9, 3,'Episode 2', '29-01-2017', 4, 'https://open.spotify.com/track/3V8k7s6ORTUFYJD7hKRg9O'),
       (4, 9, 3,'Episode 3', '30-01-2017', 4, 'https://open.spotify.com/track/0cxwhfboz5lX2rcxOqzPyb'),
       (4, 9, 3,'Episode 4', '05-02-2017', 4, 'https://open.spotify.com/track/56XB0noQfCYgSyREol4zDg'),
       (4, 9, 3,'Episode 5', '06-02-2017', 4, 'https://open.spotify.com/track/5IuXQQ3qGtKesuMCGpnx3Q'),
       (4, 9, 3,'Episode 6', '07-02-2017', 4, 'https://open.spotify.com/track/2OTHuzzpXnTXnAXJBtr0p5');
