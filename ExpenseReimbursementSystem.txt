CREATE DATABASE ExpenseReimbursementSystem;
CREATE SCHEMA ers;
CREATE TABLE ers.employees (
id SERIAL NOT NULL,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
password VARCHAR(100) NOT NULL,
manager_id NOT NULL,
CONSTRAINT pk_employee_id PRIMARY KEY (id)
CONSTRAINT fk_manager_id FOREIGN KEY (manager_id) REFERENCECES managers(id)
);
CREATE TABLE ers.reimbursements (
id SERIAL NOT NULL,
employee_id NOT NULL,
manager_id NOT NULL,
status VARCHAR (100) NOT NULL, 
amount NUMERIC NOT NULL,
CONSTRAINT pk_reimbursements_id PRIMARY KEY (id),
CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employees(id),
CONSTRAINT fk_manager_id FOREIGN KEY (manager_id) REFERENCECES managers(id)
};
CREATE TABLE ers.managers (
id SERIAL NOT NULL,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
password VARCHAR(100) NOT NULL,
CONSTRAINT pk_managers_id PRIMARY KEY (id)
)