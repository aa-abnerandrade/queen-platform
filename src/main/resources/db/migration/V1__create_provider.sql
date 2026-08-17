CREATE TABLE provider (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    logo_url VARCHAR(255) NULL,
    type_provider VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO provider (name, description, logo_url, type_provider)
VALUES
    ('Master Barber Shop', 'A traditional barber shop offering classic haircuts and grooming services for men', NULL, 'SERVICE'),
    ('Paws & Claws Pet Grooming', 'A pet grooming salon providing bathing, trimming, and styling services for dogs and cats', NULL, 'SERVICE'),
    ('FitLife Fitness Center', 'A modern fitness center offering personal training, group classes, and wellness programs', NULL, 'SERVICE'),
    ('HealthFirst Medical Clinic', 'A comprehensive medical clinic providing general checkups, diagnostics, and specialized healthcare services', NULL, 'SERVICE'),
    ('Bright Minds Tutoring', 'An educational service offering tutoring in various subjects for students of all ages', NULL, 'SERVICE'),
    ('Cinema World Entertainment', 'An entertainment provider offering movie tickets and event access for the latest films and shows', NULL, 'SERVICE'),
    ('Gourmet Bites Restaurant Reservation', 'A reservation service for a wide range of dining establishments, from casual eateries to fine dining restaurants', NULL, 'SERVICE'),
    ('HomeFix Handyman Services', 'A home services provider offering repair, maintenance, and improvement services for residential properties', NULL, 'SERVICE'),
    ('AutoCare Automotive Services', 'An automotive service provider offering car maintenance, repairs, and diagnostics for all makes and models', NULL, 'SERVICE'),
    ('Glamour Beauty Salon', 'A beauty salon providing hair styling, skincare treatments, and makeup services for women', NULL, 'SERVICE');
