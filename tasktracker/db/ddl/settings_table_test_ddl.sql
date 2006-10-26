
    create table `tasktracker`.`settings`(
        `ID` bigint not null auto_increment,
       `WORK_DAY_MINUTES` int unsigned default '0' not null,
        primary key (`ID`)
    );

    create unique index `PRIMARY` on `tasktracker`.`settings`(`ID`);
    create unique index `ID` on `tasktracker`.`settings`(`ID`);