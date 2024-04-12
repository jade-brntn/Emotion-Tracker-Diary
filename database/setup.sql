CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL
);

CREATE TABLE questions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    text TEXT NOT NULL
);

CREATE TABLE responses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    question_id BIGINT,
    text TEXT,
    sentiment_score DOUBLE,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (question_id) REFERENCES questions(id)
);
