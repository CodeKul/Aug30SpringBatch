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

select * from patient_info --registration --basic info of patient
select * from patient_visit --visit       -- multiple visits

select * from bill    -- bill against visit
select * from bill_info -- bill services

select * from payment   -- payment against bill
select * from payment_info  -- how he/she is paying the bill amount

select sum(total_amount),concat(pv.first_name,' ',pv.last_name)
from bill b inner join patient_visit pv on pv.id = b.patient_visit_id
where b.bill_date::date =current_date group by concat(pv.first_name,' ',pv.last_name)
having sum(total_amount)>100

select bi.total_amount,concat(pv.first_name,' ',pv.last_name)
from bill b
         inner join bill_info bi on bi.bill_id = b.id
         inner join patient_visit pv on pv.id = b.patient_visit_id
where b.bill_date::date = current_date