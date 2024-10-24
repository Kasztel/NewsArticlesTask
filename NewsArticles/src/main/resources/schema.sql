CREATE TABLE cities (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE news (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      content TEXT NOT NULL,
                      date DATE NOT NULL,
                      city_name VARCHAR(255) NOT NULL,
                      FOREIGN KEY (city_name) REFERENCES cities(name)
);
