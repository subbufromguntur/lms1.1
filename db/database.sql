create table lms_user_credentails (
        user_id integer(10) unsigned auto_increment,
        client_id intiger not null,
        username varchar(255),
        password varchar(255),
        creation_datetime timestamp,
        last_modified_datetime timestamp,
		last_accessed_datetime timestamp,
		bad_try_count integer(2),
		last_passwords_used varchar(500),
		allowed_recent_used_password_count integer(2),
		parent_id integer(2),
		status integer(2),
		macker_comments varchar(1000),
		checker_comments varchar(1000),
		description varchar(255),
        primary key (user_id)
);
insert into lms_user_credentials(client_id,username,password,creation_datetime,status) values(1000,'reward360','reward360',now(),1);

create table lms_user_profile (
        user_id integer(10),
        firstname varchar(255),
        midlename varchar(255),
        lastname varchar(255),
		email_id varchar(30),
		phone_no_1 varchar(30),
		phone_no_2 varchar(30),
		future_1 varchar(255),
		future_2 varchar(255),
	    foreign key (user_id) references lms_user_credentails(user_id)
);

create table lms_user_permission (
        user_id integer(10),
        user_grpup_id integer(10),
        user_permission_list varchar(1000),
        foreign key (user_id) references lms_user_credentails(user_id)
);




