
@echo off

echo ------------------------------------------------------------------------------------------
echo ------------------------------------------------------------------------------------------
echo ------------------------------------------------------------------------------------------
echo ------------------------------------------------------------------------------------------
echo
echo
echo

docker run --name my-db -p 3306/3306 -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_USER=system -d mysql
echo
echo
echo -------------------------Starting docker mysql container ---------------------------------
echo -------------------------Port for database: 3306 -----------------------------------------
echo -------------------------DB user: root  ------------------------------------------------
echo -------------------------DB password: admin ----------------------------------------------
echo
echo
echo