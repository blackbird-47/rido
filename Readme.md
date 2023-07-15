## Local DB Setup
1. Install Postgres 14 server 
```shell
brew install postgresql@14
```
2. If `psql` command is not found then export the postgres bin directory.
3. Create user:
```shell
createuser -s postgres
```
4. Login into the postgres server:
```shell
psql -U <rootUser(generally the system user)> -d postgres
```
5. Create Database:
```shell
CREATE DATABASE rido;
```
6. Exit the psql console:
```shell
exit
```
7. Login into the rido database:
```shell
psql -U <rootUser(generally the system user)> -d rido
```
8. Create the Enums:
```shell
CREATE TYPE RiderIntent AS ENUM ('GOING', 'NOT_GOING');
```
```shell
CREATE TYPE RideStatus AS ENUM ('UPCOMING', 'DELAYED', 'IN_PROGRESS', 'CANCELLED', 'COMPLETED');
```
9. Create the Tables:
```shell
CREATE TABLE Ride(
   id uuid primary key,
   title varchar(40) NOT NULL,
   distance int NOT NULL,
   maxSlots int NOT NULL,
   availableSlots int NOT NULL,
   startTime TIMESTAMPTZ NOT NULL,
   endTime TIMESTAMPTZ NOT NULL,
   durationInHours int NOT NULL,
   hostId uuid NOT NULL,
   source varchar(50) NOT NULL,
   destination varchar(50) NOT NULL,
   bannerURL varchar(100) NOT NULL,
   status RideStatus NOT NULL
   );
```

```shell
CREATE TABLE Rider(
   id uuid primary key,
   name varchar(20) NOT NULL,
   accountCreationDate TIMESTAMPTZ NOT NULL,
   lastLogin TIMESTAMPTZ NOT NULL
   );
```

```shell
CREATE TABLE RiderOnRide(
  rideId uuid,
  riderId uuid,
  riderIntent RiderIntent,
  noShow boolean,
  lastModified TIMESTAMPTZ,
  PRIMARY KEY(rideId, riderId)
  );
```
10. Create the user for app:
```shell
CREATE USER ridoappuser WITH PASSWORD '<enter-password-here>';
```
