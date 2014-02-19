(ns davesc.db
  (:require [clojure.java.jdbc :as j]
            [clojure.java.jdbc.sql :as s]))

(def db {:subprotocol "postgresql"
         :subname "test"
         :user "slackz"
         :password ""})

;; (j/with-connection db
;;   (j/create-table :foo [:name "string"]))
