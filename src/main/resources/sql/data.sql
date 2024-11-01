-- Insert Sample Data into Genres Table
INSERT INTO genres (name) VALUES
                              ('Action'),
                              ('Comedy'),
                              ('Drama'),
                              ('Horror'),
                              ('Science Fiction');
-- Insert Sample Data into Persons Table
INSERT INTO persons (first_name, last_name, birth_date, gender) VALUES
                                                                    ('Steven', 'Spielberg', '1946-12-18', 'Male'),
                                                                    ('Christopher', 'Nolan', '1970-07-30', 'Male'),
                                                                    ('Leonardo', 'DiCaprio', '1974-11-11', 'Male'),
                                                                    ('Kate', 'Winslet', '1975-10-05', 'Female'),
                                                                    ('Tom', 'Hanks', '1956-07-09', 'Male');
-- Insert Sample Data into Movies Table
INSERT INTO movies (title, release_year, duration, synopsis, genre_id, director_id) VALUES
                                                                                        ('Inception', 2010, 148, 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.', 5, 2),
                                                                                        ('Titanic', 1997, 195, 'A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.', 3, 1),
                                                                                        ('Saving Private Ryan', 1998, 169, 'Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.', 1, 1);
-- Insert Sample Data into Movie_Actors Table
INSERT INTO movie_actors (movie_id, actor_id, role) VALUES
                                                        (1, 3, 'Dom Cobb'),
                                                        (2, 3, 'Jack Dawson'),
                                                        (2, 4, 'Rose DeWitt Bukater'),
                                                        (3, 5, 'Captain John H. Miller');
-- Insert Sample Data into Users Table
INSERT INTO users (username, email, password_hash) VALUES
                                                       ('john_doe', 'john@example.com', 'hashed_password_1'),
                                                       ('jane_smith', 'jane@example.com', 'hashed_password_2');
-- Insert Sample Data into Reviews Table
INSERT INTO reviews (user_id, movie_id, rating, review_text) VALUES
                                                                 (1, 1, 9, 'Inception is a mind-bending thriller with stunning visuals and a complex plot.'),
                                                                 (1, 2, 8, 'Titanic is a timeless romance with great performances and an unforgettable soundtrack.'),
                                                                 (2, 3, 10, 'Saving Private Ryan is an intense and moving war film with incredible realism.');
-- Verify Data Insertion
SELECT * FROM genres;
SELECT * FROM persons;
SELECT * FROM movies;
SELECT * FROM movie_actors;
SELECT * FROM users;
SELECT * FROM reviews;
-- Verify Views
SELECT * FROM movie_details;
SELECT * FROM actor_details;