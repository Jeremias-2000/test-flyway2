create table "public"."produto"(
	id serial primary key,
	descricao text not null,
	quantidade integer not null,
	valor numeric not null,
	status integer default 1,
	categoria_id integer not null references categoria(id)
);


------------------------------------------------------------

create index produto_categoria_id on produto(categoria_id int4_ops);