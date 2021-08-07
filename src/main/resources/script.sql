create table client (id bigint not null auto_increment, nom varchar(255), primary key (id)) engine=InnoDB;
create table facture (id bigint not null auto_increment, date_creation datetime(6), date_echeance datetime(6), client_id bigint, primary key (id)) engine=InnoDB;
create table ligne_facture (id bigint not null auto_increment, quantite float not null, remise float, facture_id bigint, prestation_id bigint, primary key (id)) engine=InnoDB;
create table prestation (id bigint not null auto_increment, montant float, nom varchar(255), primary key (id)) engine=InnoDB;
alter table facture add constraint FKkimq62662qs9wrpfvsw8mcnvf foreign key (client_id) references client (id);
alter table ligne_facture add constraint FKsqu9tafl4p72j8lym8xl42kg1 foreign key (facture_id) references facture (id);
alter table ligne_facture add constraint FKccde0jfbcj0082890w31n19rt foreign key (prestation_id) references prestation (id);
