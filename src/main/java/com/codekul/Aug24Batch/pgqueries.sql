create or replace function fn_get_student_data()
returns table(id_ bigint,address_ character varying,name_ character varying,age_ integer)
language 'plpgsql'
as
$BODY$
BEGIN
return query
select id,address,name,age from student;

END;
$BODY$;

select * from fn_get_student_data()
DROP FUNCTION fn_get_student_data()
select * from student

create or replace function fn_get_student_data(studentAge int)
returns table(id_ bigint,address_ character varying,name_ character varying,age_ integer)
language 'plpgsql'
as
$BODY$
BEGIN
return query
select id,address,name,age from student where age >studentAge;

END;
$BODY$;