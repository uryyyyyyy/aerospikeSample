
## start aerospike server

/usr/bin/asd

## client

/usr/bin/cli

cli -o set -k server01 -v "This is my hostname"

cli -o get -k server01
