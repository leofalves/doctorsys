CREATE TABLE person (
    id                NUMBER NOT NULL AUTO_INCREMENT,
    name              VARCHAR2(100),
    birth             DATE,
    document_number   NUMBER,
    document_type_id  NUMBER NOT NULL
);