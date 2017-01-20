JAVA-PetStore Example in grails
=========================================

Java-Petstore: http://www.oracle.com/technetwork/java/petstore1-3-1-02-139690.html


DB-Create statements of the Java example

```
create table category (catid char(10) not null,
          constraint pk_category primary key (catid))
;

create table category_details (catid char(10) not null,
          name varchar(80) not null, image varchar(255) null,
          descn varchar(255) null, locale char(10) not null,
          constraint pk_category_details primary key (catid, locale),
            constraint fk_category_details_1 foreign key (catid)
            references category (catid))
;
create table product (
          productid char(10) not null,
          catid char(10) not null,
          constraint pk_product primary key (productid),
            constraint fk_product_1 foreign key (catid)
            references category (catid))
;
create table product_details (
          productid char(10) not null,
          locale char(10) not null,
          name varchar(80) not null,
          image varchar(255) null,
          descn varchar(255) null,
          constraint pk_product_details primary key (productid, locale),
            constraint fk_product_details_1 foreign key (productid)
            references product (productid))
;      
create table item (
          itemid char(10) not null,
          productid char(10) not null,
          constraint pk_item primary key (itemid),
            constraint fk_item_1 foreign key (productid)
            references product (productid)
        )
;
create table item_details (
          itemid char(10) not null,
          listprice decimal(10,2) not null,
          unitcost decimal(10,2) not null,
          locale char(10) not null,
          image char(255) not null,
          descn varchar(255) not null,
          attr1 varchar(80) null,
          attr2 varchar(80) null,
          attr3 varchar(80) null,
          attr4 varchar(80) null,
          attr5 varchar(80) null,
          constraint pk_item_details primary key (itemid, locale),
              constraint fk_item_details_1 foreign key (itemid)
              references item (itemid)
        )
;
```
