# **Database Specification**
This specification of database is suitable for the scalable internet business.

## I. Basic Specification
1. table storage engine must be `InnoDB`.
2. table character set use `utf8` by default, use `utf8mb4` if necessary.
> *Expaination:*
> - `utf8` is in common use, without the crisis of garbled code, `3Bytes` for Chinese character, `1Byte` for English character.
> - `utf8mb4` is the super set of `utf8`, use it to store emoticons which need `4Bytes`.
3. forbid to use `Procedure`, `View`, `Trigger`, `Event`.
> *Expaination:*
> - it has a greate influence of database performance, do it in web server or business service layer, not in database.
> - it is hard to debugging, troubleshooting, migrating, and with poor expansibility.
4. forbid to save big file in database, put it into the `OSS(Object Storage Service)` and save it's path.
5. forbid to do `stress testing` in database online.
6. must isolate the environment of test, develop and product.

## II. Naming Specification
1. the name of database, table, and column must be `lower-case` letter, seperated with `underline`.
2. the name of database, table, and column must be `seeing knowledge and meaning`, no longer than `32Bytes`.
3. the name of backup database must be prefix with `bak` and suffix with *`date`*.
4. the name of slave database must be suffix with `-s`.
5. the name of backup database must be suffix with `-ss`.

## III. Table Specification
1. you shoud be in control of less than `2000` tables in a single database entity.
2. you shoud be in control of less than `1024` tables in a single sharding table.
3. the table must have primary key, and recommended use the `unsigned int` data type.
4. forbid to use foreign key, it should be implemented by application if need to ensure data integrity.
5. 

## IV. Column Specification


## V. Index Specification

## VI. SQL Specification

## Resources
1. [58Home MySQL Specification](https://mp.weixin.qq.com/s/YfCORbcCX1hymXBCrZbAZg)
