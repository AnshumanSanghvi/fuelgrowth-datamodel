drop table if exists account CASCADE;
drop table if exists category CASCADE;
drop table if exists po_billing_loc CASCADE;
drop table if exists po_sale_info CASCADE;
drop table if exists po_shipping_loc CASCADE;
drop table if exists product CASCADE;
drop table if exists product_category_map CASCADE;
drop table if exists product_variant CASCADE;
drop table if exists purchase_order CASCADE;
drop table if exists supplier CASCADE;

create table account (
                           omni_id bigint not null,
                           business_name varchar(255),
                           contact_number varchar(255),
                           `name` varchar(255),
                           primary_email varchar(255),
                           secondary_email varchar(255),
                           primary key (omni_id)
);

create table category (
                          omni_id bigint not null,
                          `name` varchar(255),
                          primary key (omni_id)
);


create table po_billing_loc (
                                city varchar(255),
                                country varchar(255),
                                region varchar(255),
                                state varchar(255),
                                omni_id bigint not null,
                                primary key (omni_id)
);


create table po_sale_info (
                              omni_id bigint not null,
                              primary key (omni_id)
);


create table po_shipping_loc (
                                 city varchar(255),
                                 country varchar(255),
                                 region varchar(255),
                                 state varchar(255),
                                 omni_id bigint not null,
                                 primary key (omni_id)
);


create table product (
                         omni_id bigint not null,
                         description varchar(255),
                         manufacturing_time timestamp,
                         mrp double,
                         `name` varchar(255),
                         sku varchar(255),
                         primary key (omni_id)
);


create table product_category_map (
                                      product_id bigint not null,
                                      category_id bigint not null
);


create table product_variant (
                                 var_name varchar(255),
                                 var_sku varchar(255),
                                 omni_id bigint not null,
                                 primary key (omni_id)
);


create table purchase_order (
                                omni_id bigint not null,
                                sale_channel integer,
                                sale_id bigint,
                                sale_type integer,
                                account_order_id bigint,
                                global_order_id bigint,
                                `date` timestamp,
                                account_id bigint,
                                product_id bigint,
                                supplier_id bigint,
                                primary key (omni_id)
);


create table supplier (
                          omni_id bigint not null,
                          `name` varchar(255),
                          primary key (omni_id)
);


-- alter table po_billing_loc
--     add constraint FKr09b7ojdnccu5l2u8gy1cgw1v
--         foreign key (omni_id)
--             references purchase_order


-- alter table po_sale_info
--     add constraint FKqx9932m700n7idq7agjdxwmu0
--         foreign key (omni_id)
--             references purchase_order


-- alter table po_shipping_loc
--     add constraint FK592g8ct687w6n0fd0oj3knwt2
--         foreign key (omni_id)
--             references purchase_order


-- alter table product_category_map
--     add constraint FKhwtybj5fvpnacq4fa2umrpgm6
--         foreign key (category_id)
--             references category


-- alter table product_category_map
--     add constraint FKjhqdnyudi7d7qe21spc6arn03
--         foreign key (product_id)
--             references product


-- alter table product_variant
--     add constraint FKhy9eiu8227k08qmg9063408r
--         foreign key (omni_id)
--             references product


-- alter table purchase_order
--     add constraint FK6qpfcwhehfb14es2avjemvpwl
--         foreign key (account_id)
--             references account


-- alter table purchase_order
--     add constraint FKorudvkngcr1iy3dkrnfqxgy6n
--         foreign key (product_id)
--             references product


-- alter table purchase_order
--     add constraint FK4traogu3jriq9u7e8rvm86k7i
--         foreign key (supplier_id)
--             references supplier