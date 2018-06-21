# **Database (MySQL) Specification**
This Specification is suitable for the Scalable Internet Business.

## I. Basic Specification
1. table storage engine must be `InnoDB`
2. table character set use `utf8` by default, use `utf8mb4` if necessary
> *Expaination:*
> - `utf8` is in common use, without the crisis of garbled code, `3Bytes` for Chinese character, `1Byte` for English character
> - `utf8mb4` is the super set of `utf8`, use it to store emoticons which need `4Bytes`

3. no use `Procedure`, `View`, `Trigger`, `Event`


## II. Naming Specification

## III. Table Specification

## IV. Column Specification

## V. Index Specification

## VI. SQL Specification

## Resources
1. [58Home MySQL Specification](https://mp.weixin.qq.com/s/YfCORbcCX1hymXBCrZbAZg)
