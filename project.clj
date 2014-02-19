(defproject davesc "0.1.0"
  :description "Dave's Conservatoire"
  :url ""
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [org.postgresql/postgresql "9.2-1003-jdbc4"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]]

  :plugins [[clj-sql-up "0.3.0"]
            [lein-ring "0.8.10"]]

  :clj-sql-up {:database "jdbc:postgresql://127.0.0.1:5432/davesc?davesc"
               :deps [[org.postgresql/postgresql "9.2-1003-jdbc4"]]}

  :main davesc.core
  :ring {:handler davesc.core/app})
