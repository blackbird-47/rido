## Local DB Setup
1. `brew install postgresql@14`
2. Optional, if `psql` command is not found then export the postgres bin directory  
3. `createuser -s postgres`
4. Login into the postgres server:
    `psql -U <rootUser(generally the system user)> -d postgres`
5. Run the commands as per the document [here](rido%20db%20shit.txt).
