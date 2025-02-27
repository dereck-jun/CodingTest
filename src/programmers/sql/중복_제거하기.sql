create table IF NOT EXISTS ANIMAL_INS
(
    ANIMAL_ID        VARCHAR(255) NOT NULL,
    ANIMAL_TYPE      VARCHAR(255) NOT NULL,
    DATETIME         DATETIME     NOT NULL,
    INTAKE_CONDITION VARCHAR(255) NOT NULL,
    NAME             VARCHAR(255) NULL,
    SEX_UPON_INTAKE  VARCHAR(255) NOT NULL
);

# 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문을 작성해주세요.
# 이때 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.
SELECT COUNT(DISTINCT NAME) AS 'count'
FROM ANIMAL_INS
WHERE NAME IS NOT NULL