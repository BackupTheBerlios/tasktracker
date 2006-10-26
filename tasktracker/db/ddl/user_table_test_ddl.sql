
    create table `tasktracker`.`user`(
        `ID` bigint not null auto_increment,
       `SUR_NAME` varchar(25),
       `FAMILY_NAME` varchar(25),
       `SETTINGS_ID` bigint default '0' not null,
        primary key (`ID`)
    );

    create unique index `PRIMARY` on `tasktracker`.`user`(`ID`);
    create unique index `ID` on `tasktracker`.`user`(`ID`);
    create index `SETTINGS_ID` on `tasktracker`.`user`(`ID`);