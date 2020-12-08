INSERT INTO exhibits
VALUES (3, 'Asian Elephant', 7.5);

SELECT * 
FROM exhibits
WHERE ID=3;

SELECT "NAME",NUM_ACRES 
FROM exhibits 
WHERE ID=3;

SELECT COUNT(*), SUM(num_acres) 
FROM exhibits;

UPDATE exhibits 
SET NUM_ACRES = NUM_ACRES + .5 
WHERE NAME = 'Asian Elephant';

DELETE FROM exhibits 
WHERE NAME = 'Asian Elephant';