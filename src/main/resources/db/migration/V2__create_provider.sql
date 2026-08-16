CREATE TABLE provider (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    type_provider VARCHAR(50) NOT NULL,
    category_provider_id INT NOT NULL,
    FOREIGN KEY (category_provider_id) REFERENCES category_provider(id)
);

INSERT INTO provider(name, description, type_provider, category_provider_id)
VALUES
    ("Master Barber Shop", "A traditional barber shop offering classic haircuts and grooming services for men", "SERVICE", 1),
    ("Paws & Claws Pet Grooming", "A pet grooming salon providing bathing, trimming, and styling services for dogs and cats", "SERVICE", 2),
    ("FitLife Fitness Center", "A modern fitness center offering personal training, group classes, and wellness programs", "SERVICE", 3),
    ("HealthFirst Medical Clinic", "A comprehensive medical clinic providing general checkups, diagnostics, and specialized healthcare services", "SERVICE", 4),
    ("Bright Minds Tutoring", "An educational service offering tutoring in various subjects for students of all ages", "SERVICE", 5),
    ("Cinema World Entertainment", "An entertainment provider offering movie tickets and event access for the latest films and shows", "SERVICE", 6),
    ("Gourmet Bites Restaurant Reservation", "A reservation service for a wide range of dining establishments, from casual eateries to fine dining restaurants", "SERVICE", 7),
    ("HomeFix Handyman Services", "A home services provider offering repair, maintenance, and improvement services for residential properties", "SERVICE", 8),
    ("AutoCare Automotive Services", "An automotive service provider offering car maintenance, repairs, and diagnostics for all makes and models", "SERVICE", 9),
    ("Glamour Beauty Salon", "A beauty salon providing hair styling, skincare treatments, and makeup services for women", "SERVICE", 10);