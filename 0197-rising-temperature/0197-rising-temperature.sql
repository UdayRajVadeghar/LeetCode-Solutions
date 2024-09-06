SELECT id
FROM Weather w1
WHERE temperature > (
    SELECT temperature
    FROM Weather w2
    WHERE DATEdiff(w1.recordDate , w2.recordDate) = 1
);