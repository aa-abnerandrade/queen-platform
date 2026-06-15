CREATE TABLE category_offering (
    id INT PRIMARY KEY,
    name_category_offering VARCHAR(255) NOT NULL,
    description_category_offering TEXT
);

INSERT INTO category_offering
(id, name_category_offering, description_category_offering)
VALUES
    (1, "Haircut", "Professional haircutting services for men"),
    (2, "Beard Trim", "Professional beard trimming services"),
    (3, "Pet Shower", "Pet grooming and showering services"),
    (4, "Personal Training", "One-on-one fitness training sessions"),
    (5, "General Checkup", "Comprehensive health checkup services"),
    (6, "Tutoring", "Academic tutoring services for various subjects"),
    (7, "Movie Tickets", "Tickets for movies and entertainment events"),
    (8, "Restaurant Reservation", "Reservation services for dining establishments"),
    (9, "Plumbing Services", "Professional plumbing repair and maintenance services"),
    (10, "Car Maintenance", "Automotive maintenance and repair services");