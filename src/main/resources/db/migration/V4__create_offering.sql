CREATE TABLE offering (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  category_offering_id BIGINT NOT NULL,
  provider_id BIGINT NOT NULL,
);

INSERT INTO offering (name, description, category_offering_id, provider_id)
VALUES
  ("Classic Haircut", "A traditional haircut for men, including a wash and styling.", 1, 1),
  ("Beard Trim", "Professional beard trimming and shaping service.", 1, 1),
  ("Pet Shower", "A complete grooming and showering service for pets.", 2, 2),
  ("Personal Training Session", "One-on-one fitness training session with a certified trainer.", 3, 3),
  ("General Health Checkup", "Comprehensive health checkup including blood tests and physical examination.", 4, 4),
  ("Tutoring Session", "Academic tutoring session for various subjects.", 5, 5),
  ("Movie Ticket", "Ticket for a movie screening at the cinema.", 6, 6),
  ("Restaurant Reservation", "Reservation service for dining at a selected restaurant.", 7, 7),
  ("Plumbing Service", "Professional plumbing repair and maintenance service.", 8, 8),
  ("Car Maintenance Service", "Automotive maintenance and repair service for vehicles.", 9, 9);