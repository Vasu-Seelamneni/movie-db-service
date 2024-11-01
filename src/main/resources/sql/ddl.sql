-- Create Genre Table
CREATE TABLE genres (
    genre_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

-- Create Person Table (for actors, directors, etc.)
CREATE TABLE persons (
    person_id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birth_date DATE,
    gender VARCHAR(10)
);

-- Create Movie Table
CREATE TABLE movies (
    movie_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    release_year INT,
    duration INT, -- Duration in minutes
    synopsis TEXT,
    genre_id INT,
    director_id INT,
    FOREIGN KEY (genre_id) REFERENCES genres (genre_id),
    FOREIGN KEY (director_id) REFERENCES persons (person_id)
);

-- Create Movie_Actor Table (many-to-many relationship between movies and actors)
CREATE TABLE movie_actors (
    movie_id INT,
    actor_id INT,
    role VARCHAR(255),
    PRIMARY KEY (movie_id, actor_id),
    FOREIGN KEY (movie_id) REFERENCES movies (movie_id),
    FOREIGN KEY (actor_id) REFERENCES persons (person_id)
);

-- Create User Table (for users who review movies)
CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create Review Table
CREATE TABLE reviews (
    review_id SERIAL PRIMARY KEY,
    user_id INT,
    movie_id INT,
    rating INT CHECK (rating >= 1 AND rating <= 10),
    review_text TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (movie_id) REFERENCES movies (movie_id)
);

-- Create Indexes for Performance
CREATE INDEX idx_movie_title ON movies (title);
CREATE INDEX idx_person_name ON persons (last_name, first_name);
CREATE INDEX idx_user_username ON users (username);

-- Create Views for Convenience
CREATE VIEW movie_details AS
SELECT 
    m.movie_id,
    m.title,
    m.release_year,
    m.duration,
    m.synopsis,
    g.name AS genre,
    CONCAT(d.first_name, ' ', d.last_name) AS director
FROM movies m
JOIN genres g ON m.genre_id = g.genre_id
JOIN persons d ON m.director_id = d.person_id;

CREATE VIEW actor_details AS
SELECT 
    a.person_id,
    CONCAT(a.first_name, ' ', a.last_name) AS actor_name,
    ma.role,
    m.title AS movie_title
FROM persons a
JOIN movie_actors ma ON a.person_id = ma.actor_id
JOIN movies m ON ma.movie_id = m.movie_id;