create table lms_roles (
        role_id int(10),
        group_id int(10),
        name varchar(1000),
        permission_list varchar(1000)
)

insert into lms_roles(role_id, group_id, name, permission_list) values
(1, 9000, 'L1 Admin', '2001,2002,2003,6501'),
(2, 9001, 'L1 User', '2001,2002,2003,6501'),
(3, 9002, 'Program Manager', '2001,2002,2003,6501'),
(4, 9003, 'Bank Admin', '2001,2002,2003,6501')