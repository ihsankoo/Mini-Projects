-- CREATE TABLE users (
--     userid INT NOT NULL AUTO_INCREMENT,
--     name VARCHAR(255),
--     username VARCHAR(20),
--     address VARCHAR(255),
--     city VARCHAR(255),
--     state CHAR(2),
--     zip INT(5),
--     password VARCHAR(255),
--     PRIMARY KEY (userid)
-- );

-- CREATE TABLE locations (
--     itemid INT NOT NULL AUTO_INCREMENT,
--     type INT,
--     description TEXT,
--     lng REAL,
--     lat REAL,
--     PRIMARY KEY (itemid)
-- );

-- CREATE TABLE photographs (
--     photoid INT NOT NULL,
--     locationid INT,
--     PRIMARY KEY (photoid)
-- );

-- ALTER TABLE locations 
-- MODIFY type INT NOT NULL, 
-- MODIFY description TEXT NOT NULL, 
-- MODIFY lng REAL NOT NULL, 
-- MODIFY lat REAL NOT NULL;

-- ALTER TABLE users 
-- MODIFY name VARCHAR(255) NOT NULL, 
-- MODIFY username VARCHAR(20) NOT NULL, 
-- MODIFY password VARCHAR(255) NOT NULL;

-- ALTER TABLE photographs 
-- MODIFY photoid INT NOT NULL, 
-- MODIFY locationid INT NOT NULL;

-- CREATE UNIQUE INDEX photoid_idx ON photographs (photoid); 


-- INSERT INTO users (name, username, address, city, state, zip, password) 
-- VALUES 
-- ('Sam Smarf', 'ssmarf', '356 A Street', 'Beefy', 'PA', 19943, 'swimming'),
-- ('Wendy Grog', 'wgrog', '900 Star Street', 'Mary', 'MD', 21340, 'wells'),
-- ('Joe Jogger', 'jjogger', '183713 N North Street', 'Norther', 'WV', 51423, 'tarts');

-- INSERT INTO users (name, username, address, city, state, zip, password) 
-- VALUES 
-- ('Bonnie Buntcake', 'bbunt', '6709 Wonder Street', 'Wonderbread', 'OH', 46106, 'eclectic');

-- SELECT * FROM users;

-- SELECT count(*) from users;

-- ALTER TABLE photographs 
-- ADD COLUMN userid INT NOT NULL AFTER locationid;

-- ALTER TABLE photographs
-- ADD FOREIGN KEY (userid) REFERENCES users(userid);

-- INSERT INTO locations (type, description, lng, lat)
-- VALUES 
-- (1, 'Independence Hall', 794.35, 651.43),
-- (2, '6709 Wonder Street', 323.41, 412.22),
-- (1, 'Sunrise', 221.45, 132.43),
-- (2, '356 A Street', 123.32, 222.43),
-- (1, 'Mountains', 34.12, 87.99),
-- (2, '900 Star Street', 1071.9, 206.45),
-- (1, 'Moonrise', 816.2, 111.2),
-- (2, '183714 N North Street', 176.11, 11.176);

-- SELECT * FROM locations;

-- INSERT INTO photographs (photoid, locationid, userid)
-- VALUES 
-- (1, 1, 1),  -- 'Independence Hall' location for Bonnie Buntcake
-- (2, 2, 1),  -- '6709 Wonder Street' location for Bonnie Buntcake
-- (3, 3, 3),  -- 'Sunrise' location for Wendy Grog
-- (4, 4, 4);  -- '356 A Street' location for Joe Jogger

-- SELECT * FROM photographs;

-- SELECT name FROM users;

SELECT DISTINCT name 
FROM users 
JOIN photographs ON users.userid = photographs.userid;
