create table IF NOT EXISTS ANIMAL_INS
(
    ANIMAL_ID        VARCHAR(255) NOT NULL,
    ANIMAL_TYPE      VARCHAR(255) NOT NULL,
    DATETIME         DATETIME     NOT NULL,
    INTAKE_CONDITION VARCHAR(255) NOT NULL,
    NAME             VARCHAR(255) NULL,
    SEX_UPON_INTAKE  VARCHAR(255) NOT NULL
);

# 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요.
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID