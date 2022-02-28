drop table CUSTOMER if exists;
drop table PRODUCT if exists;
drop table T_ORDER if exists;
drop table ORDER_ITEM if exists;

create table CUSTOMER
(
    id bigint identity primary key,
    prename   varchar(50),
    surname   varchar(50),
    password  varchar(50),
    birthdate date,
    street    varchar(50),
    streetno  varchar(10),
    zipcode   varchar(5),
    city      varchar(20),
    country   varchar(30),
    iban      varchar(16),
    active    boolean
);

create table PRODUCT
(
    id bigint identity primary key,
    name             varchar(50),
    short_description varchar(50),
    long_description  varchar(4000),
    product_image     varchar(50),
    price            decimal(10,2),
    active           boolean
);

create table T_ORDER
(
    id bigint identity primary key,
    customer_id bigint,
    order_date date,
    order_type integer
);

create table ORDER_ITEM
(
    id bigint identity primary key,
    order_id bigint,
    product_id bigint,
    amount integer,
    price decimal(10,2),
    vat decimal(2,2)
);

