# Dave Conservatoire

## About

http://www.daveconservatoire.org/

A free online music school, aiming to provide a world-class music education for everyone.


## Local development
1. Install jdk 7 (http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
2. Install leiningen (http://leiningen.org/#install)
3. Clone this repo
4. run `lein deps` in the root of this repo
5. run `lein ring server` to start dev server
6. optionally install postgres, create davesc user/database, make sure authentication is set up to trust local connections, then run `lein clj-sql-up migrate`
