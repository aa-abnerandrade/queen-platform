CREATE TABLE offering (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    provider_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_offering_provider FOREIGN KEY (provider_id) REFERENCES provider(id)
);

INSERT INTO offering (name, description, price, provider_id)
VALUES
    ('Classic Haircut', 'A traditional haircut for men, including a wash and styling.', 35.00, 1),
    ('Beard Trim', 'Professional beard trimming and shaping service.', 25.00, 1),
    ('Pet Shower', 'A complete grooming and showering service for pets.', 40.00, 2),
    ('Personal Training Session', 'One-on-one fitness training session with a certified trainer.', 90.00, 3),
    ('General Health Checkup', 'Comprehensive health checkup including blood tests and physical examination.', 150.00, 4),
    ('Tutoring Session', 'Academic tutoring session for various subjects.', 60.00, 5),
    ('Movie Ticket', 'Ticket for a movie screening at the cinema.', 24.50, 6),
    ('Restaurant Reservation', 'Reservation service for dining at a selected restaurant.', 30.00, 7),
    ('Plumbing Service', 'Professional plumbing repair and maintenance service.', 120.00, 8),
    ('Car Maintenance Service', 'Automotive maintenance and repair service for vehicles.', 180.00, 9);
